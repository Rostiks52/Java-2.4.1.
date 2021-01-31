package ru.netology.stats;

public class StatService {

   public int calcSumSell(int[] values) {
        int sumsell = 0;
        for (int value : values) {
            sumsell = sumsell + value;
        }
        return sumsell;
    }

    public int average(int[] values) {
        int sumsell = 0;
        int medsumsell = sumsell / values.length;
        return medsumsell;
    }

    public int findMaxMonth(int[] values) {
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

    public int findMinMonth(int[] values) {
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

    public int moreThenAverage(int[] values) {
        int average = average(values);
        int count = 0;
        for (int value : values) {
            if (value > average) {
                count++;
            }
        }
        return count;
    }

    public int lessThenAverage(int[] values) {
        int average = average(values);

        int count = 0;

        for (int value : values) {
            if (value < average) {
                count++;
            }
        }
        return count;
    }
}
