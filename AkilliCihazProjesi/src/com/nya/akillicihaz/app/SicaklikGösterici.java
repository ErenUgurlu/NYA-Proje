package com.nya.akillicihaz.app;

public class SicaklikG�sterici implements IObserver {

	@Override
	public void update(int sicaklik) {
		System.out.println("�u anki s�cakl�k "+sicaklik+"�C");
		
	}
}
