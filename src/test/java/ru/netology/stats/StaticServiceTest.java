package ru.netology.stats;

import org.junit.jupiter.api.Assertions;

public class StaticServiceTest {
    @org.testng.annotations.Test
    public void shouldFindMinSales() {
        StaticService service = new StaticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.getMonthWithMinSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @org.testng.annotations.Test
    public void shouldFindMaxSales() {
        StaticService service = new StaticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.getMonthWithMaxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @org.testng.annotations.Test
    public void shouldFindAmountSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 180;
        long actualAmount = service.getSumAllSalesMonth(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @org.testng.annotations.Test
    public void ShouldFindOvrlSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedOvrl = 15;
        long actualOvrl = service.getAverageSalesAmountMonth(sales);
        Assertions.assertEquals(expectedOvrl, actualOvrl);
    }

    @org.testng.annotations.Test
    public void shouldFindMonthLessOvrl() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthLess = 5;
        long actualMonthLess = service.getTheNumberOfMonthsWithSalesBelowAverage(sales);
        Assertions.assertEquals(expectedMonthLess, actualMonthLess);
    }

    @org.testng.annotations.Test
    public void shouldFindMonthMoreOvrl() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMoreLess = 5;
        long actualMoreLess = service.getTheNumberMonthsWithAboveAverageSales(sales);
        Assertions.assertEquals(expectedMoreLess, actualMoreLess);
    }
}
