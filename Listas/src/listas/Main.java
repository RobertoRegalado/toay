package listas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
	}
		
	public static void main(String[] args) throws IOException 
	{

		List<Fabricante> listaF = new ArrayList<Fabricante>(); //declaro una lista de tipo Fabricante
		List<Televisor> listaT = new ArrayList<Televisor>(); //declaro una lista de tipo Televisor
		List<AireAcondicionado> listaA = new ArrayList<AireAcondicionado>(); //declaro una lista de tipo Televisor
		
		for(int i=1;i<3;i++){
		
				
				//Fabricante
				Fabricante FabriTemp = new Fabricante();//abro la lista y guardo en un temporal los datos
				System.out.println("Ingrese Nombre Fabricante");
				FabriTemp.setNombre(leeteclado());
				System.out.println("Ingrese Telefono del Fabricante "+FabriTemp.getNombre());
				FabriTemp.setTelefono(leeteclado());
				System.out.println("Ingrese Direccion del Fabricante "+FabriTemp.getNombre());
				FabriTemp.setDireccion(leeteclado());
				
				//Televisor
				Televisor TeleTemp =new Televisor();//abro la lista y guardo en un temporal los datos
				TeleTemp.setFabricante(FabriTemp);//asigno el fabricante al televisor // uso el temp de la listaF
				System.out.println("Ingrese el modelo del Televisor "+ i);
				TeleTemp.setModelo(leeteclado());
				System.out.println("Ingrese el precio del Televisor "+ i);
				TeleTemp.setPrecio(Double.valueOf(Integer.valueOf(leeteclado())));//convierte el string ne double
				System.out.println("Ingrese la cantidad en stock del Televisor "+ i);
				TeleTemp.setStock(Integer.valueOf(leeteclado()));//toma solo el valor numerico y lo almacena como integer 
				System.out.println("Ingrese las Pulgadas del Televisor "+ i);
				TeleTemp.setPulgadas(Integer.valueOf(Integer.valueOf(leeteclado())));//convierte el string ne integer
				System.out.println("Ingrese si el televisor posee HDMI o no Televisor "+ i);
				TeleTemp.setPoseeHDMI(Boolean.valueOf(leeteclado()));//toma solo el valor numerico y lo almacena como Boolean
				listaT.add(TeleTemp); //pasa los datos del temporal a la lista
				
				//Aire
				AireAcondicionado AireTemp = new AireAcondicionado();//abro la lista y guardo en un temporal los datos
				AireTemp.setFabricante(FabriTemp);// uso el temp de la listaF
				System.out.println("Ingrese el modelo del Aire Acondicionado "+ i);
				AireTemp.setModelo(leeteclado());
				System.out.println("Ingrese el precio del Aire Acondicionado "+ i);
				AireTemp.setPrecio(Double.valueOf(Integer.valueOf(leeteclado())));//convierte el string ne double
				System.out.println("Ingrese la cantidad en stock del Aire Acondicionado "+ i);
				AireTemp.setStock(Integer.valueOf(leeteclado()));//toma solo el valor numerico y lo almacena como integer 
				System.out.println("Ingrese las Frigorias del Aire Acondicionado "+ i);
				AireTemp.setFrigorias(Integer.valueOf(Integer.valueOf(leeteclado())));
				
				listaA.add(AireTemp); //pasa los datos del temporal a la lista
				
				listaF.add(FabriTemp); //pasa los datos de FabriTemp a la lista Fabricante
		
		}
		
		//muestra en pantalla lo cargado anteriormente
		for(int i=0;i<2;i++){

				System.out.println("");
				System.out.println("Fabricante "+i);
				System.out.println("Nombre: "+listaF.get(i).getNombre());
				System.out.println("Telefono "+listaF.get(i).getTelefono());
				System.out.println("Direccion "+listaF.get(i).getDireccion());
				System.out.println("");
				System.out.println("Televisor "+i );
				System.out.println("Modelo: "+listaT.get(i).getModelo());
				System.out.println("Precio: "+listaT.get(i).getPrecio());
				System.out.println("Stock: "+listaT.get(i).getStock());
				System.out.println("Pulgadas: "+listaT.get(i).getPulgadas());
				System.out.println("Posee HDMI: "+listaT.get(i).getPoseeHDMI());
				System.out.println("");
				System.out.println("Aire Acondicionado "+i );
				System.out.println("Modelo: "+listaA.get(i).getModelo());
				System.out.println("Precio: "+listaA.get(i).getPrecio());
				System.out.println("Stock: "+listaA.get(i).getStock());
				System.out.println("Frigorias: "+listaA.get(i).getFrigorias());
			}
		
	}
		
	
		
	private static String leeteclado() throws IOException{
		//Captura string de teclado y lo almacena en variable
		String entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		return entrada;
	}
	
}
		