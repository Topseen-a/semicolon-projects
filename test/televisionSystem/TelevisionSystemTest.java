package televisionSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionSystemTest {

    TelevisionSystem tv;

    @BeforeEach
    public void setUp() {
        tv = new TelevisionSystem();
    }

    @Test
    public void testThatTelevisionIsOffAtInitial() {
        assertFalse(tv.isOn());
    }

    @Test
    public void testThatTelevisionCanPowerOn() {
        assertFalse(tv.isOn());

        tv.powerOn();
        assertTrue(tv.isOn());
    }

    @Test
    public void testThatTelevisionPowerControlWorks() {
        assertFalse(tv.isOn());

        tv.powerOn();
        assertTrue(tv.isOn());
        tv.powerOff();
        assertFalse(tv.isOn());
    }

    @Test
    public void testThatIncreaseVolumeButtonWorks() {
        assertFalse(tv.isOn());

        tv.powerOn();
        assertTrue(tv.isOn());

        int initialVolume = tv.getVolume();
        tv.volumeUp();
        assertEquals(initialVolume + 1, tv.getVolume());
    }

    @Test
    public void testThatVolumeDoesNotExceedMaximum() {
        assertFalse(tv.isOn());

        tv.powerOn();
        assertTrue(tv.isOn());

        for (int count = 1; count < 100; count++) {
            tv.volumeUp();
        }
        assertEquals(30, tv.getVolume());
    }

    @Test
    public void testThatDecreaseVolumeButtonWorks() {
        assertFalse(tv.isOn());

        tv.powerOn();
        assertTrue(tv.isOn());

        int initialVolume = tv.getVolume();
        tv.volumeDown();
        assertEquals(initialVolume - 1, tv.getVolume());
    }

    @Test
    public void testThatVolumeDoesNotGoBelowMinimum() {
        assertFalse(tv.isOn());

        tv.powerOn();
        assertTrue(tv.isOn());

        for (int count = 1; count < 100; count++) {
            tv.volumeDown();
        }
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void testThatChannelChangeButtonsWork() {
        assertFalse(tv.isOn());

        tv.powerOn();
        assertTrue(tv.isOn());

        tv.setChannel(10);
        assertEquals(10, tv.getChannel());
    }
}