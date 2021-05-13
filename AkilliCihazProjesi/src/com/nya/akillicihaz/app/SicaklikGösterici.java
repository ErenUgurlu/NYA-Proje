package com.nya.akillicihaz.app;

public class SicaklikGösterici implements IObserver {

	@Override
	public void update(int sicaklik) {
		System.out.println("Þu anki sýcaklýk "+sicaklik+"°C");
		
	}
}
