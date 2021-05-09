package com.josh.smartkettlebell.db;

import android.provider.BaseColumns;

public class MyContract {
    public static final String DATABASE_NAME = "motion_data.db";

    public static final class DataEntry implements BaseColumns {
        public static final String TABLE_NAME = "Data";

        public static final String COLUMN_RECORD_ID = "RecordID";
        public static final String COLUMN_TIMESTAMP = "TimeStamp";
        public static final String COLUMN_ACC_X = "AccX";
        public static final String COLUMN_ACC_Y = "AccY";
        public static final String COLUMN_ACC_Z = "AccZ";
        public static final String COLUMN_GYR_X = "GyrX";
        public static final String COLUMN_GYR_Y = "GyrY";
        public static final String COLUMN_GYR_Z = "GyrZ";
        public static final String COLUMN_MAG_X = "MagX";
        public static final String COLUMN_MAG_Y = "MagY";
        public static final String COLUMN_MAG_Z = "MagZ";
        public static final String COLUMN_FACC_X = "FAccX";
        public static final String COLUMN_FACC_Y = "FAccY";
        public static final String COLUMN_FACC_Z = "FAccZ";
        public static String[] COLUMNS_DATA = new String[]{//12 columns
                COLUMN_ACC_X,
                COLUMN_ACC_Y,
                COLUMN_ACC_Z,
                COLUMN_GYR_X,
                COLUMN_GYR_Y,
                COLUMN_GYR_Z,
                COLUMN_MAG_X,
                COLUMN_MAG_Y,
                COLUMN_MAG_Z,
                COLUMN_FACC_X,
                COLUMN_FACC_Y,
                COLUMN_FACC_Z
        };
    }

    public static final class RecordEntry implements BaseColumns {
        public static final String TABLE_NAME = "Record";

        public static final String COLUMN_TRAINING_ID = "TrainingID";
        public static final String COLUMN_EXERCISE_NAME = "ExerciseName";
        public static final String COLUMN_TIMESTAMP = "Timestamp";
        public static final String COLUMN_NUMBER = "Number";
    }

    public static final class TrainingEntry implements BaseColumns{
        public static final String TABLE_NAME = "Training";

        public static final String COLUMN_DATE = "Date";
        public static final String COLUMN_DURATION = "Duration";
    }
}
