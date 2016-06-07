package tp02;

public class Televisor extends Electrodomestico{
	
	private Integer pulgadas;
	private Boolean poseeHDMI;
	
	public Televisor() {
		// TODO Auto-generated constructor stub
	}
	
	public Televisor(Integer _pulgadas, Boolean _poseeHDMI) {
		
		pulgadas = _pulgadas;
		poseeHDMI= _poseeHDMI;
		
	}

	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}

	public Boolean getPoseeHDMI() {
		return poseeHDMI;
	}

	public void setPoseeHDMI(Boolean poseeHDMI) {
		this.poseeHDMI = poseeHDMI;
	}


}
