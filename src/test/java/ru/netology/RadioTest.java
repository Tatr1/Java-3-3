package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void itsCreateToZero() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(0, radio.getCurrentWave());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseVolumeData.csv")
    void increaseVolume(String name, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.getCurrentVolume();
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/decreaseVolumeData.csv")
    void decreaseVolume(String name, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.getCurrentVolume();
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseWaveData.csv")
    void increaseWave(String name, int currentWave, int expected) {
        Radio radio = new Radio();
        radio.setCurrentWave(currentWave);
        radio.getCurrentWave();
        radio.increaseWave();
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/decreaseWaveData.csv")
    void decreaseWave(String name, int currentWave, int expected) {
        Radio radio = new Radio();
        radio.setCurrentWave(currentWave);
        radio.getCurrentWave();
        radio.decreaseWave();
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

}