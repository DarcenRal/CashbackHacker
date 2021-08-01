package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackServiceTest service = new CashbackHackServiceTest();

    @Test
    public void shouldAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldAmount0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldAmount850() {
        int amount = 850;
        int actual = service.remain(amount);
        int expected = 150;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldAmount1001() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldAmount1000() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldAmount1100() {
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual,expected);
    }

}