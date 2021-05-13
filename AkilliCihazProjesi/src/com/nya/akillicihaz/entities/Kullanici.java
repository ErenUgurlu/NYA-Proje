package com.nya.akillicihaz.entities;

public class Kullanici {
	
	public static class Builder{
		private String kullanici_adi;
		private String sifre;
		
		public Builder(String kullanici_adi,String sifre) {
			this.kullanici_adi = kullanici_adi;
			this.sifre = sifre;
		}
		
		public Kullanici build() {
			Kullanici kullanici = new Kullanici();
			kullanici.kullanici_adi = this.kullanici_adi;
			kullanici.sifre = this.sifre;
			
			return kullanici;
		}
	}
	
	private String kullanici_adi;
	private String sifre;

	
	private Kullanici() {
	}


	public String getKullanici_adi() {
		return kullanici_adi;
	}
	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	
}

