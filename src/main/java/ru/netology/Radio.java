package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxWave = 9;
    private int minWave = 0;
    private int currentVolume;
    private int currentWave;
    private int clientWave = 10;

    public Radio() {
    }

    public Radio(int maxVolume, int minVolume, int maxWave, int minWave, int currentVolume, int currentWave, int clientWave) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxWave = maxWave;
        this.minWave = minWave;
        this.currentVolume = currentVolume;
        this.currentWave = currentWave;
        this.clientWave = clientWave;
    }

    public Radio(int clientWave) {
        if (clientWave < 0) {
            clientWave = 10;
        }
        this.maxWave = clientWave - 1;
        setClientWave(clientWave);
        setMaxWave(this.maxWave);
    }

    public int getMaxWave() {
        return maxWave;
    }

    public void setMaxWave(int maxWave) {
        maxWave = clientWave - 1;
        this.maxWave = maxWave;
    }

    public int getClientWave() {
        return clientWave;
    }

    public void setClientWave(int clientWave) {
        this.clientWave = clientWave;
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


