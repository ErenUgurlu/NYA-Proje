package com.nya.akillicihaz.app;

import java.sql.SQLException;
import java.util.*;

public class App {

	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Akýllý Cihaz Arayüzüne Hoþ Geldiniz Kullanýcý Adý Ve Þifrenizi Giriniz");
		System.out.print("Kullanici Adi: ");
		String kullaniciAdi = scanner.nextLine();
		System.out.print("Sifre: ");
		String sifre = scanner.nextLine();
		
		int secim = 0;

		if (KullaniciDogrulama.kullaniciDogrula(kullaniciAdi, sifre)) {
			System.out.println("Giriþ Baþarýlý..");
			do {
				System.out.println("--------------------------------------");
				System.out.println("Þu Anki Soðutucu Durumu: " + Eyleyici.durumToString());
				System.out.println("Yapmak istediðiniz iþlemi seçiniz..");
				System.out.println("1-Anlýk Sýcaklýk Göster");
				if (Eyleyici.isSogutucuDurumu()) {
					System.out.println("2-Soðutucuyu Kapat");
				} else {
					System.out.println("2-Soðutucuyu Aç");
				}
				System.out.println("3-Çýkýþ Yap");
				secim = scanner.nextInt();

				switch (secim) {
				case 1:
					final SicaklikArabirimi sicaklikArabirimi = new SicaklikArabirimi();
					final SicaklikGösterici sicaklikGösterici = new SicaklikGösterici();
					sicaklikArabirimi.registerObserver(sicaklikGösterici);
					sicaklikArabirimi.sicaklikOlc();
					break;
				case 2:
					Eyleyici.acKapa();
					break;
				case 3:
					System.out.println("Çýkýþ Yapýldý..");
					break;
				default:
					System.out.println("Geçersiz Seçim..");
				}
			} while (secim != 3);
		} else {
			System.out.println("Geçersiz KullanýcýAdý veya Þifre..");
		}

		scanner.close();
	}

}
