package desafiodejava;

public class Carro {
	private String cor;
	private String placa;
	private int ano;
	private String marca; 
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
public void setCor(String cor) {
	this.cor = cor;
}

public String getCor() {
	return cor;
}

public void setPlaca(String placa) {
	this.placa = placa;
}

public String getPlaca() {
	return placa;
}

public Carro (String cor, String placa, int ano, String marca) {
	this.cor = cor;
	this.placa = placa;
	this.ano = ano;
	this.marca = marca;
}
}
