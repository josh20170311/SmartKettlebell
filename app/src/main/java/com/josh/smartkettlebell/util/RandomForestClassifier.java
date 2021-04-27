package com.josh.smartkettlebell.util;

public class RandomForestClassifier {
    public static int predict_0(double[] features) {
        int[] classes = new int[6];

        if (features[31] <= -71.32034301757812) {
            classes[0] = 0;
            classes[1] = 39;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[47] <= 803933.5234375) {
                if (features[36] <= 161.29534912109375) {
                    if (features[16] <= 0.01568066142499447) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 15;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 26;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[15] <= 0.002580892061814666) {
                        classes[0] = 3;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 35;
                        classes[5] = 0;
                    } else {
                        classes[0] = 20;
                        classes[1] = 3;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 34;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_1(double[] features) {
        int[] classes = new int[6];

        if (features[15] <= 0.017867480404675007) {
            if (features[26] <= 0.02028799243271351) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 21;
            } else {
                if (features[4] <= -0.2408447265625) {
                    if (features[38] <= 16153.75537109375) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 19;
                        classes[1] = 2;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 26;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 32;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            if (features[58] <= -0.02285774052143097) {
                classes[0] = 0;
                classes[1] = 51;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[18] <= -0.3976989686489105) {
                    classes[0] = 0;
                    classes[1] = 1;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_2(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 705332.703125) {
            if (features[2] <= -1.3818359375) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 29;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[0] <= -1.046032726764679) {
                    if (features[50] <= -7.1849822998046875) {
                        classes[0] = 17;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 10;
                        classes[4] = 32;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 22;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 64;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_3(double[] features) {
        int[] classes = new int[6];

        if (features[2] <= -1.367218017578125) {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 43;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[15] <= 0.014467575121670961) {
                if (features[34] <= 14.7216796875) {
                    if (features[55] <= 2.028333991765976) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 18;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 28;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                } else {
                    if (features[20] <= -0.026611328125) {
                        classes[0] = 12;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 4;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 30;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[28] <= -0.21181169897317886) {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 37;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_4(double[] features) {
        int[] classes = new int[6];

        if (features[47] <= 1127668.625) {
            if (features[38] <= 607819.765625) {
                if (features[16] <= 0.015111319720745087) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 22;
                } else {
                    if (features[31] <= -12.246322631835938) {
                        classes[0] = 18;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 4;
                        classes[4] = 33;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 26;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 36;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 38;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_5(double[] features) {
        int[] classes = new int[6];

        if (features[55] <= 34.65354537963867) {
            if (features[6] <= 0.21473342552781105) {
                if (features[37] <= 12.547910690307617) {
                    if (features[40] <= -2.4990081787109375) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 26;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 12;
                    }
                } else {
                    if (features[55] <= 11.792274951934814) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 31;
                        classes[5] = 0;
                    } else {
                        classes[0] = 18;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 35;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[36] <= 6619.478515625) {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 52;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_6(double[] features) {
        int[] classes = new int[6];

        if (features[37] <= 69.14303779602051) {
            if (features[8] <= 25.032249450683594) {
                if (features[31] <= -16.695404052734375) {
                    if (features[30] <= -42.99201965332031) {
                        classes[0] = 14;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 2;
                        classes[5] = 0;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 23;
                        classes[5] = 0;
                    }
                } else {
                    if (features[17] <= 0.032343796687200665) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 14;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 36;
                        classes[4] = 7;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 27;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 50;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_7(double[] features) {
        int[] classes = new int[6];

        if (features[31] <= -75.4119873046875) {
            classes[0] = 0;
            classes[1] = 35;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[7] <= 0.5158515870571136) {
                if (features[0] <= -1.046032726764679) {
                    if (features[38] <= 17187.958984375) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 25;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 26;
                        classes[1] = 1;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 35;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 19;
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 34;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_8(double[] features) {
        int[] classes = new int[6];

        if (features[32] <= -45.447349548339844) {
            classes[0] = 0;
            classes[1] = 45;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[6] <= 0.26826927065849304) {
                if (features[38] <= 1063.0870332717896) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 22;
                } else {
                    if (features[32] <= -7.884979248046875) {
                        classes[0] = 17;
                        classes[1] = 2;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 25;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 2;
                        classes[2] = 0;
                        classes[3] = 28;
                        classes[4] = 2;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 32;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_9(double[] features) {
        int[] classes = new int[6];

        if (features[17] <= 1.7391574382781982) {
            if (features[8] <= 23.992416381835938) {
                if (features[25] <= 0.012512785848230124) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 31;
                } else {
                    if (features[37] <= 12.706914901733398) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 22;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 4;
                        classes[4] = 21;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 32;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[38] <= 690141.359375) {
                classes[0] = 2;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 42;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_10(double[] features) {
        int[] classes = new int[6];

        if (features[6] <= 0.26998089253902435) {
            if (features[55] <= 30.40019130706787) {
                if (features[31] <= -3.507232666015625) {
                    if (features[32] <= -7.521629333496094) {
                        classes[0] = 18;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 32;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 24;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 23;
                }
            } else {
                classes[0] = 0;
                classes[1] = 43;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 36;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_11(double[] features) {
        int[] classes = new int[6];

        if (features[17] <= 1.321018636226654) {
            if (features[55] <= 1.9066492021083832) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 24;
            } else {
                if (features[3] <= -1.01055908203125) {
                    if (features[0] <= -1.561987280845642) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 26;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 12;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[37] <= 12.387097835540771) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 17;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 7;
                        classes[1] = 0;
                        classes[2] = 2;
                        classes[3] = 3;
                        classes[4] = 35;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            if (features[55] <= 32.144535064697266) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 2;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 48;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_12(double[] features) {
        int[] classes = new int[6];

        if (features[37] <= 77.68351745605469) {
            if (features[47] <= 702062.90625) {
                if (features[10] <= -0.0758056640625) {
                    if (features[30] <= -15.725517272949219) {
                        classes[0] = 30;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 0;
                        classes[5] = 5;
                    }
                } else {
                    if (features[30] <= -19.747543334960938) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 41;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 17;
                        classes[4] = 0;
                        classes[5] = 7;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 31;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 40;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_13(double[] features) {
        int[] classes = new int[6];

        if (features[47] <= 1024770.75) {
            if (features[38] <= 661947.859375) {
                if (features[41] <= -1.2636184692382812) {
                    if (features[24] <= 0.0016377850552089512) {
                        classes[0] = 4;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 31;
                        classes[5] = 0;
                    } else {
                        classes[0] = 12;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 28;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 20;
                }
            } else {
                classes[0] = 0;
                classes[1] = 38;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 42;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_14(double[] features) {
        int[] classes = new int[6];

        if (features[54] <= 1161.5552368164062) {
            if (features[45] <= 7010.35693359375) {
                if (features[2] <= -1.012176513671875) {
                    if (features[12] <= -0.019287109375) {
                        classes[0] = 21;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 3;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 22;
                        classes[4] = 25;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 30;
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 36;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[25] <= 0.09106900915503502) {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 38;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_15(double[] features) {
        int[] classes = new int[6];

        if (features[1] <= -1.611193835735321) {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 36;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[52] <= 38.97819519042969) {
                if (features[24] <= 0.0019693486392498016) {
                    if (features[16] <= 0.01705131772905588) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 18;
                    } else {
                        classes[0] = 9;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 30;
                        classes[5] = 0;
                    }
                } else {
                    if (features[39] <= -35.045433044433594) {
                        classes[0] = 5;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 27;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[0] <= -1.704388439655304) {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 48;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_16(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 607819.765625) {
            if (features[39] <= -142.3999786376953) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 28;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[36] <= 10.879867553710938) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 21;
                } else {
                    if (features[31] <= -16.582489013671875) {
                        classes[0] = 20;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 38;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 22;
                        classes[4] = 3;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 45;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_17(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 705332.703125) {
            if (features[17] <= 0.25808919966220856) {
                if (features[55] <= 2.028333991765976) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 20;
                } else {
                    if (features[34] <= 11.92779541015625) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 19;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 3;
                        classes[3] = 1;
                        classes[4] = 33;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[1] <= -1.62921142578125) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 32;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    if (features[11] <= -0.020538330078125) {
                        classes[0] = 21;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 4;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 41;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_18(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 607819.765625) {
            if (features[45] <= 8745.852172851562) {
                if (features[37] <= 2.6315824389457703) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 22;
                } else {
                    if (features[32] <= -9.37652587890625) {
                        classes[0] = 22;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 20;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 33;
                        classes[4] = 4;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 23;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 53;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_19(double[] features) {
        int[] classes = new int[6];

        if (features[16] <= 0.132119283080101) {
            if (features[41] <= -25.87127685546875) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 31;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[37] <= 13.19178581237793) {
                    if (features[48] <= -1.9266128540039062) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 28;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 20;
                    }
                } else {
                    if (features[24] <= 0.0016377850552089512) {
                        classes[0] = 3;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 29;
                        classes[5] = 0;
                    } else {
                        classes[0] = 12;
                        classes[1] = 1;
                        classes[2] = 4;
                        classes[3] = 1;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 46;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_20(double[] features) {
        int[] classes = new int[6];

        if (features[48] <= -43.69926452636719) {
            if (features[31] <= -75.4119873046875) {
                classes[0] = 0;
                classes[1] = 46;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[43] <= 58.3404541015625) {
                    classes[0] = 4;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 1;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            if (features[39] <= -135.61553955078125) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 28;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[54] <= 6.377985194325447) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 22;
                } else {
                    if (features[12] <= -0.01885986328125) {
                        classes[0] = 18;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 14;
                        classes[4] = 42;
                        classes[5] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_21(double[] features) {
        int[] classes = new int[6];

        if (features[15] <= 0.017456721514463425) {
            if (features[46] <= 82.14946556091309) {
                if (features[37] <= 12.788187026977539) {
                    if (features[24] <= 0.0007660155242774636) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 15;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 25;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[15] <= 0.002527743927203119) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 43;
                        classes[5] = 0;
                    } else {
                        classes[0] = 14;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 33;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[2] <= -1.3065185546875) {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 44;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_22(double[] features) {
        int[] classes = new int[6];

        if (features[54] <= 1161.5552368164062) {
            if (features[45] <= 7010.35693359375) {
                if (features[15] <= 0.00030716994660906494) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 22;
                } else {
                    if (features[9] <= -0.10609130933880806) {
                        classes[0] = 29;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 2;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 17;
                        classes[4] = 22;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 37;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[27] <= 0.7321160435676575) {
                classes[0] = 0;
                classes[1] = 45;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_23(double[] features) {
        int[] classes = new int[6];

        if (features[37] <= 66.0455493927002) {
            if (features[2] <= -1.328704833984375) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 31;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[40] <= -2.90069580078125) {
                    if (features[15] <= 0.002584102679975331) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 21;
                        classes[4] = 32;
                        classes[5] = 0;
                    } else {
                        classes[0] = 22;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 24;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 44;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_24(double[] features) {
        int[] classes = new int[6];

        if (features[15] <= 0.013210186269134283) {
            if (features[16] <= 0.017620659433305264) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 19;
            } else {
                if (features[31] <= -16.695404052734375) {
                    if (features[39] <= -123.30341339111328) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 30;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 19;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 21;
                        classes[5] = 0;
                    }
                } else {
                    if (features[18] <= -0.003204345703125) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 37;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            if (features[6] <= 0.1843363717198372) {
                classes[0] = 0;
                classes[1] = 45;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[55] <= 37.51805305480957) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 2;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_25(double[] features) {
        int[] classes = new int[6];

        if (features[36] <= 5094.6280517578125) {
            if (features[2] <= -1.363861083984375) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 31;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[34] <= 14.5233154296875) {
                    if (features[26] <= 0.10148715227842331) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 17;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 35;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[56] <= 22900.27734375) {
                        classes[0] = 3;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 34;
                        classes[5] = 0;
                    } else {
                        classes[0] = 20;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 33;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_26(double[] features) {
        int[] classes = new int[6];

        if (features[31] <= -76.74713134765625) {
            classes[0] = 0;
            classes[1] = 48;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[1] <= -1.611193835735321) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 26;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[15] <= 0.00030716994660906494) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 19;
                } else {
                    if (features[27] <= 0.543257862329483) {
                        classes[0] = 6;
                        classes[1] = 3;
                        classes[2] = 0;
                        classes[3] = 29;
                        classes[4] = 27;
                        classes[5] = 0;
                    } else {
                        classes[0] = 19;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_27(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 460370.1484375) {
            if (features[41] <= -0.7410049438476562) {
                if (features[1] <= -1.58392333984375) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 27;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    if (features[22] <= 0.07597656175494194) {
                        classes[0] = 14;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 5;
                        classes[4] = 38;
                        classes[5] = 0;
                    } else {
                        classes[0] = 4;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 21;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 24;
            }
        } else {
            classes[0] = 0;
            classes[1] = 44;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_28(double[] features) {
        int[] classes = new int[6];

        if (features[37] <= 66.0455493927002) {
            if (features[39] <= -118.01013946533203) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 43;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[36] <= 157.2197494506836) {
                    if (features[32] <= -1.8014907836914062) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 20;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 15;
                    }
                } else {
                    if (features[17] <= 0.25808919966220856) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 36;
                        classes[5] = 0;
                    } else {
                        classes[0] = 16;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 44;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_29(double[] features) {
        int[] classes = new int[6];

        if (features[16] <= 0.12831220030784607) {
            if (features[0] <= -1.597442626953125) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 37;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[38] <= 15721.97509765625) {
                    if (features[39] <= -8.806610107421875) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 32;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 21;
                    }
                } else {
                    if (features[38] <= 54790.88671875) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 29;
                        classes[5] = 0;
                    } else {
                        classes[0] = 12;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 4;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 39;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_30(double[] features) {
        int[] classes = new int[6];

        if (features[54] <= 1161.5552368164062) {
            if (features[37] <= 12.547910690307617) {
                if (features[34] <= 2.326202392578125) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 26;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 24;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                if (features[49] <= -9.912872314453125) {
                    if (features[43] <= 95.20721435546875) {
                        classes[0] = 19;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 9;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 24;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[2] <= -1.409027099609375) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 1;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 33;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 40;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_31(double[] features) {
        int[] classes = new int[6];

        if (features[45] <= 11359.96875) {
            if (features[15] <= 0.014467575121670961) {
                if (features[55] <= 1.9066492021083832) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 22;
                } else {
                    if (features[38] <= 16129.53466796875) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 22;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 23;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 32;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[38] <= 661947.859375) {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 43;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 33;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_32(double[] features) {
        int[] classes = new int[6];

        if (features[56] <= 116155.5234375) {
            if (features[8] <= 25.032249450683594) {
                if (features[34] <= 13.20343017578125) {
                    if (features[2] <= -1.0189208984375) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 21;
                    }
                } else {
                    if (features[49] <= -10.059356689453125) {
                        classes[0] = 17;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 6;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 27;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 31;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[23] <= -0.13264770060777664) {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 49;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_33(double[] features) {
        int[] classes = new int[6];

        if (features[45] <= 10330.990234375) {
            if (features[45] <= 1845.4208374023438) {
                if (features[30] <= -19.747543334960938) {
                    if (features[26] <= 0.16377850621938705) {
                        classes[0] = 6;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 37;
                        classes[5] = 0;
                    } else {
                        classes[0] = 11;
                        classes[1] = 3;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[49] <= -1.506805419921875) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 19;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 33;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 45;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_34(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 607819.765625) {
            if (features[34] <= 14.39666748046875) {
                if (features[8] <= 0.5716017708182335) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 22;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 19;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                if (features[7] <= 0.5228418707847595) {
                    if (features[17] <= 0.25313279777765274) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 37;
                        classes[5] = 0;
                    } else {
                        classes[0] = 12;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 30;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 55;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_35(double[] features) {
        int[] classes = new int[6];

        if (features[32] <= -45.447349548339844) {
            classes[0] = 0;
            classes[1] = 40;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[37] <= 12.547910690307617) {
                if (features[54] <= 13.571310237050056) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 20;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 27;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                if (features[1] <= -1.62921142578125) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 27;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    if (features[52] <= 12.924575805664062) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 33;
                        classes[5] = 0;
                    } else {
                        classes[0] = 23;
                        classes[1] = 3;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 2;
                        classes[5] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_36(double[] features) {
        int[] classes = new int[6];

        if (features[34] <= 70.6939697265625) {
            if (features[17] <= 0.031904184725135565) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 23;
            } else {
                if (features[0] <= -1.647534191608429) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 27;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    if (features[25] <= 0.04046749882400036) {
                        classes[0] = 6;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 35;
                        classes[5] = 0;
                    } else {
                        classes[0] = 10;
                        classes[1] = 1;
                        classes[2] = 0;
                        classes[3] = 19;
                        classes[4] = 2;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 54;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_37(double[] features) {
        int[] classes = new int[6];

        if (features[55] <= 32.144535064697266) {
            if (features[43] <= 101.71089172363281) {
                if (features[16] <= 0.05079635605216026) {
                    if (features[50] <= -0.4291534423828125) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 30;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 17;
                    }
                } else {
                    if (features[24] <= 0.010077896527945995) {
                        classes[0] = 21;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 31;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 52;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_38(double[] features) {
        int[] classes = new int[6];

        if (features[15] <= 0.016898890491575003) {
            if (features[4] <= -0.3017822280526161) {
                if (features[37] <= 24.181371688842773) {
                    if (features[8] <= 0.32097776056616567) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 6;
                    } else {
                        classes[0] = 3;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 16;
                        classes[4] = 38;
                        classes[5] = 0;
                    }
                } else {
                    if (features[9] <= -0.10609130933880806) {
                        classes[0] = 20;
                        classes[1] = 1;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 2;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[49] <= -2.7538299560546875) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 34;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 12;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 42;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_39(double[] features) {
        int[] classes = new int[6];

        if (features[55] <= 34.01183891296387) {
            if (features[2] <= -1.41473388671875) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 29;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[17] <= 0.03451631357893348) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 28;
                } else {
                    if (features[30] <= -22.449493408203125) {
                        classes[0] = 17;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 29;
                        classes[5] = 0;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 27;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            if (features[22] <= -0.02238769573159516) {
                classes[0] = 3;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 40;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_40(double[] features) {
        int[] classes = new int[6];

        if (features[17] <= 1.7867481112480164) {
            if (features[36] <= 157.4619598388672) {
                if (features[1] <= -1.054345726966858) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 25;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 20;
                }
            } else {
                if (features[26] <= 0.45346131920814514) {
                    if (features[17] <= 0.25808919966220856) {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 45;
                        classes[5] = 0;
                    } else {
                        classes[0] = 10;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                } else {
                    if (features[4] <= -0.4143920913338661) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 30;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            if (features[38] <= 690141.359375) {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 41;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_41(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 690141.359375) {
            if (features[47] <= 874585.21875) {
                if (features[45] <= 33.67612838745117) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 20;
                } else {
                    if (features[38] <= 17187.958984375) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 27;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 23;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 26;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 26;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 52;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_42(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 607819.765625) {
            if (features[46] <= 76.03655624389648) {
                if (features[36] <= 174.0396957397461) {
                    if (features[38] <= 1357.7540016174316) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 19;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 19;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                } else {
                    if (features[12] <= -0.01885986328125) {
                        classes[0] = 18;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 33;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 26;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 58;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_43(double[] features) {
        int[] classes = new int[6];

        if (features[55] <= 34.01183891296387) {
            if (features[46] <= 79.31834602355957) {
                if (features[36] <= 157.4619598388672) {
                    if (features[26] <= 0.07669691741466522) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 11;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 24;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[26] <= 0.17483939230442047) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 27;
                        classes[5] = 0;
                    } else {
                        classes[0] = 20;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 38;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 55;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_44(double[] features) {
        int[] classes = new int[6];

        if (features[49] <= -30.6915283203125) {
            if (features[38] <= 496173.109375) {
                if (features[49] <= -39.59846496582031) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 1;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 2;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                classes[0] = 0;
                classes[1] = 45;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[40] <= -104.43344116210938) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 28;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[38] <= 17187.958984375) {
                    if (features[45] <= 29.614073008298874) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 21;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 22;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[12] <= -0.02215576171875) {
                        classes[0] = 21;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 34;
                        classes[5] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_45(double[] features) {
        int[] classes = new int[6];

        if (features[31] <= -76.74713134765625) {
            classes[0] = 0;
            classes[1] = 51;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[41] <= -0.7410049438476562) {
                if (features[8] <= 26.826927185058594) {
                    if (features[34] <= 14.859771728515625) {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 24;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 17;
                        classes[1] = 2;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 31;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 26;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 22;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_46(double[] features) {
        int[] classes = new int[6];

        if (features[9] <= -0.20136719197034836) {
            if (features[32] <= -55.11283874511719) {
                classes[0] = 0;
                classes[1] = 54;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[25] <= 0.1063707023859024) {
                    if (features[50] <= -6.267547607421875) {
                        classes[0] = 13;
                        classes[1] = 1;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 3;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 4;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            if (features[39] <= -118.60790252685547) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 29;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[34] <= 14.39666748046875) {
                    if (features[1] <= -1.047753930091858) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 19;
                        classes[4] = 2;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 11;
                    }
                } else {
                    if (features[31] <= -32.82890319824219) {
                        classes[0] = 5;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 32;
                        classes[5] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_47(double[] features) {
        int[] classes = new int[6];

        if (features[36] <= 6078.197509765625) {
            if (features[0] <= -1.597442626953125) {
                if (features[28] <= -0.18648768216371536) {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 34;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                if (features[50] <= -0.4253387451171875) {
                    if (features[10] <= -0.0758056640625) {
                        classes[0] = 15;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 2;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 32;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 19;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 51;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_48(double[] features) {
        int[] classes = new int[6];

        if (features[54] <= 1096.738037109375) {
            if (features[46] <= 75.91038703918457) {
                if (features[25] <= 0.04046749882400036) {
                    if (features[52] <= 3.2199859619140625) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 17;
                    } else {
                        classes[0] = 4;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 40;
                        classes[5] = 0;
                    }
                } else {
                    if (features[12] <= -0.0294189453125) {
                        classes[0] = 16;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 20;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 29;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[36] <= 6078.197509765625) {
                classes[0] = 3;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 42;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_49(double[] features) {
        int[] classes = new int[6];

        if (features[17] <= 1.3368582129478455) {
            if (features[0] <= -1.6522583365440369) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 34;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[30] <= -22.449493408203125) {
                    if (features[36] <= 539.08056640625) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 30;
                        classes[5] = 0;
                    } else {
                        classes[0] = 16;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                } else {
                    if (features[8] <= 0.5724061727523804) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 17;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 31;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            if (features[6] <= 0.1843363717198372) {
                classes[0] = 0;
                classes[1] = 45;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 2;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_50(double[] features) {
        int[] classes = new int[6];

        if (features[52] <= 44.31610107421875) {
            if (features[16] <= 0.015111319720745087) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 27;
            } else {
                if (features[8] <= 22.65296173095703) {
                    if (features[36] <= 171.8795928955078) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 29;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 23;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 28;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 33;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            if (features[8] <= 18.43363666534424) {
                classes[0] = 0;
                classes[1] = 35;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_51(double[] features) {
        int[] classes = new int[6];

        if (features[17] <= 1.321018636226654) {
            if (features[40] <= -104.43344116210938) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 30;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[30] <= -19.747543334960938) {
                    if (features[25] <= 0.029874267056584358) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 34;
                        classes[5] = 0;
                    } else {
                        classes[0] = 23;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 6;
                        classes[5] = 0;
                    }
                } else {
                    if (features[1] <= -1.05572509765625) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 21;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 18;
                    }
                }
            }
        } else {
            if (features[23] <= -0.13062377646565437) {
                if (features[6] <= 0.4490083009004593) {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 1;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                classes[0] = 0;
                classes[1] = 40;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_52(double[] features) {
        int[] classes = new int[6];

        if (features[37] <= 77.68351745605469) {
            if (features[41] <= -38.928985595703125) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 26;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[7] <= 0.044635165482759476) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 17;
                } else {
                    if (features[38] <= 15721.97509765625) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 24;
                        classes[1] = 0;
                        classes[2] = 10;
                        classes[3] = 1;
                        classes[4] = 27;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 49;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_53(double[] features) {
        int[] classes = new int[6];

        if (features[55] <= 32.84929847717285) {
            if (features[40] <= -114.4561767578125) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 36;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[2] <= -1.000213623046875) {
                    if (features[26] <= 0.16377850621938705) {
                        classes[0] = 5;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 44;
                        classes[5] = 0;
                    } else {
                        classes[0] = 14;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 21;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 14;
                }
            }
        } else {
            if (features[28] <= -0.21181169897317886) {
                classes[0] = 2;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 39;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_54(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 514498.2421875) {
            if (features[24] <= 0.0016377850552089512) {
                if (features[36] <= 80.4012098312378) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 19;
                } else {
                    if (features[13] <= 0.18050537258386612) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 37;
                        classes[5] = 0;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[46] <= 78.24784469604492) {
                    if (features[32] <= -12.570381164550781) {
                        classes[0] = 11;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 30;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 33;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 43;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_55(double[] features) {
        int[] classes = new int[6];

        if (features[55] <= 34.01183891296387) {
            if (features[43] <= 93.91021728515625) {
                if (features[37] <= 12.547910690307617) {
                    if (features[24] <= 0.0010712445073295385) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 11;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 20;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[55] <= 9.361958980560303) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 32;
                        classes[5] = 0;
                    } else {
                        classes[0] = 19;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 5;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 35;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[27] <= 0.7321160435676575) {
                classes[0] = 0;
                classes[1] = 52;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 2;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_56(double[] features) {
        int[] classes = new int[6];

        if (features[1] <= -1.611193835735321) {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 28;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[54] <= 1049.2686462402344) {
                if (features[34] <= 14.5233154296875) {
                    if (features[56] <= 1357.1310548782349) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 26;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 25;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[37] <= 23.08384609222412) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 31;
                        classes[5] = 0;
                    } else {
                        classes[0] = 17;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[58] <= -0.014511536806821823) {
                    classes[0] = 0;
                    classes[1] = 46;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    if (features[29] <= -0.15060097351670265) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 2;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_57(double[] features) {
        int[] classes = new int[6];

        if (features[37] <= 80.781005859375) {
            if (features[2] <= -1.4180908203125) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 30;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[2] <= -1.000213623046875) {
                    if (features[11] <= -0.0513916015625) {
                        classes[0] = 20;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 4;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 25;
                        classes[4] = 35;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 20;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 42;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_58(double[] features) {
        int[] classes = new int[6];

        if (features[52] <= 46.593475341796875) {
            if (features[24] <= 0.0016377850552089512) {
                if (features[48] <= -4.134559631347656) {
                    if (features[16] <= 0.04971081577241421) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 29;
                        classes[5] = 0;
                    } else {
                        classes[0] = 5;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 2;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 17;
                }
            } else {
                if (features[16] <= 0.049944428727030754) {
                    if (features[3] <= -1.04351806640625) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 26;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[39] <= -125.39234161376953) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 32;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 16;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            if (features[54] <= 2466.847900390625) {
                if (features[3] <= -0.9559326171875) {
                    classes[0] = 0;
                    classes[1] = 4;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 2;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                classes[0] = 0;
                classes[1] = 39;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_59(double[] features) {
        int[] classes = new int[6];

        if (features[37] <= 77.68351745605469) {
            if (features[46] <= 80.4839096069336) {
                if (features[38] <= 15746.19580078125) {
                    if (features[55] <= 2.8535965383052826) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 21;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[14] <= -0.01803100621327758) {
                        classes[0] = 15;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 41;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 27;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 46;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_60(double[] features) {
        int[] classes = new int[6];

        if (features[52] <= 39.87083435058594) {
            if (features[8] <= 21.155629634857178) {
                if (features[8] <= 0.31022493727505207) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 25;
                } else {
                    if (features[10] <= -0.08154296875) {
                        classes[0] = 22;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 27;
                        classes[4] = 36;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 30;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 36;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_61(double[] features) {
        int[] classes = new int[6];

        if (features[32] <= -55.11283874511719) {
            classes[0] = 0;
            classes[1] = 52;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[43] <= 107.48291015625) {
                if (features[37] <= 13.110202312469482) {
                    if (features[24] <= 0.0007572495160275139) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 16;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 21;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[34] <= 148.9673614501953) {
                        classes[0] = 15;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 36;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 8;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 29;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_62(double[] features) {
        int[] classes = new int[6];

        if (features[49] <= -33.86383056640625) {
            if (features[8] <= 16.429069995880127) {
                classes[0] = 0;
                classes[1] = 46;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[22] <= 0.10183105431497097) {
                    classes[0] = 2;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 1;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            if (features[1] <= -1.628747582435608) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 29;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[39] <= -8.9019775390625) {
                    if (features[24] <= 0.0017661108868196607) {
                        classes[0] = 3;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 36;
                        classes[5] = 0;
                    } else {
                        classes[0] = 10;
                        classes[1] = 5;
                        classes[2] = 0;
                        classes[3] = 24;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 19;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_63(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 469438.6328125) {
            if (features[7] <= 0.44940730929374695) {
                if (features[1] <= -1.033935546875) {
                    if (features[38] <= 19038.00830078125) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 24;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 15;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 4;
                        classes[4] = 24;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 18;
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 37;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 55;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_64(double[] features) {
        int[] classes = new int[6];

        if (features[52] <= 43.50013732910156) {
            if (features[0] <= -1.590521216392517) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 32;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[0] <= -1.046032726764679) {
                    if (features[11] <= -0.050811767578125) {
                        classes[0] = 21;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 20;
                        classes[4] = 36;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 21;
                }
            }
        } else {
            if (features[15] <= 0.06261838413774967) {
                classes[0] = 0;
                classes[1] = 45;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_65(double[] features) {
        int[] classes = new int[6];

        if (features[54] <= 1161.5552368164062) {
            if (features[7] <= 0.49040041863918304) {
                if (features[37] <= 2.688141644001007) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 25;
                } else {
                    if (features[34] <= 14.5233154296875) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 22;
                        classes[4] = 2;
                        classes[5] = 0;
                    } else {
                        classes[0] = 8;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 33;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 34;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 51;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_66(double[] features) {
        int[] classes = new int[6];

        if (features[48] <= -49.82185363769531) {
            classes[0] = 0;
            classes[1] = 47;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[45] <= 8039.33544921875) {
                if (features[40] <= -4.796600341796875) {
                    if (features[34] <= 14.5233154296875) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 13;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 4;
                        classes[4] = 40;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 22;
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 27;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_67(double[] features) {
        int[] classes = new int[6];

        if (features[52] <= 46.593475341796875) {
            if (features[39] <= -125.39234161376953) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 35;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[39] <= -8.806610107421875) {
                    if (features[36] <= 157.4619598388672) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 24;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 11;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 33;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 28;
                }
            }
        } else {
            if (features[37] <= 80.781005859375) {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 43;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_68(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 537656.3125) {
            if (features[45] <= 7957.130920410156) {
                if (features[7] <= 0.04531833762302995) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 24;
                } else {
                    if (features[25] <= 0.03689025714993477) {
                        classes[0] = 6;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 32;
                        classes[5] = 0;
                    } else {
                        classes[0] = 19;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 36;
                        classes[4] = 3;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 27;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 30;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_69(double[] features) {
        int[] classes = new int[6];

        if (features[32] <= -45.447349548339844) {
            classes[0] = 0;
            classes[1] = 39;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[0] <= -1.647534191608429) {
                if (features[54] <= 1608.253662109375) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 30;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                if (features[17] <= 0.031904184725135565) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 15;
                } else {
                    if (features[30] <= -19.747543334960938) {
                        classes[0] = 22;
                        classes[1] = 5;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 39;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 25;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_70(double[] features) {
        int[] classes = new int[6];

        if (features[55] <= 34.01183891296387) {
            if (features[8] <= 21.155629634857178) {
                if (features[17] <= 0.031904184725135565) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 24;
                } else {
                    if (features[32] <= -9.37652587890625) {
                        classes[0] = 17;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 24;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 8;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 38;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[4] <= -0.40850830078125) {
                classes[0] = 0;
                classes[1] = 42;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_71(double[] features) {
        int[] classes = new int[6];

        if (features[32] <= -54.099082946777344) {
            classes[0] = 0;
            classes[1] = 48;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[36] <= 10.879867553710938) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 34;
            } else {
                if (features[30] <= -22.313690185546875) {
                    if (features[7] <= 0.5158515870571136) {
                        classes[0] = 14;
                        classes[1] = 3;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 26;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 25;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[30] <= -19.32830810546875) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 4;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 20;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_72(double[] features) {
        int[] classes = new int[6];

        if (features[55] <= 36.52084922790527) {
            if (features[39] <= -123.30341339111328) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 30;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[25] <= 0.011650515720248222) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 25;
                } else {
                    if (features[36] <= 171.8795928955078) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 17;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 16;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 36;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            if (features[26] <= 0.9343198239803314) {
                if (features[11] <= -0.2109375) {
                    classes[0] = 0;
                    classes[1] = 1;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                classes[0] = 0;
                classes[1] = 50;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_73(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 607819.765625) {
            if (features[43] <= 96.380615234375) {
                if (features[31] <= -12.665939331054688) {
                    if (features[12] <= -0.0067138671875) {
                        classes[0] = 19;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 36;
                        classes[5] = 0;
                    }
                } else {
                    if (features[56] <= 637.7984743118286) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 16;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 17;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 33;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 53;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_74(double[] features) {
        int[] classes = new int[6];

        if (features[16] <= 0.132119283080101) {
            if (features[43] <= 95.20721435546875) {
                if (features[10] <= 0.0037719726096838713) {
                    if (features[26] <= 0.16377850621938705) {
                        classes[0] = 4;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 29;
                        classes[5] = 3;
                    } else {
                        classes[0] = 15;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 14;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                } else {
                    if (features[2] <= -1.045166015625) {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 19;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 30;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 55;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_75(double[] features) {
        int[] classes = new int[6];

        if (features[55] <= 33.66367244720459) {
            if (features[15] <= 0.0003190418428857811) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 29;
            } else {
                if (features[55] <= 8.794960498809814) {
                    if (features[46] <= 15.411176681518555) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 13;
                        classes[4] = 3;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 7;
                        classes[4] = 21;
                        classes[5] = 0;
                    }
                } else {
                    if (features[40] <= -106.97669982910156) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 25;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 25;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 7;
                        classes[4] = 6;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 41;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_76(double[] features) {
        int[] classes = new int[6];

        if (features[30] <= -85.0625991821289) {
            if (features[6] <= 0.1843363717198372) {
                classes[0] = 0;
                classes[1] = 43;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[20] <= -0.12469482421875) {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 1;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            if (features[4] <= -0.3017822280526161) {
                if (features[30] <= -22.52674102783203) {
                    if (features[15] <= 0.0025893268175423145) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 37;
                        classes[5] = 0;
                    } else {
                        classes[0] = 18;
                        classes[1] = 2;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[25] <= 0.03801769018173218) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 9;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 24;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[36] <= 141.7264051437378) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 8;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 31;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_77(double[] features) {
        int[] classes = new int[6];

        if (features[37] <= 66.0455493927002) {
            if (features[45] <= 7010.35693359375) {
                if (features[31] <= -16.695404052734375) {
                    if (features[11] <= -0.050811767578125) {
                        classes[0] = 20;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 29;
                        classes[5] = 0;
                    }
                } else {
                    if (features[46] <= 4.226217687129974) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 17;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 24;
                        classes[4] = 3;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 24;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 58;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_78(double[] features) {
        int[] classes = new int[6];

        if (features[17] <= 1.841948688030243) {
            if (features[46] <= 80.35774040222168) {
                if (features[30] <= -22.449493408203125) {
                    if (features[11] <= -0.0350341796875) {
                        classes[0] = 13;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 41;
                        classes[5] = 0;
                    }
                } else {
                    if (features[26] <= 0.07669691741466522) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 22;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 24;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 35;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[16] <= 0.25393255054950714) {
                classes[0] = 0;
                classes[1] = 37;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_79(double[] features) {
        int[] classes = new int[6];

        if (features[16] <= 0.12831220030784607) {
            if (features[50] <= -0.43582916259765625) {
                if (features[24] <= 0.001748393930029124) {
                    if (features[17] <= 0.27640926092863083) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 35;
                        classes[5] = 0;
                    } else {
                        classes[0] = 7;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                } else {
                    if (features[43] <= 94.757080078125) {
                        classes[0] = 16;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 24;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 22;
            }
        } else {
            if (features[34] <= 85.46028137207031) {
                if (features[43] <= 45.95794677734375) {
                    classes[0] = 0;
                    classes[1] = 2;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 2;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                classes[0] = 0;
                classes[1] = 42;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_80(double[] features) {
        int[] classes = new int[6];

        if (features[48] <= -43.58673095703125) {
            if (features[26] <= 0.7971506416797638) {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[4] <= -0.0511474609375) {
                    classes[0] = 0;
                    classes[1] = 43;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 1;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            if (features[15] <= 0.0003614311644923873) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 27;
            } else {
                if (features[46] <= 75.91038703918457) {
                    if (features[25] <= 0.04177844524383545) {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 31;
                        classes[5] = 0;
                    } else {
                        classes[0] = 13;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 24;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 32;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_81(double[] features) {
        int[] classes = new int[6];

        if (features[34] <= 69.91958618164062) {
            if (features[15] <= 0.0025422844337299466) {
                if (features[45] <= 29.614073008298874) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 21;
                } else {
                    if (features[38] <= 15746.19580078125) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 20;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 1;
                        classes[3] = 2;
                        classes[4] = 35;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[0] <= -1.590521216392517) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 26;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    if (features[22] <= 0.10926513746380806) {
                        classes[0] = 24;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 1;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            if (features[1] <= -1.511303722858429) {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 43;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_82(double[] features) {
        int[] classes = new int[6];

        if (features[46] <= 101.13857650756836) {
            if (features[36] <= 6619.478515625) {
                if (features[36] <= 157.4619598388672) {
                    if (features[15] <= 0.00034516314190113917) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 18;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 20;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[32] <= -19.84882354736328) {
                        classes[0] = 13;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 3;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 33;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 45;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 42;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_83(double[] features) {
        int[] classes = new int[6];

        if (features[36] <= 6619.478515625) {
            if (features[45] <= 7020.6295166015625) {
                if (features[41] <= -1.0080337524414062) {
                    if (features[34] <= 14.5233154296875) {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 30;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 16;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 5;
                        classes[4] = 36;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 15;
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 32;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 41;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_84(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 607819.765625) {
            if (features[42] <= 4.20379638671875) {
                if (features[37] <= 12.538166999816895) {
                    if (features[50] <= -0.43392181396484375) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 20;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 12;
                    }
                } else {
                    if (features[52] <= 12.924575805664062) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 2;
                        classes[3] = 3;
                        classes[4] = 43;
                        classes[5] = 0;
                    } else {
                        classes[0] = 17;
                        classes[1] = 0;
                        classes[2] = 5;
                        classes[3] = 0;
                        classes[4] = 4;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[28] <= -0.43078968673944473) {
                    classes[0] = 2;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 27;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 42;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_85(double[] features) {
        int[] classes = new int[6];

        if (features[54] <= 1161.5552368164062) {
            if (features[45] <= 7010.35693359375) {
                if (features[32] <= -7.613182067871094) {
                    if (features[14] <= -0.014530029613524675) {
                        classes[0] = 18;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 2;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 33;
                        classes[5] = 0;
                    }
                } else {
                    if (features[25] <= 0.03398935683071613) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 2;
                        classes[5] = 15;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 21;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 35;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[36] <= 6078.197509765625) {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 48;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_86(double[] features) {
        int[] classes = new int[6];

        if (features[52] <= 55.030059814453125) {
            if (features[47] <= 820236.234375) {
                if (features[17] <= 0.028104865225031972) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 17;
                } else {
                    if (features[18] <= -0.03870239295065403) {
                        classes[0] = 13;
                        classes[1] = 1;
                        classes[2] = 0;
                        classes[3] = 22;
                        classes[4] = 5;
                        classes[5] = 0;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 29;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 45;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 41;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_87(double[] features) {
        int[] classes = new int[6];

        if (features[38] <= 661947.859375) {
            if (features[43] <= 96.380615234375) {
                if (features[46] <= 4.226217687129974) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 28;
                } else {
                    if (features[52] <= 12.74871826171875) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 16;
                        classes[4] = 34;
                        classes[5] = 0;
                    } else {
                        classes[0] = 15;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 4;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 34;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 43;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_88(double[] features) {
        int[] classes = new int[6];

        if (features[56] <= 135575.41015625) {
            if (features[2] <= -1.305328369140625) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 36;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[31] <= -14.150619506835938) {
                    if (features[54] <= 79.42403793334961) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 23;
                        classes[5] = 0;
                    } else {
                        classes[0] = 25;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 4;
                        classes[5] = 0;
                    }
                } else {
                    if (features[0] <= -1.065295398235321) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 21;
                        classes[4] = 1;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 18;
                    }
                }
            }
        } else {
            if (features[1] <= -1.5093627572059631) {
                classes[0] = 1;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 45;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_89(double[] features) {
        int[] classes = new int[6];

        if (features[54] <= 2228.79345703125) {
            if (features[46] <= 83.57022285461426) {
                if (features[37] <= 2.6315824389457703) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 26;
                } else {
                    if (features[17] <= 0.258447602391243) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 22;
                        classes[4] = 37;
                        classes[5] = 0;
                    } else {
                        classes[0] = 24;
                        classes[1] = 1;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 31;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 34;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_90(double[] features) {
        int[] classes = new int[6];

        if (features[15] <= 0.01648813160136342) {
            if (features[43] <= 102.21481323242188) {
                if (features[40] <= -2.5341033935546875) {
                    if (features[34] <= 14.7216796875) {
                        classes[0] = 1;
                        classes[1] = 1;
                        classes[2] = 0;
                        classes[3] = 28;
                        classes[4] = 3;
                        classes[5] = 0;
                    } else {
                        classes[0] = 23;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 29;
                        classes[5] = 0;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 17;
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 36;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 39;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_91(double[] features) {
        int[] classes = new int[6];

        if (features[34] <= 69.91958618164062) {
            if (features[1] <= -1.58392333984375) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 39;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[47] <= 3367.6126708984375) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 21;
                } else {
                    if (features[24] <= 0.0009942844044417143) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 27;
                        classes[5] = 0;
                    } else {
                        classes[0] = 17;
                        classes[1] = 1;
                        classes[2] = 0;
                        classes[3] = 26;
                        classes[4] = 5;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 41;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_92(double[] features) {
        int[] classes = new int[6];

        if (features[39] <= -54.637908935546875) {
            if (features[8] <= 26.826927185058594) {
                if (features[38] <= 690141.359375) {
                    classes[0] = 5;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 36;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 28;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            if (features[2] <= -1.000213623046875) {
                if (features[26] <= 0.3353949934244156) {
                    if (features[50] <= -7.1849822998046875) {
                        classes[0] = 11;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 6;
                        classes[4] = 39;
                        classes[5] = 0;
                    }
                } else {
                    if (features[52] <= 28.17840576171875) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 27;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 0;
                        classes[1] = 1;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 22;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_93(double[] features) {
        int[] classes = new int[6];

        if (features[32] <= -45.447349548339844) {
            classes[0] = 0;
            classes[1] = 47;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        } else {
            if (features[1] <= -1.611193835735321) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 27;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[37] <= 12.547910690307617) {
                    if (features[15] <= 0.00028895951163576683) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 17;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 20;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[37] <= 23.40731430053711) {
                        classes[0] = 3;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 2;
                        classes[4] = 34;
                        classes[5] = 0;
                    } else {
                        classes[0] = 20;
                        classes[1] = 3;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 4;
                        classes[5] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_94(double[] features) {
        int[] classes = new int[6];

        if (features[46] <= 101.13857650756836) {
            if (features[17] <= 1.1920437812805176) {
                if (features[8] <= 0.32621179800480604) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 21;
                } else {
                    if (features[36] <= 161.29534912109375) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 20;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 23;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 40;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[37] <= 77.68351745605469) {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 35;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 37;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_95(double[] features) {
        int[] classes = new int[6];

        if (features[17] <= 1.321018636226654) {
            if (features[0] <= -1.647534191608429) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 30;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[30] <= -22.449493408203125) {
                    if (features[52] <= 12.924575805664062) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 3;
                        classes[4] = 27;
                        classes[5] = 0;
                    } else {
                        classes[0] = 19;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                } else {
                    if (features[26] <= 0.11877047270536423) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 1;
                        classes[5] = 17;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 32;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            if (features[6] <= 0.4130956456065178) {
                classes[0] = 0;
                classes[1] = 45;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 2;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_96(double[] features) {
        int[] classes = new int[6];

        if (features[7] <= 0.48341013491153717) {
            if (features[52] <= 37.23335266113281) {
                if (features[38] <= 16153.75537109375) {
                    if (features[45] <= 43.6754150390625) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 24;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 19;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                } else {
                    if (features[11] <= -0.0433349609375) {
                        classes[0] = 19;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 2;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 38;
                        classes[5] = 0;
                    }
                }
            } else {
                classes[0] = 0;
                classes[1] = 37;
                classes[2] = 0;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            }
        } else {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 38;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_97(double[] features) {
        int[] classes = new int[6];

        if (features[56] <= 116155.5234375) {
            if (features[39] <= -142.3999786376953) {
                classes[0] = 0;
                classes[1] = 0;
                classes[2] = 30;
                classes[3] = 0;
                classes[4] = 0;
                classes[5] = 0;
            } else {
                if (features[47] <= 2955.6237773895264) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 23;
                } else {
                    if (features[25] <= 0.041817134246230125) {
                        classes[0] = 10;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 34;
                        classes[5] = 0;
                    } else {
                        classes[0] = 12;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 25;
                        classes[4] = 1;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 42;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_98(double[] features) {
        int[] classes = new int[6];

        if (features[55] <= 32.958909034729004) {
            if (features[3] <= -1.0718994140625) {
                if (features[41] <= -66.38050079345703) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 29;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 1;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            } else {
                if (features[52] <= 3.574371337890625) {
                    classes[0] = 0;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 24;
                } else {
                    if (features[11] <= -0.0513916015625) {
                        classes[0] = 17;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    } else {
                        classes[0] = 1;
                        classes[1] = 0;
                        classes[2] = 4;
                        classes[3] = 22;
                        classes[4] = 36;
                        classes[5] = 0;
                    }
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 42;
            classes[2] = 0;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict_99(double[] features) {
        int[] classes = new int[6];

        if (features[7] <= 0.5158515870571136) {
            if (features[45] <= 1399.0513305664062) {
                if (features[34] <= 14.7216796875) {
                    if (features[8] <= 0.5763669786974788) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 0;
                        classes[4] = 0;
                        classes[5] = 19;
                    } else {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 23;
                        classes[4] = 2;
                        classes[5] = 0;
                    }
                } else {
                    if (features[15] <= 0.0024782628752291203) {
                        classes[0] = 0;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 35;
                        classes[5] = 0;
                    } else {
                        classes[0] = 13;
                        classes[1] = 0;
                        classes[2] = 0;
                        classes[3] = 1;
                        classes[4] = 0;
                        classes[5] = 0;
                    }
                }
            } else {
                if (features[36] <= 6078.197509765625) {
                    classes[0] = 2;
                    classes[1] = 0;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                } else {
                    classes[0] = 0;
                    classes[1] = 43;
                    classes[2] = 0;
                    classes[3] = 0;
                    classes[4] = 0;
                    classes[5] = 0;
                }
            }
        } else {
            classes[0] = 0;
            classes[1] = 0;
            classes[2] = 38;
            classes[3] = 0;
            classes[4] = 0;
            classes[5] = 0;
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 6; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static int predict(double[] features) {
        int n_classes = 6;
        int[] classes = new int[n_classes];
        classes[RandomForestClassifier.predict_0(features)]++;
        classes[RandomForestClassifier.predict_1(features)]++;
        classes[RandomForestClassifier.predict_2(features)]++;
        classes[RandomForestClassifier.predict_3(features)]++;
        classes[RandomForestClassifier.predict_4(features)]++;
        classes[RandomForestClassifier.predict_5(features)]++;
        classes[RandomForestClassifier.predict_6(features)]++;
        classes[RandomForestClassifier.predict_7(features)]++;
        classes[RandomForestClassifier.predict_8(features)]++;
        classes[RandomForestClassifier.predict_9(features)]++;
        classes[RandomForestClassifier.predict_10(features)]++;
        classes[RandomForestClassifier.predict_11(features)]++;
        classes[RandomForestClassifier.predict_12(features)]++;
        classes[RandomForestClassifier.predict_13(features)]++;
        classes[RandomForestClassifier.predict_14(features)]++;
        classes[RandomForestClassifier.predict_15(features)]++;
        classes[RandomForestClassifier.predict_16(features)]++;
        classes[RandomForestClassifier.predict_17(features)]++;
        classes[RandomForestClassifier.predict_18(features)]++;
        classes[RandomForestClassifier.predict_19(features)]++;
        classes[RandomForestClassifier.predict_20(features)]++;
        classes[RandomForestClassifier.predict_21(features)]++;
        classes[RandomForestClassifier.predict_22(features)]++;
        classes[RandomForestClassifier.predict_23(features)]++;
        classes[RandomForestClassifier.predict_24(features)]++;
        classes[RandomForestClassifier.predict_25(features)]++;
        classes[RandomForestClassifier.predict_26(features)]++;
        classes[RandomForestClassifier.predict_27(features)]++;
        classes[RandomForestClassifier.predict_28(features)]++;
        classes[RandomForestClassifier.predict_29(features)]++;
        classes[RandomForestClassifier.predict_30(features)]++;
        classes[RandomForestClassifier.predict_31(features)]++;
        classes[RandomForestClassifier.predict_32(features)]++;
        classes[RandomForestClassifier.predict_33(features)]++;
        classes[RandomForestClassifier.predict_34(features)]++;
        classes[RandomForestClassifier.predict_35(features)]++;
        classes[RandomForestClassifier.predict_36(features)]++;
        classes[RandomForestClassifier.predict_37(features)]++;
        classes[RandomForestClassifier.predict_38(features)]++;
        classes[RandomForestClassifier.predict_39(features)]++;
        classes[RandomForestClassifier.predict_40(features)]++;
        classes[RandomForestClassifier.predict_41(features)]++;
        classes[RandomForestClassifier.predict_42(features)]++;
        classes[RandomForestClassifier.predict_43(features)]++;
        classes[RandomForestClassifier.predict_44(features)]++;
        classes[RandomForestClassifier.predict_45(features)]++;
        classes[RandomForestClassifier.predict_46(features)]++;
        classes[RandomForestClassifier.predict_47(features)]++;
        classes[RandomForestClassifier.predict_48(features)]++;
        classes[RandomForestClassifier.predict_49(features)]++;
        classes[RandomForestClassifier.predict_50(features)]++;
        classes[RandomForestClassifier.predict_51(features)]++;
        classes[RandomForestClassifier.predict_52(features)]++;
        classes[RandomForestClassifier.predict_53(features)]++;
        classes[RandomForestClassifier.predict_54(features)]++;
        classes[RandomForestClassifier.predict_55(features)]++;
        classes[RandomForestClassifier.predict_56(features)]++;
        classes[RandomForestClassifier.predict_57(features)]++;
        classes[RandomForestClassifier.predict_58(features)]++;
        classes[RandomForestClassifier.predict_59(features)]++;
        classes[RandomForestClassifier.predict_60(features)]++;
        classes[RandomForestClassifier.predict_61(features)]++;
        classes[RandomForestClassifier.predict_62(features)]++;
        classes[RandomForestClassifier.predict_63(features)]++;
        classes[RandomForestClassifier.predict_64(features)]++;
        classes[RandomForestClassifier.predict_65(features)]++;
        classes[RandomForestClassifier.predict_66(features)]++;
        classes[RandomForestClassifier.predict_67(features)]++;
        classes[RandomForestClassifier.predict_68(features)]++;
        classes[RandomForestClassifier.predict_69(features)]++;
        classes[RandomForestClassifier.predict_70(features)]++;
        classes[RandomForestClassifier.predict_71(features)]++;
        classes[RandomForestClassifier.predict_72(features)]++;
        classes[RandomForestClassifier.predict_73(features)]++;
        classes[RandomForestClassifier.predict_74(features)]++;
        classes[RandomForestClassifier.predict_75(features)]++;
        classes[RandomForestClassifier.predict_76(features)]++;
        classes[RandomForestClassifier.predict_77(features)]++;
        classes[RandomForestClassifier.predict_78(features)]++;
        classes[RandomForestClassifier.predict_79(features)]++;
        classes[RandomForestClassifier.predict_80(features)]++;
        classes[RandomForestClassifier.predict_81(features)]++;
        classes[RandomForestClassifier.predict_82(features)]++;
        classes[RandomForestClassifier.predict_83(features)]++;
        classes[RandomForestClassifier.predict_84(features)]++;
        classes[RandomForestClassifier.predict_85(features)]++;
        classes[RandomForestClassifier.predict_86(features)]++;
        classes[RandomForestClassifier.predict_87(features)]++;
        classes[RandomForestClassifier.predict_88(features)]++;
        classes[RandomForestClassifier.predict_89(features)]++;
        classes[RandomForestClassifier.predict_90(features)]++;
        classes[RandomForestClassifier.predict_91(features)]++;
        classes[RandomForestClassifier.predict_92(features)]++;
        classes[RandomForestClassifier.predict_93(features)]++;
        classes[RandomForestClassifier.predict_94(features)]++;
        classes[RandomForestClassifier.predict_95(features)]++;
        classes[RandomForestClassifier.predict_96(features)]++;
        classes[RandomForestClassifier.predict_97(features)]++;
        classes[RandomForestClassifier.predict_98(features)]++;
        classes[RandomForestClassifier.predict_99(features)]++;

        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < n_classes; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static void main(String[] args) {
        if (args.length == 60) {

            // Features:
            double[] features = new double[args.length];
            for (int i = 0, l = args.length; i < l; i++) {
                features[i] = Double.parseDouble(args[i]);
            }

            // Prediction:
            int prediction = RandomForestClassifier.predict(features);
            System.out.println(prediction);

        }
    }
}