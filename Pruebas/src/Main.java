
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException 
	{
	// ------ Lista que se comporta como arreglo ------ //
	List<Integer> lista = new ArrayList<Integer>(); //tamanio variable


	// ------ Arreglo ------ //
	//Integer arregloI[] = new Integer[10]; //tamanio fijo
	Integer[] arregloI = new Integer[10]; //tamanio fijo


	System.out.println("Tamanio lista original: " + lista.size());	
	System.out.println("Tamanio array original: " + arregloI.length);
	//Integer nro;
	for(int i = 0; i < 10; i++)
	{
	/*
	nro = new Integer(i+1);
	lista.add(nro);
	*/
	lista.add(new Integer(i+1));
	System.out.println("Tamanio lista en carga: " + lista.size());
	
	}
	
	for(int i = 0; i < lista.size(); i++)
	{
	System.out.println("Lista en i: " + i + " valor: " + lista.get(i));
	}
	
	//For each recorre la lista codigo resumido
	for(Integer nro:lista){
		System.out.println(nro);
	}
	

	//Integer nro;
	for(int i = 0; i < 10; i++)
	{
	/*
	nro = new Integer(i+10);
	arregloI[i] = nro;
	*/

	arregloI[i] = new Integer(i+10);
	System.out.println("Tamanio array en carga: " + arregloI.length);
	}

	for(int i = 0; i < arregloI.length; i++)
	{
	System.out.println("Arreglo en i: " + i + " valor: " + arregloI[i]);

	}
	}

}
