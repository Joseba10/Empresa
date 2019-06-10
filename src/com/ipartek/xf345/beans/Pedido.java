package com.ipartek.xf345.beans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pedido {
	
	
	private int codEmpleado;
	private String nombre;
	private int codCliente;
	private BaseDeDatos basededatos;
	
	
	//Constructor
		public Pedido(int codEmpleado, String nombre, int codCliente) {
			super();
			this.codEmpleado = codEmpleado;
			this.nombre = nombre;
			this.codCliente = codCliente;
		}
		
		
		//Metodos
		
		public void InsertPedido(Pedido pedido) throws SQLException {
			String sentenciaSql = "insert into pedido (codEmpleado,nombre,codCliente) values (?,?,?)";
			PreparedStatement pStmt = basededatos.conexion.prepareStatement(sentenciaSql);
			
			pStmt.setInt(1, pedido.codEmpleado);
			pStmt.setString(2, pedido.nombre);
			pStmt.setInt(3, pedido.codCliente);
			
			
			// Ejecuta
					pStmt.executeUpdate();
					// Cerrar lanzador sentencias SQL
					pStmt.close();
					// Cerrar conexión
					basededatos.conexion.close();
		}
		
		public void ReadPedido(Pedido pedido) throws SQLException {
	Statement stmt= basededatos.conexion.createStatement(); //Crea una sentencia sql
			

			String sentenciaSql = "Select codEmpleado,nombre,codCliente from cliente";
			ResultSet rs= stmt.executeQuery(sentenciaSql);
			boolean hayMas=rs.next();
			int codCliente = 0;
			String nombre = null;
			int codEmpleado = 0;
		
			
			while(hayMas) {
				
				codEmpleado= rs.getInt(pedido.codEmpleado);
				nombre=rs.getString(pedido.nombre);
				codCliente= rs.getInt(pedido.codCliente);
				System.out.println("El id es " + codCliente+" Nombre "+nombre + " codEmpleado " + codEmpleado);
				hayMas= rs.next();
			}		
			// Ejecuta
					((PreparedStatement) rs).execute();
					// Cerrar lanzador sentencias SQL
					stmt.close();
					// Cerrar conexión
					basededatos.conexion.close();
		}
		

		public void UpdatePedido(Pedido pedido) throws SQLException {
			
			String sentenciaSql = "update pedido set nombre=? where id=?";
			System.out.println(sentenciaSql);
			// Crea lanzador sentencias SQL preparadas
			PreparedStatement pStmt = basededatos.conexion.prepareStatement(sentenciaSql);
			pStmt.setString(1, pedido.nombre);
			pStmt.setInt(2, pedido.codEmpleado);
			// Ejecuta
			pStmt.executeUpdate();
			// Cerrar lanzador sentencias SQL
			pStmt.close();
			// Cerrar conexión
			basededatos.conexion.close();
		}
		
		public void DeletePedido(Pedido pedido) throws SQLException {


			String sentenciaSql = "delete from cliente where id=?";
			System.out.println(sentenciaSql);
			// Crea lanzador sentencias SQL preparadas
			PreparedStatement pStmt = basededatos.conexion.prepareStatement(sentenciaSql);
			pStmt.setInt(1, pedido.codCliente);
			//Ejecuta
			pStmt.executeUpdate();
			// Cerrar lanzador sentencias SQL
			pStmt.close();
			// Cerrar conexión
			basededatos.conexion.close();
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

		public int getCodCliente() {
			return codCliente;
		}

		public void setCodCliente(int codCliente) {
			this.codCliente = codCliente;
		}

		@Override
		public String toString() {
			return "Pedido [codEmpleado=" + codEmpleado + ", nombre=" + nombre + ", codCliente=" + codCliente + "]";
	}
	
	
	

}
