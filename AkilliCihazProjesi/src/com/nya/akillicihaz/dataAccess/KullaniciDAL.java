package com.nya.akillicihaz.dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nya.akillicihaz.entities.Kullanici;

public class KullaniciDAL {

	private IDataBaseAccess db = new PostgresqlAccess();
	private String sql = "select * from kullanicilar";

	public List<Kullanici> getAll() throws SQLException {
		List<Kullanici> list = new ArrayList<Kullanici>();
		db.baglan();
		Connection conn = db.getConnection();

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			Kullanici tmp = new Kullanici.Builder( rs.getString("kullanici_adi"), rs.getString("sifre")).build();
			list.add(tmp);
		}
		return list;

	}
	
}
