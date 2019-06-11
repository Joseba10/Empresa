package com.ipartek.xf345.beans;

import com.ipartek.xf345.utilidades.ObtencionTeclado;

public class Operaciones {

	/** Operaciones Empleado **/

	public static Empleado recogerEmpleado() {

		String input = ObtencionTeclado.recogerStringTeclado("Codigo de empleado \n");

		int codempleado = Integer.parseInt(input);

		String nombre = ObtencionTeclado.recogerStringTeclado("Nombre de empleado \n");

		String apellido = ObtencionTeclado.recogerStringTeclado("Apellido de empleado \n");

		Empleado empleado = new Empleado(codempleado, nombre, apellido);
		return empleado;
	}

	public static int recogercodEmpleado() {

		String input = ObtencionTeclado.recogerStringTeclado("Codigo de empleado \n");

		int codempleado = Integer.parseInt(input);

		return codempleado;
	}

	public static String consultarNombreEmpleado() {

		String input = ObtencionTeclado.recogerStringTeclado("Nombre de empleado \n");

		return input;
	}

	/** Operaciones Cliente **/

	public static Cliente recogerCliente() {

		String input = ObtencionTeclado.recogerStringTeclado("Codigo de Cliente \n");

		int codcliente = Integer.parseInt(input);

		String nombre = ObtencionTeclado.recogerStringTeclado("Nombre de Cliente \n");

		int codempleado = Integer.parseInt(ObtencionTeclado.recogerStringTeclado("Codigo de empleado \n"));

		Cliente cliente = new Cliente(codcliente, nombre, codempleado);
		return cliente;
	}

	public static String consultarNombreCliente() {

		String input = ObtencionTeclado.recogerStringTeclado("Nombre de Cliente \n");

		return input;
	}

	public static int recogercodCliente() {

		String input = ObtencionTeclado.recogerStringTeclado("Codigo de Cliente \n");

		int codcliente = Integer.parseInt(input);

		return codcliente;
	}

	/** Operaciones Pedidos **/
	
	
	public static Pedido recogerPedido() {

		int codpedido =Integer.parseInt( ObtencionTeclado.recogerStringTeclado("Codigo de pedido \n"));

		String nombre = ObtencionTeclado.recogerStringTeclado("Detalle \n");

		int codcliente = Integer.parseInt(ObtencionTeclado.recogerStringTeclado("Codigo de Cliente \n"));
	

		Pedido pedido = new Pedido(codpedido, nombre, codcliente);
		return pedido;
	}
	
	
	public static String consultarNombrePedido() {

		String input = ObtencionTeclado.recogerStringTeclado("Nombre de Cliente \n");

		return input;
	}

	public static int recogerCodClientePedido() {

		String input = ObtencionTeclado.recogerStringTeclado("Codigo de Cliente \n");

		int codcliente = Integer.parseInt(input);

		return codcliente;
	}

}
