package com.nya.akillicihaz.app;

import java.sql.SQLException;
import java.util.*;

public class App {

	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ak�ll� Cihaz Aray�z�ne Ho� Geldiniz Kullan�c� Ad� Ve �ifrenizi Giriniz");
		System.out.print("Kullanici Adi: ");
		String kullaniciAdi = scanner.nextLine();
		System.out.print("Sifre: ");
		String sifre = scanner.nextLine();
		
		int secim = 0;

		if (KullaniciDogrulama.kullaniciDogrula(kullaniciAdi, sifre)) {
			System.out.println("Giri� Ba�ar�l�..");
			do {
				System.out.println("--------------------------------------");
				System.out.println("�u Anki So�utucu Durumu: " + Eyleyici.durumToString());
				System.out.println("Yapmak istedi�iniz i�lemi se�iniz..");
				System.out.println("1-Anl�k S�cakl�k G�ster");
				if (Eyleyici.isSogutucuDurumu()) {
					System.out.println("2-So�utucuyu Kapat");
				} else {
					System.out.println("2-So�utucuyu A�");
				}
				System.out.println("3-��k�� Yap");
				secim = scanner.nextInt();

				switch (secim) {
				case 1:
					final SicaklikArabirimi sicaklikArabirimi = new SicaklikArabirimi();
					final SicaklikG�sterici sicaklikG�sterici = new SicaklikG�sterici();
					sicaklikArabirimi.registerObserver(sicaklikG�sterici);
					sicaklikArabirimi.sicaklikOlc();
					break;
				case 2:
					Eyleyici.acKapa();
					break;
				case 3:
					System.out.println("��k�� Yap�ld�..");
					break;
				default:
					System.out.println("Ge�ersiz Se�im..");
				}
			} while (secim != 3);
		} else {
			System.out.println("Ge�ersiz Kullan�c�Ad� veya �ifre..");
		}

		scanner.close();
	}

}
