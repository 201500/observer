package com.company;

public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
