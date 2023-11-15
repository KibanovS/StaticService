package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaticServiceTest {
    @org.testng.annotations.Test
    public void shouldFindMonthMinSales() {
        StaticService service = new StaticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.getMonthWithMinSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @org.testng.annotations.Test
    public void shouldFindMonthMaxSales() {
        StaticService service = new StaticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.getMonthWithMaxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @org.testng.annotations.Test
    public void shouldFindSumSalesAllMonth() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 180;
        long actualAmount = service.getSumAllSalesMonth(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @org.testng.annotations.Test
    public void ShouldFindAverageNumberSalesPerMonth() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAvg = 15;
        long actualAvg = service.getAverageSalesAmountMonth(sales);
        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @org.testng.annotations.Test
    public void shouldFindMonthBelowAverageSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        long actualMonths = service.getTheNumberOfMonthsWithSalesBelowAverage(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @org.testng.annotations.Test
    public void shouldFindMonthAboveAverageSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        long actualMonths = service.getTheNumberMonthsWithAboveAverageSales(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}
