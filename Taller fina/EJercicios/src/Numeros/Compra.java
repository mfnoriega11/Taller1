package Numeros;

import java.util.Scanner;

public class Compra {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
    	float num2,precio;
    	int num1;
    	System.out.print("Ingrese la cantidad de productos :");
    	num1=teclado.nextInt();
    	System.out.print("Ingrese el valor de cada producto :");
    	num2=teclado.nextFloat();
    	precio=num1*num2;
    	System.out.print(" El valor que el cliente debe pagar es  :");
    	System.out.println(precio);
    	
	}	
}

