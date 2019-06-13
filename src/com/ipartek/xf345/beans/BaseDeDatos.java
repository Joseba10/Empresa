package com.ipartek.xf345.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDeDatos {
private static final String DRIVER = "com.mysql.jdbc.Driver";
	
private static final String URL = "jdbc:mysql://localhost/empresa";
private static final String USER = "root";
private static final String PASSWORD = "root";
	// Carga driver
	protected Connection conexion = null;

	public BaseDeDatos() {

		try {
			Class.forName(DRIVER);
			// Hace conexión
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (Exception e) {
			System.out.println("No se a podido conectar con la base de datos");
		}

	}

}
