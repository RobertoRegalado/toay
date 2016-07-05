package listas;

public class Electrodomestico {
	
	private Fabricante fabricante;
	private String modelo;
	private Double precio;
	private Integer stock;
	

	public Electrodomestico() {
		// TODO Auto-generated constructor stub
	
	}
	
	public Electrodomestico(Fabricante _fabricante, String _modelo, Double _precio, Integer _stock) {
		fabricante = _fabricante;
		modelo = _modelo;
		precio = _precio;
		stock = _stock;
	
	}


	public Fabricante getFabricante() {
		return fabricante;
	}


	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	

	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public void setPrecio(String precio) {
		this.precio = Double.valueOf(precio);
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public void setStock(String stock) {
		this.stock = Integer.valueOf(stock);
	}
	
	public String decirtipo(){
		return "";
	}

}
