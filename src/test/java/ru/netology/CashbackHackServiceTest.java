package ru.netology;

import org.junit.Test;

import static org.junit.Test.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldIf1000() {
        int actual = service.remain(1000);
        int expected = 0;
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldIf0() {
        int actual = service.remain(0);
        int expected = 1000;
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldRemainIf3800() {
        int actual = service.remain(3800);
        int expected = 200;
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldIf999() {
        int actual = service.remain(999);
        int expected = 1;
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldIfIncorrect() { //это, ля... лямбда, просто запомнить. Тут умри.
        org.junit.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-100);
        });
    }
}