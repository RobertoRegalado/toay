package tp03;

public class Matematica {
	static Double numero1;
	static Double numero2;
	static final Double pi=3.1416;
	static Object radio=5.25;
	
	public Matematica() {
		// TODO Auto-generated constructor stub
	}
		
	public static void main(String[] args){
		numero1=(double) 2;
		numero2=(double) 23;
		System.out.println(Suma(numero1, numero2));
		System.out.println(calcCircunferencia(radio));
	
	}

	public static Integer Suma (Integer numero1, Integer numero2){
		return numero1 + numero2;
	}
	 
	public static Double Suma (Double numero1, Double numero2){
		return numero1 + numero2;
	}

	public static  Double calcCircunferencia(Object radio ){
		if (radio instanceof Integer){
			System.out.println("Es Integer");
			Integer iradio = (Integer) radio;
			return 2*pi*iradio; 
		}
		else{
			if(radio instanceof Double){
				System.out.println("Es Double");
				Double dradio = (Double) radio;
				return 2*pi*dradio; 
			}
			else{
				System.out.println("Error NO es un tipo valido");
				return -1.0;
			}	
		}
	}

}
