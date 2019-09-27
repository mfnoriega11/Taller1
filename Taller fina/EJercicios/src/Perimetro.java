import java.util.Scanner;
public class Perimetro {
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	float num1,parametro;
    	System.out.print("Ingrese primer valor del perimetro :");
    	num1=teclado.nextInt();
    	parametro=num1 * 4;
    	System.out.print("El parametro del cuadro  es:");
    	System.out.println(parametro);
    	
	}
}
