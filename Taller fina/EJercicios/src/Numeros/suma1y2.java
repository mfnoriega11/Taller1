package Numeros;

import java.util.Scanner;

public class suma1y2 {
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	int num1,num2,num3,num4,suma,producto;
    	System.out.print("Ingrese el primer numero :");
    	num1=teclado.nextInt();
    	System.out.print("Ingrese el segundo numero :");
    	num2=teclado.nextInt();
    	System.out.print("Ingrese el tercer numero :");
    	num3=teclado.nextInt();
    	System.out.print("Ingrese el cuarto numero :");
    	num4=teclado.nextInt();
    	suma=num1+num2;
    	producto=num3*num4;
    	System.out.print("la suma del primer y segundo  numeros es :");
    	System.out.println(suma);
    	System.out.print("El producto entre el tercer y cuarto numero es :");
    	System.out.println(producto);
	}	
}
