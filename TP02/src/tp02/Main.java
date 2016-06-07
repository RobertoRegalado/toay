package tp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
	}
		
	public static void main(String[] args) throws IOException 
	{
		Fabricante fabricante1 = new Fabricante();
		Fabricante fabricante2 = new Fabricante();
		Televisor tele1 = new Televisor();
		Televisor tele2 = new Televisor();
		AireAcondicionado aire1 = new AireAcondicionado();
		AireAcondicionado aire2 = new AireAcondicionado();
		
		for(int i=1;i<3;i++){
		
			if (i==1) {
				System.out.println("Ingrese Nombre Fabricante");
				fabricante1.setNombre(leeteclado());
				System.out.println("Ingrese Telefono del Fabricante "+fabricante1.getNombre());
				fabricante1.setTelefono(leeteclado());
				System.out.println("Ingrese Direccion del Fabricante "+fabricante1.getNombre());
				fabricante1.setDireccion(leeteclado());
				tele1.setFabricante(fabricante1);//asigno el fabricante 1 al televisor1
				System.out.println("Ingrese el modelo del Televisor "+ i);
				tele1.setModelo(leeteclado());
				System.out.println("Ingrese el precio del Televisor "+ i);
				tele1.setPrecio(Double.valueOf(Integer.valueOf(leeteclado())));//convierte el string ne double
				System.out.println("Ingrese la cantidad en stock del Televisor "+ i);
				tele1.setStock(Integer.valueOf(leeteclado()));//toma solo el valor numerico y lo almacena como integer 
				System.out.println("Ingrese las Pulgadas del Televisor "+ i);
				tele1.setPulgadas(Integer.valueOf(Integer.valueOf(leeteclado())));//convierte el string ne integer
				System.out.println("Ingrese si el televisor posee HDMI o no Televisor "+ i);
				tele1.setPoseeHDMI(Boolean.valueOf(leeteclado()));//toma solo el valor numerico y lo almacena como Boolean
				aire1.setFabricante(fabricante1);
				System.out.println("Ingrese el modelo del Aire Acondicionado "+ i);
				aire1.setModelo(leeteclado());
				System.out.println("Ingrese el precio del Aire Acondicionado "+ i);
				aire1.setPrecio(Double.valueOf(Integer.valueOf(leeteclado())));//convierte el string ne double
				System.out.println("Ingrese la cantidad en stock del Aire Acondicionado "+ i);
				aire1.setStock(Integer.valueOf(leeteclado()));//toma solo el valor numerico y lo almacena como integer 
				System.out.println("Ingrese las Frigorias del Aire Acondicionado "+ i);
				aire1.setFrigorias(Integer.valueOf(Integer.valueOf(leeteclado())));
			}
		else{
				System.out.println("Ingrese Nombre Fabricante");
				fabricante2.setNombre(leeteclado());
				System.out.println("Ingrese Telefono del Fabricante "+fabricante2.getNombre());
				fabricante2.setTelefono(leeteclado());
				System.out.println("Ingrese Direccion del Fabricante "+fabricante2.getNombre());
				fabricante2.setDireccion(leeteclado());
				tele2.setFabricante(fabricante2);
				System.out.println("Ingrese el modelo del Televisor "+ i);
				tele2.setModelo(leeteclado());
				System.out.println("Ingrese el precio del Televisor "+ i);
				tele2.setPrecio(Double.valueOf(Integer.valueOf(leeteclado())));
				System.out.println("Ingrese la cantidad en stock del Televisor "+ i);
				tele2.setStock(Integer.valueOf(leeteclado()));
				System.out.println("Ingrese las Pulgadas del Televisor "+ i);
				tele2.setPulgadas(Integer.valueOf(Integer.valueOf(leeteclado())));
				System.out.println("Ingrese si el televisor posee HDMI o no Televisor "+ i);
				tele2.setPoseeHDMI(Boolean.valueOf(leeteclado()));
				aire2.setFabricante(fabricante1);
				System.out.println("Ingrese el modelo del Aire Acondicionado "+ i);
				aire2.setModelo(leeteclado());
				System.out.println("Ingrese el precio del Aire Acondicionado "+ i);
				aire2.setPrecio(Double.valueOf(Integer.valueOf(leeteclado())));
				System.out.println("Ingrese la cantidad en stock del Aire Acondicionado "+ i);
				aire2.setStock(Integer.valueOf(leeteclado()));
				System.out.println("Ingrese las Frigorias del Aire Acondicionado "+ i);
				aire2.setFrigorias(Integer.valueOf(Integer.valueOf(leeteclado())));
			}
		}
		
		//muestra en pantalla lo cargado anteriormente
		for(int i=1;i<3;i++){
			
			if (i==1) {
				System.out.println("");
				System.out.println("Fabricante "+i);
				System.out.println("Nombre: "+fabricante1.getNombre());
				System.out.println("Telefono "+fabricante1.getTelefono());
				System.out.println("Direccion "+fabricante1.getDireccion());
				System.out.println("");
				System.out.println("Televisor "+i );
				System.out.println("Modelo: "+tele1.getModelo());
				System.out.println("Precio: "+tele1.getPrecio());
				System.out.println("Stock: "+tele1.getStock());
				System.out.println("Pulgadas: "+tele1.getPulgadas());
				System.out.println("Posee HDMI: "+tele1.getPoseeHDMI());
				System.out.println("");
				System.out.println("Aire Acondicionado "+i );
				System.out.println("Modelo: "+aire1.getModelo());
				System.out.println("Precio: "+aire1.getPrecio());
				System.out.println("Stock: "+aire1.getStock());
				System.out.println("Frigorias: "+aire1.getFrigorias());
			}
		else{
			System.out.println("");
			System.out.println("Fabricante "+i);
			System.out.println("Nombre: "+fabricante2.getNombre());
			System.out.println("Telefono "+fabricante2.getTelefono());
			System.out.println("Direccion "+fabricante2.getDireccion());
			System.out.println("");
			System.out.println("Televisor "+i );
			System.out.println("Modelo: "+tele2.getModelo());
			System.out.println("Precio: "+tele2.getPrecio());
			System.out.println("Stock: "+tele2.getStock());
			System.out.println("Pulgadas: "+tele2.getPulgadas());
			System.out.println("Posee HDMI: "+tele2.getPoseeHDMI());
			System.out.println("");
			System.out.println("Aire Acondicionado "+i );
			System.out.println("Modelo: "+aire2.getModelo());
			System.out.println("Precio: "+aire2.getPrecio());
			System.out.println("Stock: "+aire2.getStock());
			System.out.println("Frigorias: "+aire2.getFrigorias());
			}
		}
		
		
		
	}
		
	private static String leeteclado() throws IOException{
		//Captura string de teclado y lo almacena en variable
		String entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		return entrada;
	}
	
}
		




		/*Fabricante fabricante1 = new Fabricante();
		Fabricante fabricante2 = new Fabricante();
		Televisor tele1 = new Televisor();
		Televisor tele2 = new Televisor();
		AireAcondicionado aire1 = new AireAcondicionado();
		AireAcondicionado aire2 = new AireAcondicionado();
		
		
		System.out.println("Ingrese Primer Fabricante");
		fabricante1.setNombre(entrada);
		
		System.out.println("Ingrese Primer Televisor");
		tele1.setModelo(entrada);
		tele1.setPoseeHDMI(entrada);
		
		
		System.out.println("Ingrese Primer Aire Acondicionado");
		
		System.out.println("Ingrese Segundo Fabricante");
		fabricante2.setNombre(entrada);
		
		System.out.println("Ingrese Segundo Televisor");
		System.out.println("Ingrese Segundo Aire Acondicionado");		
		

		
		
		
		
		
		
		System.out.println();
		
		
		
		//nro=Integer.valueOf(entrada);//toma solo el valor numerico y lo almacena como integer si ponemos un string da error
		System.out.println(entrada);	
	}
	
	
}
	
	
	
	
	
	
	/*
	public static void main(String[] args) throws IOException 
	{
		/*
		Animal perro = new Animal("Perro");
		//perro.especie = "Perro feo";
		System.out.println(perro.especie);
		System.out.println(perro.obtenerEdad());
		perro.setearEdad("2");
		System.out.println(perro.obtenerEdad());
		perro.setearEdad(4);
		System.out.println(perro.obtenerEdad());
		
		Persona roberto = new Persona();
		System.out.println(roberto.nombre);
		*/
		
		/*
		  Autos auto1 = new Autos();
		 
		auto1.setMarca("Fiat");
		auto1.setAnio(1996);
		auto1.setModelo("Uno");
		auto1.setKilometraje(200000);
		auto1.setNroChasis("AS1");
		auto1.setNroMotor("R02");
		
		System.out.println(auto1.getMarca());
		System.out.println(auto1.getModelo());
		System.out.println(auto1.getAnio());
		System.out.println(auto1.getKilometraje());
		System.out.println(auto1.mostrarDetalle());
		System.out.println(auto1);
		System.out.println(auto1.decirHola());
		
		
	}	
}		
/*	
		System.out.println("Hello world!");
		String cadena = "Hola";
		System.out.println(cadena);
		
		Integer nro = 0;
		System.out.println(nro);
		int nro2 = 1;
		System.out.println(nro2);

	//crea un lector de "flujo" de entrada (System.in)
	InputStreamReader stream = new InputStreamReader(System.in);
	
	//Crea un Buffer (almacen) del flujo de entrada
	BufferedReader buffer = new BufferedReader(stream);
	
	//leer la linea desde la consola Siempre la entrada es un String
	String entrada = buffer.readLine();
	nro=Integer.valueOf(entrada);//toma solo el valor numerico y lo almacena como integer si ponemos un string da error
	System.out.println(entrada);	
	}	
*/
		

