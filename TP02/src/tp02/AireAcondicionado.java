package tp02;

public class AireAcondicionado extends Electrodomestico{
	
	private Integer frigorias;
	
	public AireAcondicionado() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public AireAcondicionado(Integer _frigorias) {
		// TODO Auto-generated constructor stub
		
		frigorias = _frigorias;
	}

	public Integer getFrigorias() {
		return frigorias;
	}

	public void setFrigorias(Integer frigorias) {
		this.frigorias = frigorias;
	}
	
	public void setFrigorias(String frigorias) {
		this.frigorias = Integer.valueOf(frigorias);
	}
	
	//public String toString(){
		
		
	//}
	
}
