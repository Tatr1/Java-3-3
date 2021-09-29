package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/clientRadio.csv")
    public void clientRadio(String name, int clientWave) {
        Radio radio = new Radio(clientWave);
        int expected = radio.getClientWave() - 1;
        assertEquals(expected, radio.getMaxWave());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseVolumeData100-100.csv")
    void increaseVolume100(String name, int currentVolume, int expected) {
        Radio radio = new Radio(100, 0, 99, 0, 0, 0, 0);
        radio.setCurrentVolume(currentVolume);
        radio.getCurrentVolume();
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/decreaseVolumeData100-100.csv")
    void decreaseVolume100(String name, int currentVolume, int expected) {
        Radio radio = new Radio(100, 0, 99, 0, 0, 0, 0);
        radio.setCurrentVolume(currentVolume);
        radio.getCurrentVolume();
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseWaveData100-100.csv")
    void increaseWave99(String name, int currentWave, int expected) {
        Radio radio = new Radio(100, 0, 99, 0, 0, 0, 0);
        radio.setCurrentWave(currentWave);
        radio.getCurrentWave();
        radio.increaseWave();
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/decreaseWaveData100-100.csv")
    void decreaseWave99(String name, int currentWave, int expected) {
        Radio radio = new Radio(100, 0, 99, 0, 0, 0, 0);
        radio.setCurrentWave(currentWave);
        radio.getCurrentWave();
        radio.decreaseWave();
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }
}