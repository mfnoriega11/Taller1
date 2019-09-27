package Taller;


public class Agenda {
	

	private Contacto[] contactos;

	 public Agenda() {
	        this.contactos = new Contacto[15]; 
	   
	 
	 }


	    public Agenda(int tamanio) {
	        this.contactos = new Contacto[15]; 
	    }
	 
	    public void agregarContacto(Contacto c) {

	       
	    	if (existeContacto(c)) { 
	            System.out.println("El contacto con ese nombre ya existe");
	        } else if (agendaLlena()) 
	        { 
	            System.out.println("La agenda esta llena, no se pueden meter mas contactos");
	        } else 
	        {
	        	
	        	
	    
	            boolean encontrado = false;
	            for (int i = 0; i < contactos.length && !encontrado; i++) 
	            {
	                if (contactos[i] == null) 
	                { 
	                    contactos[i] = c; 
	                    encontrado = true; 
	                }
	            }

	            if (encontrado) {
	                System.out.println("Contacto agreado ");
	            } else {
	                System.out.println("No puede agreagr el contacto");
	            }
	            
	        }
	    	
	        }
	    
	    public boolean existeContacto(Contacto c) {

	        for (int i = 0; i < contactos.length; i++) {
	            if (contactos[i] != null && c.getNombre().equalsIgnoreCase(contactos[i].getNombre())) {
	                return true;
	            }
	        }
	        return false;

	    }
	    
	    public void listarContactos() {

	        if (espaciolibre() == contactos.length) {
	            System.out.println("No hay contactos que mostrar");
	        } else {
	            for (int i = 0; i < contactos.length; i++) {
	                if (contactos[i] != null) { 
	                    System.out.println(contactos[i]);
	                }
	            }
	        }

	    }
	    
	    public void buscarcontacto(String nombre) {

	        boolean encontrado = false;
	        for (int i = 0; i < contactos.length && !encontrado; i++) {
	            
	            if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
	            	
	            	System.out.println("El contacto    " + contactos[i].getNombre());
	            	System.out.println("Su telefono es " + contactos[i].getTelefono()); 
	                System.out.println("Su correo   es " + contactos[i].getCorreo()); 
	                encontrado = true; 
	            }
	        }

	        if (!encontrado) {
	            System.out.println("No se ha encontrado el contacto");
	        }

	    }
	    
	    public boolean agendaLlena() {

	        for (int i = 0; i < contactos.length; i++) 
	        {
	            if (contactos[i] == null) 
	            { 
	                return false; 
	            }
	        }

	        return true; 

	    }
	    
	    public int espaciolibre() {

	        int contadorLibres = 0;
	        for (int i = 0; i < contactos.length; i++) {
	            if (contactos[i] == null)
	            { 
	                contadorLibres++; 
	            }
	        }

	        return contadorLibres;

	    }
	    
	    
	    }


