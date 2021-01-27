package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatServiceTest {
    @Test
    public void shouldCalculateSumSell() {
        StatService service = new StatService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.CalcSumSell(values);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAversge() {
        StatService service = new StatService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.average(values);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatService service = new StatService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.FindMaxMonth(values);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {
        StatService service = new StatService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.FindMinMonth(values);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCountMoreThenAverage() {
        StatService service = new StatService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.moreThenAverage(values);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountLessThenAverage() {
        StatService service = new StatService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lessThenAverage(values);
        assertEquals(expected, actual);
    }
}