package com.ipartek.xf345.beans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacionesBasedeDatos extends Empleado {

	
	/***** Empleados ******/
	public void InsertEmpleado(Empleado empleado) throws SQLException {

		String sentenciaSql = "insert into empleado (codEmpleado,nombre,apellido) values (?,?,?)";
		PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);

		pStmt.setInt(1, empleado.getCodEmpleado());
		pStmt.setString(2, empleado.getNombre());
		pStmt.setString(3, empleado.getApellido());

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

		pStmt.setString(1, empleado.getNombre());
		pStmt.setString(2, empleado.getApellido());
		pStmt.setInt(3, empleado.getCodEmpleado());
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
	/***** Cliente ******/

	public void InsertCliente(Cliente cliente) throws SQLException {
		
		String sentenciaSql = "insert into cliente (codCliente,nombre,codEmpleado) values (?,?,?)";
		PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);

		pStmt.setInt(1, cliente.getCodCliente());
		pStmt.setString(2, cliente.getNombre());
		pStmt.setInt(3, cliente.getCodEmpleado());

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

		pStmt.setString(1, cliente.getNombre());
		pStmt.setInt(2, cliente.getCodEmpleado());
		pStmt.setInt(3, cliente.getCodCliente());
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
		pStmt.setInt(1, cliente.getCodCliente());
		// Ejecuta
		pStmt.executeUpdate();
		// Cerrar lanzador sentencias SQL
		pStmt.close();
		// Cerrar conexión
		conexion.close();
	}
	/******Pedidos*********/
	
	public void InsertPedido(Pedido pedido) throws SQLException {
		String sentenciaSql = "insert into pedido (codPedido,detalle,codCliente) values (?,?,?)";
		PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);
		
		pStmt.setInt(1, pedido.getcodPedido());
		pStmt.setString(2, pedido.getDetalle());
		pStmt.setInt(3, pedido.getCodCliente());
		
		
		// Ejecuta
				pStmt.executeUpdate();
				// Cerrar lanzador sentencias SQL
				pStmt.close();
				// Cerrar conexión
				conexion.close();
	}
	
	public void ReadPedido(String nombrepedido) throws SQLException {
		
		String sentenciaSql = "Select codPedido,detalle,codCliente from pedido where detalle=?";
	PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql); // Crea una sentencia sql
pStmt.setString(1, nombrepedido);
ResultSet rs = pStmt.executeQuery();


boolean hayMas = rs.next();
int codpedido = 0;
int codcliente= 0;
String detalle = null;


while (hayMas) {
	codpedido = rs.getInt(1);
	detalle = rs.getString(2);
	codcliente = rs.getInt(3);
	System.out.println("El id es " + codpedido + " Nombre " + detalle + " Codcliente " + codcliente);
	hayMas = rs.next();
}

rs.close();
// Cerrar lanzador sentencias SQL
pStmt.close();
// Cerrar conexión
conexion.close();
	}
	

	public void UpdatePedido(Pedido pedido) throws SQLException {
		
		String sentenciaSql = "update pedido set detalle=? where codcliente=?";
		System.out.println(sentenciaSql);
		// Crea lanzador sentencias SQL preparadas
		PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);
		pStmt.setString(1, pedido.getDetalle());
		pStmt.setInt(2, pedido.getcodPedido());
		// Ejecuta
		pStmt.executeUpdate();
		// Cerrar lanzador sentencias SQL
		pStmt.close();
		// Cerrar conexión
		conexion.close();
	}
	
	public void DeletePedido(int codcliente) throws SQLException {


		String sentenciaSql = "delete from pedido where codcliente=?";
		System.out.println(sentenciaSql);
		// Crea lanzador sentencias SQL preparadas
		PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);
		pStmt.setInt(1, codcliente);
		//Ejecuta
		pStmt.executeUpdate();
		// Cerrar lanzador sentencias SQL
		pStmt.close();
		// Cerrar conexión
		conexion.close();
	}
	
	
	
	
	
	
	
}
