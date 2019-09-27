package Taller;

import java.util.Scanner;



public class Menuagenda {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 boolean sal = false;
        Scanner teclado = new Scanner(System.in);
       
        
       
        Agenda agendaTelefonica = new Agenda(2);
        String nombre;
        String correo;
        String telefono;

        Contacto c;
        Scanner in = new Scanner(System.in);
        do{
	        System.out.println("1. Añadir contacto: ");
	        System.out.println("2. Listar contactos ");
	        System.out.println("3. Buscar contacto ");
	        System.out.println("4. Espacios disponibles ");
	        System.out.println("5. Verificar si la agenda esta llena");
	        switch(in.next()){
	            case "1":
	            	
	          
	         
	            	 System.out.println("Escribe el nombre del Contacto");
                     nombre = teclado.next();
                     

                     System.out.println("Escribe el numero del Contacto");
                     telefono = teclado.next();
                     
                     System.out.println("Escribe el Correo  del Contacto");
                     correo = teclado.next();

                  
                     c = new Contacto(nombre, telefono, correo);

                 	agendaTelefonica.agregarContacto(c);

	    
	        break;              
	            case "2":
	            	agendaTelefonica.listarContactos();
	         
	       break;
	               
	            case "3":
	            	System.out.println("Escribe un nombre");
                    nombre = teclado.next();

                    agendaTelefonica.buscarcontacto(nombre);;

                    break;
	            	
	          
	               
	          case "4":

                  System.out.println("Hay " + agendaTelefonica.espaciolibre() + " espacios  libres en la agenda");

	        	  break;  
	        	  
	          case "5": 

                  if (agendaTelefonica.agendaLlena()) {
                      System.out.println("La agenda esta llena");
                  } else {
                      System.out.println("Aun se puede ingresar contactos");
                  }

                  break;
	        	  
	        	  
	        }
	        System.out.println("¿Si desesa salir del sistema digite Si ?");
	        if(in.next().equals("Si")) sal=true;
	        else sal=false;
	        
	    }while(!sal);

	   
	   }    
	 
	 
	}



