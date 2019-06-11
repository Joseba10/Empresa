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
