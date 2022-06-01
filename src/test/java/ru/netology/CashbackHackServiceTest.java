package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    void remain() {   //remain-осталось докупить на...
        int amount = 200;
        int expected = 800;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    void noBuy() {   //remain-осталось докупить на...
        int amount = 0;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
//    @Test
//    void allBuy() {   //remain-осталось докупить на...
//        int amount = 1000;
//        int expected = 0;
//
//        CashbackHackService service = new CashbackHackService();
//        int actual = service.remain(amount);
//
//        assertEquals(actual, expected);
//    }
}