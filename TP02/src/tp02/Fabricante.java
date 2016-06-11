package tp02;

public class Fabricante {
	
	private String nombre;
	private String telefono;
	private String direccion;
	
	
	
	public Fabricante() {
		// TODO Auto-generated constructor stub
		
	}

	public Fabricante(String _nombre, String _telefono, String _direccion) {
		
		nombre = _nombre;
		telefono = _telefono;
		direccion = _direccion;
		
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



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
