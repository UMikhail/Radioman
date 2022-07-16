package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void stationSetDown() {
        Radio vol = new Radio();

        vol.setCurrentStation(-1);

        int expected = 0;
        int actual = vol.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSetUp() {
        Radio vol = new Radio();

        vol.setCurrentStation(10);

        int expected = 0;
        int actual = vol.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeSet() {
        Radio vol = new Radio();

        vol.setCurrentVolume(9);
        vol.increaseVolume();

        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeSetUp() {
        Radio vol = new Radio();

        vol.setCurrentVolume(10);
        vol.increaseVolume();

        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void loweringVolumeSet() {
        Radio vol = new Radio();

        vol.setCurrentVolume(0);
        vol.loweringVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void loweringVolumeSetUp() {
        Radio vol = new Radio();

        vol.setCurrentVolume(10);
        vol.loweringVolume();

        int expected = 9;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationSetUp() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationSetDown() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.nextStation();

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationSetUp() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationSetDown() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.prevStation();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
