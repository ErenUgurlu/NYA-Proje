package com.nya.akillicihaz.app;

import java.util.*;


public class SicaklikArabirimi implements ISubject {

    private final List<IObserver> observers;
    private int sicaklik;
    
	public int rasgeleSicaklik() {
		sicaklik = (int)(Math.random()*40);
		return sicaklik;
	}
    public SicaklikArabirimi() {
        observers = new ArrayList<>();
    }
	@Override
	public void registerObserver(IObserver observer) {
        if (!observers.contains(observer)) {
            this.observers.add(observer);
        }
	}
	@Override
	public void removeObserver(IObserver observer) {
		this.observers.remove(observer);
	}
	@Override
	public void notifyObservers() {
        for (IObserver o : observers) {
            o.update(sicaklik);
        }
	}
	public void sicaklikDegisimi() {
        notifyObservers();
    }
    public void sicaklikOlc() {
    	sicaklik = rasgeleSicaklik();
    	sicaklikDegisimi();
    }
}
