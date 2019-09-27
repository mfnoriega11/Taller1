package TallerCuenta;
import java.util.Scanner;

public class Cuenta {
	public static void main(String[] args) {
	    boolean sal = false;
	    @SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
	   
	       String nombre = null,monto,si;
	        double saldo = 0;
	        double valor = 0;
	       
	    Scanner in = new Scanner(System.in);
	    do{
	    	System.out.println("      Biembenido a su Sistema de Manejo de Cuenta ");
	    	System.out.println("            Seleccionar la Opcion Deseada ");
	    	System.out.println("Ingresa 1 para agregar el titular del cuenta: ");
	        System.out.println("Ingresa 2 para agregar saldo a la cuenta: ");
	        System.out.println("Ingresa 3 para retirar saldo a la cuenta: ");
	        System.out.println("Ingresa 4 para verificar saldo del titular de la cuenta: ");
	        switch(in.next()){
	            case "1":
	         
	       
	        System.out.println("Ingrese el nombre del titular de la cuenta: ");
	        nombre=teclado.next();
	       
	        System.out.println(" Desea Ingresar el saldo de la cuenta si o no : ");
	        monto=teclado.next();
	        if (monto.equals("si"))
	        {
	           
	                System.out.println(" Ingrese el saldo de la cuenta : ");
	                saldo=teclado.nextDouble();
	   
	        }
	        else
	        {
	            saldo=0;
	        }
	       
	        break;              
	            case "2":
	             if (nombre.equals("")) {
	                 
	               System.out.println(" Se debe agregar primero un cliente : ");
	             }
	             else
	             {
	                System.out.println(" Ingrese el saldo a agregar a la cuenta : ");
	                valor=teclado.nextDouble();
	                if(valor>0)
	                {
	                    saldo = saldo+valor;
	                 }
	                else{
	                    System.out.println("No se puede ingresar un valor Negativo : ");
	                }
	               }
	               
	         
	       break;
	               
	            case "3":
	                if(saldo > 0)
	                {
	                   
	                    System.out.println(" Ingrese el saldo a retirar de la cuenta : ");
	                     valor=teclado.nextDouble();
	               
	                    if (valor <= saldo && valor>0)
	                     {
	                        saldo=saldo-valor;
	                        System.out.println(" El nuevo saldo es  : ");
	                        System.out.println(saldo);
	                     }
	                     else
	                     {
	                          System.out.println(" SALDO INSUFICIENTE o el valor ingresado es negativo : ");
	                         
	                     }
	                }
	                else
	                {
	                      System.out.println(" NO tiene saldo en la cuenta : ");
	               
	                }
	                break;  
	               
	          case "4":
	                        System.out.print( "El titular del cuenta " + nombre);
	                        System.out.println(" El  saldo a la fecha es   : ");
	                        System.out.println(saldo);
	                         
	        }
	        System.out.println("¿Salir de este bucle ingrese Si?");
	        if(in.next().equalsIgnoreCase("Si")) sal=true;
	        else sal=false;
	        
	    }while(!sal);

	   
	   }    
	 
	 
	}


