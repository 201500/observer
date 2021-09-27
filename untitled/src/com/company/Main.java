package com.company;

public class Main {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();
        station.addObserver(new ConsoleOberver());
        station.addObserver(new ConsoleOberver());
        station.setMeasurements(16,760);

    }
}