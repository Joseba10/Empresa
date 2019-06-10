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
		
		//Metodos
		
		
		public void InsertCliente(Cliente cliente) throws SQLException {
			
			String sentenciaSql = "insert into cliente (codCliente,nombre,codEmpleado) values (?,?,?)";
			PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);

			pStmt.setInt(1, cliente.codCliente);
			pStmt.setString(2, cliente.nombre);
			pStmt.setInt(3, cliente.codEmpleado);

			System.out.println(pStmt);
			// Ejecuta
			pStmt.executeUpdate();
			// Cerrar lanzador sentencias SQL
			pStmt.close();
			// Cerrar conexión
			conexion.close();

		}
		
		public void ReadCliente(String nombrecliente) throws SQLException {
			String sentenciaSql = "Select codcliente,nombre,codEmpleado from cliente where nombre=?";
			PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql); // Crea una sentencia sql
			pStmt.setString(1, nombrecliente);
			ResultSet rs = pStmt.executeQuery();

			boolean hayMas = rs.next();
			int codempleado = 0;
			int codcliente= 0;
			String nombre = null;
			

			while (hayMas) {
				codcliente = rs.getInt(1);
				nombre = rs.getString(2);
				codempleado = rs.getInt(3);
				System.out.println("El id es " + codempleado + " Nombre " + nombre + " Codempleado " + codempleado);
				hayMas = rs.next();
			}

			rs.close();
			// Cerrar lanzador sentencias SQL
			pStmt.close();
			// Cerrar conexión
			conexion.close();
		}
		public void UpdateCliente(Cliente cliente) throws SQLException {
			
			String sentenciaSql = "Update cliente set nombre=?,codempleado=? where codcliente=?";
		

			System.out.println(sentenciaSql);
			// Crea lanzador sentencias SQL preparadas
			PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);

			pStmt.setString(1, cliente.nombre);
			pStmt.setInt(2, cliente.codEmpleado);
			pStmt.setInt(3, cliente.codCliente);
			// Ejecuta
			pStmt.executeUpdate();
			// Cerrar lanzador sentencias SQL
			pStmt.close();
			// Cerrar conexión
			conexion.close();

		}
		
		public void DeleteCliente(Cliente cliente) throws SQLException {
			
			String sentenciaSql = "delete from cliente where codcliente=?";
			System.out.println(sentenciaSql);
			// Crea lanzador sentencias SQL preparadas
			PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);
			pStmt.setInt(1, codCliente);
			// Ejecuta
			pStmt.executeUpdate();
			// Cerrar lanzador sentencias SQL
			pStmt.close();
			// Cerrar conexión
			conexion.close();
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
