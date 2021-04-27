package com.josh.smartkettlebell.util;

public class Decoder {
    public static float[] decodeMotionData(byte[] rawData){
        if(rawData.length != 18)
            return null;
        float accx,accy,accz;
        float gyrx,gyry,gyrz;
        float magx,magy,magz;
        gyrx = convertGyr(mergeBytes(rawData[1],rawData[0]));
        gyry = convertGyr(mergeBytes(rawData[3],rawData[2]));
        gyrz = convertGyr(mergeBytes(rawData[5],rawData[4]));

        int range = 2;
        accx = convertAcc(mergeBytes(rawData[7],rawData[6]),range);
        accy = convertAcc(mergeBytes(rawData[9],rawData[8]),range);
        accz = convertAcc(mergeBytes(rawData[11],rawData[10]),range);

        magy =   convertMag(mergeBytes(rawData[13],rawData[12])); // 磁力計的方向跟別人不一樣
        magx =   convertMag(mergeBytes(rawData[15],rawData[14])); // x 跟 y 交換
        magz = - convertMag(mergeBytes(rawData[17],rawData[16])); // z 反向


        return new float[]{accx,accy,accz,
                            gyrx,gyry,gyrz,
                            magx,magy,magz};
    }
    private static int mergeBytes(byte a, byte b){
        /*
        a = 0x80
        b = 0x81
        return 0x00008081
         */
        return (short)(((a&0xff)<<8)|(b&0xff));//cast to short to auto change sign ,if a is negative
    }
    private static float convertAcc(int a,int range){
        return a/65536f*range*2;//+-range
    }
    private static float convertGyr(int a){
        return a/65536f*500;//+-250
    }
    private static float convertMag(int a){
        return a/65536f*9600;//+-4000
    }
}
