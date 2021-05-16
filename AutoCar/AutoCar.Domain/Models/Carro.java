package Models;

public class Carro {
	// Construtor
	public Carro(String modelo, String marca, String cor, int ano, int valor)
	{
		Modelo = modelo;
		Marca = marca;
		Cor = cor;
		Ano = ano;
		Valor = valor;
	}
	
	// Propriedades
	String Modelo;
	String Marca;
	String Cor;
	int Ano;
	int Valor;
	
	// Métodos Get e Set das propriedades
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public int getValor() {
		return Valor;
	}
	private void setValor(int valor) {
		Valor = valor;
	}
}
