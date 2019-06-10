package com.ipartek.xf345.beans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Empleado extends BaseDeDatos {

	private int codEmpleado;
	private String nombre;
	private String apellido;

	// Constructor
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
		PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);

		pStmt.setInt(1, empleado.codEmpleado);
		pStmt.setString(2, empleado.nombre);
		pStmt.setString(3, empleado.apellido);

		System.out.println(pStmt);
		// Ejecuta
		pStmt.executeUpdate();
		// Cerrar lanzador sentencias SQL
		pStmt.close();
		// Cerrar conexión
		conexion.close();

	}

	public void ReadEmpleado(String nombreempleado) throws SQLException {

		String sentenciaSql = "Select codEmpleado,nombre,apellido from empleado where nombre=?";
		PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql); // Crea una sentencia sql
		pStmt.setString(1, nombreempleado);
		ResultSet rs = pStmt.executeQuery();

		boolean hayMas = rs.next();
		int codempleado = 0;
		String nombre = null;
		String apellido = null;

		while (hayMas) {
			codempleado = rs.getInt(1);
			nombre = rs.getString(2);
			apellido = rs.getString(3);
			System.out.println("El id es " + codempleado + " Nombre " + nombre + " Apellido " + apellido);
			hayMas = rs.next();
		}

		rs.close();
		// Cerrar lanzador sentencias SQL
		pStmt.close();
		// Cerrar conexión
		conexion.close();

	}

	public void UpdateEmpleado(Empleado empleado) throws SQLException {

		String sentenciaSql = "Update empleado set nombre=?, apellido=? where codEmpleado=?";

		System.out.println(sentenciaSql);
		// Crea lanzador sentencias SQL preparadas
		PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);

		pStmt.setString(1, empleado.nombre);
		pStmt.setString(2, empleado.apellido);
		pStmt.setInt(3, empleado.codEmpleado);
		// Ejecuta
		pStmt.executeUpdate();
		// Cerrar lanzador sentencias SQL
		pStmt.close();
		// Cerrar conexión
		conexion.close();
	}

	public void DeleteEmpleado(int codEmpleado) throws SQLException {
		String sentenciaSql = "delete from empleado where codEmpleado=?";
		System.out.println(sentenciaSql);
		// Crea lanzador sentencias SQL preparadas
		PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);
		pStmt.setInt(1, codEmpleado);
		// Ejecuta
		pStmt.executeUpdate();
		// Cerrar lanzador sentencias SQL
		pStmt.close();
		// Cerrar conexión
		conexion.close();
	}

	// Getter and Setter
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
