package ru.netology.stats;

public class StatService {
    int CalcSumSell(int[] values) {
        int sumsell = 0;
        for (int value : values) {
            sumsell = sumsell + value;
        }
        return sumsell;
    }

    public int CalcMedSumSell(int[] values) {

        int sumsell = 0;
        for (int value : values) {
            sumsell = sumsell + value;
        }
        int medsumsell = sumsell / values.length;
        return medsumsell;
    }

    public int FindMaxMonth(int[] values) {
        int monthNumber = 0;
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            int count = values[i];
            if (max <= count) {
                max = count;
                monthNumber = i + 1;
            }
        }
        return monthNumber;
    }
    public int FindMinMonth(int[] values) {
        int monthNumber = 0;
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            int count = values[i];
            if (min >= count) {
                min = count;
                monthNumber = i + 1;
            }
        }
        return monthNumber;
    }
 }
