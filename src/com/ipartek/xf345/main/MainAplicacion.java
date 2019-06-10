package com.ipartek.xf345.main;

import java.sql.SQLException;

import com.ipartek.xf345.beans.Cliente;
import com.ipartek.xf345.beans.Empleado;
import com.ipartek.xf345.beans.Pedido;
import com.ipartek.xf345.utilidades.ObtencionTeclado;

public class MainAplicacion {

	public static Empleado recogerEmpleado() {
		
		
		String input = ObtencionTeclado.recogerStringTeclado("Codigo de empleado \n");
	
		int codempleado = Integer.parseInt(input);
		
		
		String nombre = ObtencionTeclado.recogerStringTeclado("Nombre de empleado \n");
		
	
		String apellido = ObtencionTeclado.recogerStringTeclado("Apellido de empleado \n");
		
		 Empleado empleado= new Empleado(codempleado, nombre, apellido);
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
	

	//Cliente
	

	public static Cliente recogerCliente() {
		
		
		String input = ObtencionTeclado.recogerStringTeclado("Codigo de Cliente \n");
	
		int codcliente = Integer.parseInt(input);
		
		
		String nombre = ObtencionTeclado.recogerStringTeclado("Nombre de Cliente \n");
		
	
		int codempleado = Integer.parseInt(ObtencionTeclado.recogerStringTeclado("Codigo de empleado \n"));
		
		
		 Cliente cliente= new Cliente(codcliente, nombre, codempleado);
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





	public static void main(String[] args) throws SQLException {
//		String cadena = ObtencionTeclado.recogerStringTeclado("Dame una cadena: ");
//		System.out.println("cadena: " + cadena);
//		int entero = ObtencionTeclado.recogerEnteroTeclado("Dame un entero: ");
//		System.out.println("entero: " + entero);
//		double real = ObtencionTeclado.recogerDoubleTeclado("Dame un real: ");
//		System.out.println("real: " + real);
//		

	
		Empleado empleado = new Empleado();
		Cliente cliente = new Cliente();
		int codempleado= 0;
		int codcliente= 0;
		String nombre;
		System.out.println("Las opciones son:\n 1 Opciones Empleado \n 2 Opciones Cliente\n 3 Opciones Pedido \n ");		
		int input = Integer.parseInt(ObtencionTeclado.recogerStringTeclado("Elija el codigo \n"));
		
		
		
	if(input==1) {
		System.out.println("Las opciones son:\n 1 Insertar Usuario \n 2 Actualizar Usuario\n 3 Borrar Usuario \n 4 Consultar Usuario");		
		int input2 = Integer.parseInt(ObtencionTeclado.recogerStringTeclado("Elija el codigo \n"));
	

		switch (input2) {
		case 1:
			empleado= recogerEmpleado();
			empleado.InsertEmpleado(empleado);	
			
			break;
			
		case 2:
			
			empleado= recogerEmpleado();
			empleado.UpdateEmpleado(empleado);	
			break;
		case 3:
			codempleado= recogercodEmpleado();
			
			empleado.DeleteEmpleado(codempleado);	
			break;
			
		case 4:
			nombre= consultarNombreEmpleado();
			empleado.ReadEmpleado(nombre);
			break;
		default:
		
				System.out.println("El valor elegido no es correcto");
			break;
		}	
	}
	
	else if(input==2){
		
		System.out.println("Las opciones son:\n 1 Insertar Usuario \n 2 Actualizar Usuario\n 3 Borrar Usuario \n 4 Consultar Usuario ");
		int input3 = Integer.parseInt(ObtencionTeclado.recogerStringTeclado("Elija el codigo \n"));
		switch (input3) {
		case 1:
			cliente= recogerCliente();
			cliente.InsertCliente(cliente);	
			
			break;
			
		case 2:
			
			cliente= recogerCliente();
			cliente.UpdateCliente(cliente);	
			break;
		case 3:
			codcliente= recogercodCliente();
			cliente.DeleteCliente(cliente);	
			break;
			
		case 4:
			nombre= consultarNombreCliente();
			cliente.ReadCliente(nombre);
			break;
		default:
		
				System.out.println("El valor elegido no es correcto");
			break;
		}	
	}
		
		


	}

}
