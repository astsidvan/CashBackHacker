package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void test1() {
        CashbackHackService cash = new CashbackHackService();
        int expected = 800;
        int actual = cash.remain(1200);
        assertEquals(expected, actual);

    }
    @Test
    public void test2() {
        CashbackHackService cash = new CashbackHackService();
        int expected = 0;
        int actual = cash.remain(1000);
        assertEquals(expected, actual);

    }
}