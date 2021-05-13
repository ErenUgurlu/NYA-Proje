package com.nya.akillicihaz.app;

import java.sql.SQLException;

import com.nya.akillicihaz.dataAccess.KullaniciDAL;

public 
class KullaniciDogrulama {

	public static boolean kullaniciDogrula(String name, String password) throws SQLException  {
		KullaniciDAL kullanicilar = new KullaniciDAL();
		boolean key = false;
		
		for(int i = 0; i < kullanicilar.getAll().size();i++)
		{
			if( kullanicilar.getAll().get(i).getKullanici_adi().contains(name) && kullanicilar.getAll().get(i).getSifre().contains(password))
			{
				key = true;
				break;
			}
		}
		
		
		return key;
		
	}
	
	
}
