package com.techreturners.cats;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CatTest {

    private Cat domesticCat, lionCat, cheetahCat;
    private DomesticCat randomCat;

    @Before
    public void setup(){
        domesticCat = new DomesticCat();
        lionCat = new LionCat();
        cheetahCat = new CheetahCat();
        randomCat = new DomesticCat();
    }


    @Test
    public void checkCatIsAwake() {

        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakep() {
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        assertEquals(1100, lionCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        String expected = domesticCat.eat();
        assertTrue(expected.equals("It will do I suppose") || expected.equals("Purrrrrrr"));
    }

    @Test
    public void checkRandomness() {
        int randomInt = randomCat.randomGenerator();
        assertTrue(randomInt == 0 || randomInt == 1);
    }

}
