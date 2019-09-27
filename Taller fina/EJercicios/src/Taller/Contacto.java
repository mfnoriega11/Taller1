package Taller;


public class Contacto {
	
	private String nombre;
    private String telefono;
	private String correo;
    
    
    public Contacto(String nombre, String telefono, String correo) {
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setCorreo(correo);
    }




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono2) {
		this.telefono = telefono2;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}
    
	/**Me indica si el el nombre es repetido
	   */
	  public boolean equals(Contacto c){
	        
	        if(this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())){
	            return true;
	        }
	        
	        return false;
	        
	    }
	    
	  
	    @Override
	    public String toString() {
	        return "nombre=" + nombre + ", telefono=" + telefono + ",correo="+correo;
	    }
	    

    
    

}
