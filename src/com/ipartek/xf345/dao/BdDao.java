package com.ipartek.xf345.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.ipartek.xf345.beans.Cliente;
import com.ipartek.xf345.beans.Empleado;
import com.ipartek.xf345.beans.Pedido;

public interface BdDao{

	/*******Empleado DAO
	 * @throws SQLException 
	 * @throws IOException *********/
	public void InsertEmpleado(Empleado empleado) throws SQLException;
	public void ReadEmpleado(String nombreempleado) throws SQLException ;
	public void UpdateEmpleado(Empleado empleado) throws SQLException ;
	public void DeleteEmpleado(int codEmpleado) throws SQLException ;
		
	/*******Cliente DAO
	 * @throws SQLException 
	 * @throws IOException *********/
	
	public void InsertCliente(Cliente cliente) throws SQLException, IOException ;
	
	public void ReadCliente(String nombrecliente) throws SQLException ;
	
	public void UpdateCliente(Cliente cliente) throws SQLException ;
	
	public void DeleteCliente(Cliente cliente) throws SQLException ;
	
	
	/****** Pedidos 
	 * @throws SQLException *********/

	public void InsertPedido(Pedido pedido) throws SQLException ;
	
	public void ReadPedido(String nombrepedido) throws SQLException ;
	
	public void UpdatePedido(Pedido pedido) throws SQLException ;
	
	public void DeletePedido(int codcliente) throws SQLException ;
		
}
