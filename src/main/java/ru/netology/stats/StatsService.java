package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        long averageSum = sum / sales.length;
        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long amountBelowAverage(long[] sales) {
        long sum = 0;
        int amount = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        long averageSum = sum / sales.length;
        for (long sale : sales) {
            if (sale < averageSum) {
                amount++;
            }
        }
        return amount;
    }

    public long amountAboveAverage(long[] sales) {
        long sum = 0;
        int amount = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        long averageSum = sum / sales.length;
        for (long sale : sales) {
            if (sale > averageSum) {
                amount++;
            }
        }
        return amount;
    }
}
