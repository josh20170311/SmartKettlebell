package com.josh.smartkettlebell.util;

import ai.djl.ndarray.NDArray;
import ai.djl.ndarray.NDManager;

public class Feature {

    public static double[] getFeature_6axis(double[] accx, double[] accy, double[] accz,
                                            double[] gyrx, double[] gyry, double[] gyrz) {
        double[] features_acc = getFeature_3axis(accx, accy, accz);
        double[] features_gyr = getFeature_3axis(gyrx, gyry, gyrz);
        double[] result = new double[features_acc.length * 2];

        System.arraycopy(features_acc, 0, result, 0, features_acc.length);
        System.arraycopy(features_gyr, 0, result, features_acc.length, features_acc.length);

        return result;
    }

    public static double[] getFeature_3axis(double[] x, double[] y, double[] z) {

        double[] features_x = getFeatures(x);
        double[] features_y = getFeatures(y);
        double[] features_z = getFeatures(z);

        double cor_xy = pearson_correlation(x, y);
        double cor_xz = pearson_correlation(x, z);
        double cor_yz = pearson_correlation(y, z);

        double[] result = new double[features_x.length * 3 + 3];

        System.arraycopy(features_x, 0, result, 0, features_x.length);
        System.arraycopy(features_y, 0, result, features_x.length, features_x.length);
        System.arraycopy(features_z, 0, result, features_x.length * 2, features_x.length);
        result[result.length - 3] = cor_xy;
        result[result.length - 2] = cor_xz;
        result[result.length - 1] = cor_yz;
        return result;
    }

    public static double[] getFeatures(double[] data) {

        try (NDManager manager = NDManager.newBaseManager()) {
            NDArray array = manager.create(data);
            NDArray sorted = array.sort();
            long size = array.size();

            double p5 = percentile(sorted, 5);
            double p10 = percentile(sorted, 10);
            double p25 = percentile(sorted, 25);
            double p50 = percentile(sorted, 50);
            double p90 = percentile(sorted, 90);

            double mean = array.mean().getDouble();
            double var = array.sub(mean).square().sum().div(size).getDouble();
            double std = Math.sqrt(var);

            double energy = array.sub(mean).square().sum().getDouble();

            return new double[]{p5, p10, p25, p50, p90, mean, var, std, energy};
        }
    }


    private static double percentile(NDArray array, int p) {
        //linear interpolate
        long size = array.size();
        double rank = (p / 100.0) * (size - 1);
        long rank_i = (long) Math.floor(rank);
        double rank_f = rank - rank_i;
        double xi = array.getDouble(rank_i);
        double xj = (p == 100) ? xi : array.getDouble(rank_i + 1); // j = i+1
        return array.getDouble(rank_i) + rank_f * (xj - xi);
    }

    private static double pearson_correlation(double[] x, double[] y) {
        try (NDManager manager = NDManager.newBaseManager()) {
            int size = x.length;
            NDArray array_x = manager.create(x);
            NDArray array_y = manager.create(y);
            double mean_x = array_x.mean().getDouble();
            double mean_y = array_y.mean().getDouble();
            NDArray sub_mean_x = array_x.sub(mean_x);
            NDArray sub_mean_y = array_y.sub(mean_y);
            NDArray smx_mul_smy = sub_mean_x.mul(sub_mean_y);
            double sum_sms = smx_mul_smy.sum().getDouble();
            double std_x = sub_mean_x.square().sum().sqrt().getDouble();
            double std_y = sub_mean_y.square().sum().sqrt().getDouble();
            return sum_sms / std_x / std_y;
        }

    }
}
