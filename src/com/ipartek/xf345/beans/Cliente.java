package com.ipartek.xf345.beans;

public class Cliente {

	private int codCliente;
	private String nombre;
	private int codEmpleado;

	// Constructor
	public Cliente(int codCliente, String nombre, int codEmpleado) {
		super();
		this.codCliente = codCliente;
		this.nombre = nombre;
		this.codEmpleado= codEmpleado;
	}
	
	//Metodos
	
	
	public void InsertCliente(Cliente empleado) {
		return;
	}
	
	public void ReadCliente(Cliente empleado) {
		return;
	}
	public void UpdateCliente(Cliente empleado) {
		return;
	}
	
	public void DeleteCliente(Cliente empleado) {
		return;
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
