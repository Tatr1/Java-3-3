package ru.netology;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxWave = 9;
    private int minWave = 0;
    private int currentVolume;
    private int currentWave;

    public Radio(){
}

    public Radio(int maxVolume, int minVolume, int maxWave, int minWave, int currentVolume, int currentWave) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxWave = maxWave;
        this.minWave = minWave;
        this.currentVolume = currentVolume;
        this.currentWave = currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave > maxWave) {
            return;
        }
        if (currentWave < minWave) {
            return;
        }
        this.currentWave = currentWave;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        } else {
            currentVolume = minVolume;
        }
    }

    public void increaseWave() {
        if (currentWave < maxWave) {
            currentWave += 1;
        } else {
            currentWave = minWave;
        }
    }

    public void decreaseWave() {
        if (currentWave > minWave) {
            currentWave -= 1;
        } else {
            currentWave = maxWave;
        }
    }
}


