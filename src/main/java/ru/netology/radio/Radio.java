package ru.netology.radio;

public class Radio {
    //поле "Радиостанции"
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;

    //поле "Громкость"
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    //Конструкторы для "Радиостанций"
    public Radio(int size) {
        maxStation = size - 1;
    }

    public Radio(){
    }

    //геттеры "Радиостанции"
    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    //сеттер "Радиостанции"
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    //геттер "Громкость"
    public int getCurrentVolume() {
        return currentVolume;
    }

    //сеттер "Громкость"
    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    //увеличение громкости на 1
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    //уменьшение громкости на 1
    public void loweringVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    //увеличение номера радиостанции на 1
    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    //уменьшение номера радиостанции на 1
    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }
}
