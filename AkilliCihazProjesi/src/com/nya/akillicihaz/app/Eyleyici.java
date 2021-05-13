package com.nya.akillicihaz.app;

public class Eyleyici {
	private static boolean sogutucuDurumu =false;
	
	public static void acKapa() {
		if(sogutucuDurumu) {
			sogutucuDurumu = !sogutucuDurumu;
			System.out.println("Soðutucu Kapatýldý");
		}
		else {
			sogutucuDurumu = !sogutucuDurumu;
			System.out.println("Soðutucu Açýldý");
		}
	}
	public static String durumToString() {
		if(sogutucuDurumu) 
			return "Açýk";
		else
			return "kapalý";
	}
	public static boolean isSogutucuDurumu() {
		return sogutucuDurumu;
	}
	public static void setSogutucuDurumu(boolean sogutucuDurumu) {
		Eyleyici.sogutucuDurumu = sogutucuDurumu;
	}
}
