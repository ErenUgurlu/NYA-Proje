package com.nya.akillicihaz.dataAccess;

import java.sql.Connection;

public interface IDataBaseAccess {

	void baglan();
	Connection getConnection();
}
