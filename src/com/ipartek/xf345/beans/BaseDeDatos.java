package com.ipartek.xf345.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDeDatos {

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/empresa";
	String user = "root";
	String password = "root";
	// Carga driver
	Connection conexion=null;
public BaseDeDatos() {
		
	
	try {
		Class.forName(driver); 
		// Hace conexión
		  conexion = DriverManager.getConnection(url, user, password);
		
	} catch (Exception e) {
	System.out.println("No se a podido conectar con la base de datos");
	}
	
}

	

	
	
}
