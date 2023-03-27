package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long totalOfAllSales = 0;
        for (long sale : sales) {
            totalOfAllSales = totalOfAllSales + sale;
        }
        return totalOfAllSales;
    }

    public long averageAmount(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maxMonth = i;
                maximumSale = sales[i];
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonth = i;
                minSale = sales[i];
            }
        }

        return minMonth + 1;
    }
    public int monthSalesBelowAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                count ++;
            }
        }
       return count;
    }
    public int monthSalesAboveAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > averageAmount(sales)) {
                count++;
            }
        }
        return count;
    }

}
