package com.ipartek.xf345.main;

import java.sql.SQLException;

import com.ipartek.xf345.beans.Cliente;
import com.ipartek.xf345.beans.Empleado;
import com.ipartek.xf345.beans.Menu;
import com.ipartek.xf345.beans.Operaciones;
import com.ipartek.xf345.beans.OperacionesBasedeDatos;
import com.ipartek.xf345.beans.Pedido;
import com.ipartek.xf345.utilidades.ObtencionTeclado;

public class MainAplicacion extends Operaciones {

	public static void main(String[] args) throws SQLException {
//		String cadena = ObtencionTeclado.recogerStringTeclado("Dame una cadena: ");
//		System.out.println("cadena: " + cadena);
//		int entero = ObtencionTeclado.recogerEnteroTeclado("Dame un entero: ");
//		System.out.println("entero: " + entero);
//		double real = ObtencionTeclado.recogerDoubleTeclado("Dame un real: ");
//		System.out.println("real: " + real);
//		
		OperacionesBasedeDatos operaciones = new OperacionesBasedeDatos();
		Empleado empleado = new Empleado();
		Cliente cliente = new Cliente();
		Pedido pedido = new Pedido();
		int codempleado = 0;
		int codcliente = 0;
		int codpedido = 0;
		String nombre;

		Menu menu = new Menu();
		menu.MenuPrincipal();
		int input = Integer.parseInt(ObtencionTeclado.recogerStringTeclado("Elija el codigo \n"));

		if (input == 1) {

			menu.MenuEmpleado();

			int input2 = Integer.parseInt(ObtencionTeclado.recogerStringTeclado("Elija el codigo \n"));

			switch (input2) {
			case 1:
				empleado = recogerEmpleado();
				operaciones.InsertEmpleado(empleado);

				break;

			case 2:

				empleado = recogerEmpleado();
				operaciones.UpdateEmpleado(empleado);
				break;
			case 3:
				codempleado = recogercodEmpleado();

				operaciones.DeleteEmpleado(codempleado);
				break;

			case 4:
				nombre = consultarNombreEmpleado();
				operaciones.ReadEmpleado(nombre);
				break;
			default:

				System.out.println("El valor elegido no es correcto");
				break;
			}
		}

		else if (input == 2) {
			menu.MenuCliente();
			int input3 = Integer.parseInt(ObtencionTeclado.recogerStringTeclado("Elija el codigo \n"));
			switch (input3) {
			case 1:
				cliente = recogerCliente();
				operaciones.InsertCliente(cliente);

				break;

			case 2:

				cliente = recogerCliente();
				operaciones.UpdateCliente(cliente);
				break;
			case 3:
				codcliente = recogercodCliente();
				operaciones.DeleteCliente(cliente);
				break;

			case 4:
				nombre = consultarNombreCliente();
				operaciones.ReadCliente(nombre);
				break;
			default:

				System.out.println("El valor elegido no es correcto");
				break;
			}
		} else {

			menu.MenuPedidos();
			int input4 = Integer.parseInt(ObtencionTeclado.recogerStringTeclado("Elija el codigo \n"));
			switch (input4) {
			case 1:
				pedido = recogerPedido();
				operaciones.InsertPedido(pedido);

				break;

			case 2:

				pedido = recogerPedido();
				operaciones.UpdatePedido(pedido);
				break;
			case 3:
				codpedido = recogerCodClientePedido();
				operaciones.DeletePedido(codpedido);
				break;

			case 4:
				nombre = consultarNombrePedido();
				operaciones.ReadPedido(nombre);
				break;
			default:

				System.out.println("El valor elegido no es correcto");
				break;

			}

		}

	}
}
