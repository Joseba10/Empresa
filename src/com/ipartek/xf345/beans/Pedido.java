package com.ipartek.xf345.beans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pedido extends BaseDeDatos {

	private int codPedido;
	private String detalle;
	private int codCliente;

	// Constructor
	public Pedido(int codPedido, String detalle, int codCliente) {
		super();
		this.codPedido = codPedido;
		this.detalle = detalle;
		this.codCliente = codCliente;
	}

	public Pedido() {

	}

	// Getter and Setter

	public int getcodPedido() {
		return codPedido;
	}

	public void setcodPedido(int codPedido) {
		this.codPedido = codPedido;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	@Override
	public String toString() {
		return "Pedido [codPedido=" + codPedido + ", detalle=" + detalle + ", codCliente=" + codCliente + "]";
	}

}
