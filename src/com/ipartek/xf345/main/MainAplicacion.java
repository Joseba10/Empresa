package com.ipartek.xf345.main;

import com.ipartek.xf345.beans.Cliente;
import com.ipartek.xf345.beans.Empleado;
import com.ipartek.xf345.beans.Pedido;
import com.ipartek.xf345.utilidades.ObtencionTeclado;

public class MainAplicacion {

	public static void main(String[] args) {
		String cadena = ObtencionTeclado.recogerStringTeclado("Dame una cadena: ");
		System.out.println("cadena: " + cadena);
		int entero = ObtencionTeclado.recogerEnteroTeclado("Dame un entero: ");
		System.out.println("entero: " + entero);
		double real = ObtencionTeclado.recogerDoubleTeclado("Dame un real: ");
		System.out.println("real: " + real);
		
		Empleado empleado= new Empleado(1, "Pepe", "Jimenez");
		Cliente cliente= new Cliente(1,"Jesus",empleado.getCodEmpleado());
		Pedido pedido= new Pedido(empleado.getCodEmpleado(), "Bicicleta", cliente.getCodCliente());
		
		

	}

}
