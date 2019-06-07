package com.ipartek.xf345.beans;

public class Pedido {
	
	
	private int codEmpleado;
	private String nombre;
	private int codCliente;
	
	//Constructor
	public Pedido(int codEmpleado, String nombre, int codCliente) {
		super();
		this.codEmpleado = codEmpleado;
		this.nombre = nombre;
		this.codCliente = codCliente;
	}
	
	
	//Metodos
	
	public void InsertPedido(Pedido empleado) {
		return;
	}
	
	public void ReadPedido(Pedido empleado) {
		return;
	}
	public void UpdatePedido(Pedido empleado) {
		return;
	}
	
	public void DeletePedido(Pedido empleado) {
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
