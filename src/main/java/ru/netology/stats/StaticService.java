package ru.netology.stats;

public class StaticService {
    public int getMonthWithMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMonthWithMaxSales(long[] sales) {

        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long getSumAllSalesMonth(long[] sales) {
        long amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public long getAverageSalesAmountMonth(long[] sales) {
        long amount = getSumAllSalesMonth(sales);
        int ovrl = 0;
        ovrl = (int) (amount / sales.length);
        return ovrl;

    }

    public long getTheNumberOfMonthsWithSalesBelowAverage(long[] sales) {
        int monthLessOvrl = 0;
        long ovrl = getAverageSalesAmountMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < ovrl) {
                monthLessOvrl = monthLessOvrl + 1;
            }
        }
        return monthLessOvrl;
    }

    public long getTheNumberMonthsWithAboveAverageSales(long[] sales) {
        int monthMoreOvrl = 0;
        long ovrl = getAverageSalesAmountMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > ovrl) {
                monthMoreOvrl = monthMoreOvrl + 1;
            }
        }
        return monthMoreOvrl;
    }
}