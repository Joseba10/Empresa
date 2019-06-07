package com.ipartek.xf345.beans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Empleado {
	
	private int codEmpleado;
	private String nombre;
	private String apellido;
	private BaseDeDatos basededatos;
	
		
	//Constructor
	public Empleado(int codEmpleado, String nombre, String apellido) {
		super();
		this.codEmpleado = codEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Empleado() {
		super();
	}
	
	public void InsertEmpleado(Empleado empleado) throws SQLException {
		
		String sentenciaSql = "insert into empleado (codEmpleado,nombre,apellido) values (?,?,?)";
		PreparedStatement pStmt = basededatos.conexion.prepareStatement(sentenciaSql);
		
		pStmt.setInt(1, empleado.codEmpleado);
		pStmt.setString(2, empleado.nombre);
		pStmt.setString(3, empleado.apellido);
		
		
		// Ejecuta
				pStmt.executeUpdate();
				// Cerrar lanzador sentencias SQL
				pStmt.close();
				// Cerrar conexión
				basededatos.conexion.close();
				
	}
	
	public void ReadEmpleado(Empleado empleado) throws SQLException {
		Statement stmt= basededatos.conexion.createStatement(); //Crea una sentencia sql
		

		String sentenciaSql = "Select codEmpleado,nombre,apellido from empleado";
		ResultSet rs= stmt.executeQuery(sentenciasql);
		boolean hayMas=rs.next();
		int id = 0;
		String nombre = null;
		String apellido = null;
		int edad = 0;
		
		while(hayMas) {
			
			id= rs.getInt(1);
			nombre=rs.getString(2);
			apellido= rs.getString(3);
			edad=rs.getInt(4);
			System.out.println("El id es " + id+" Nombre "+nombre + " Apellido " + apellido + " Edad "  + edad);
			hayMas= rs.next();
		}		
		// Ejecuta
				pStmt.execute();
				// Cerrar lanzador sentencias SQL
				pStmt.close();
				// Cerrar conexión
				basededatos.conexion.close();
				
	}
	public void UpdateEmpleado(Empleado empleado) {
		return;
	}
	
	public void DeleteEmpleado(Empleado empleado) {
		return;
	}
	
	
	
	
	
	
	//Getter and Setter
	public int getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Empleado [codEmpleado=" + codEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

}
