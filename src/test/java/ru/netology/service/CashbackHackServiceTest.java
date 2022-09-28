package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void test1() {
        CashbackHackService cash = new CashbackHackService();
        int expected = 800;
        int actual = cash.remain(1200);
        assertEquals(actual, expected);

    }

    @Test
    public void test2() {
        CashbackHackService cash = new CashbackHackService();
        int expected = 0;
        int actual = cash.remain(1000);
        assertEquals(actual, expected);
    }
}






