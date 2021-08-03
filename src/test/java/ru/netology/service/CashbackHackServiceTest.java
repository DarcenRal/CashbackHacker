package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {


    @Test
    public void shouldAmount1000() {
        CashbackHackServiceTest service = new CashbackHackServiceTest();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    private int remain(int i) {
    }


    @Test
    public void shouldAmount0() {
        CashbackHackServiceTest service = new CashbackHackServiceTest();

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount850() {
        CashbackHackServiceTest service = new CashbackHackServiceTest();

        int actual = service.remain(850);
        int expected = 150;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount1001() {
        CashbackHackServiceTest service = new CashbackHackServiceTest();

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount999() {
        CashbackHackServiceTest service = new CashbackHackServiceTest();

        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount1100() {
        CashbackHackServiceTest service = new CashbackHackServiceTest();

        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }
}