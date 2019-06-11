package com.ipartek.xf345.beans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente extends BaseDeDatos {

	private int codCliente;
	private String nombre;
	private int codEmpleado;
	private BaseDeDatos basededatos;
	
	public Cliente() {
		super();
	}

	// Constructor
		public Cliente(int codCliente, String nombre, int codEmpleado) {
			super();
			this.codCliente = codCliente;
			this.nombre = nombre;
			this.codEmpleado= codEmpleado;
		}
		

	//Getter and Setter
		public int getCodCliente() {
			return codCliente;
		}

		public void setCodCliente(int codCliente) {
			this.codCliente = codCliente;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getCodEmpleado() {
			return codEmpleado;
		}

		public void setCodEmpleado(int codEmpleado) {
			this.codEmpleado = codEmpleado;
		}

		@Override
		public String toString() {
			return "Cliente [codCliente=" + codCliente + ", nombre=" + nombre + ", codEmpleado=" + codEmpleado + "]";
		}


}
