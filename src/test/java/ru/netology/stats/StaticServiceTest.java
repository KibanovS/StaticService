package ru.netology.stats;

import org.junit.jupiter.api.Assertions;

public class StaticServiceTest {
    @org.testng.annotations.Test
    public void shouldFindMinSales() {
        StaticService service = new StaticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.getMinSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @org.testng.annotations.Test
    public void shouldFindMaxSales() {
        StaticService service = new StaticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.getMaxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @org.testng.annotations.Test
    public void shouldFindAmountSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 180;
        long actualAmount = service.getAmountSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @org.testng.annotations.Test
    public void ShouldFindOvrlSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedOvrl = 15;
        long actualOvrl = service.getOvrlSales(sales);
        Assertions.assertEquals(expectedOvrl, actualOvrl);
    }

    @org.testng.annotations.Test
    public void shouldFindMonthLessOvrl() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthLess = 5;
        long actualMonthLess = service.getMonthLessOvrl(sales);
        Assertions.assertEquals(expectedMonthLess, actualMonthLess);
    }

    @org.testng.annotations.Test
    public void shouldFindMonthMoreOvrl() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMoreLess = 5;
        long actualMoreLess = service.getMonthMoreOvrl(sales);
        Assertions.assertEquals(expectedMoreLess, actualMoreLess);
    }
}
