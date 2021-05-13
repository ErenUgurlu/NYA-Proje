package com.nya.akillicihaz.app;

public class Eyleyici {
	private static boolean sogutucuDurumu =false;
	
	public static void acKapa() {
		if(sogutucuDurumu) {
			sogutucuDurumu = !sogutucuDurumu;
			System.out.println("So�utucu Kapat�ld�");
		}
		else {
			sogutucuDurumu = !sogutucuDurumu;
			System.out.println("So�utucu A��ld�");
		}
	}
	public static String durumToString() {
		if(sogutucuDurumu) 
			return "A��k";
		else
			return "kapal�";
	}
	public static boolean isSogutucuDurumu() {
		return sogutucuDurumu;
	}
	public static void setSogutucuDurumu(boolean sogutucuDurumu) {
		Eyleyici.sogutucuDurumu = sogutucuDurumu;
	}
}
