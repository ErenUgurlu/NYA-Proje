package com.nya.akillicihaz.app;

public interface ISubject {

    void registerObserver(IObserver iObserver);

    void removeObserver(IObserver iObserver);

    void notifyObservers();
}