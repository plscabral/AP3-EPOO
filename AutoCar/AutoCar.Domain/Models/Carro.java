package Models;

public class Carro {
	// Construtor
	public Carro(String modelo, String marca, String cor, int ano, int valor)
	{
		Modelo = modelo;
		Marca = EnumMarca.valueOf(marca);
		Cor = EnumCor.valueOf(cor);
		Ano = ano;
		Valor = valor;
	}
	
	// Propriedades
	String Modelo;
    EnumMarca Marca;
	EnumCor Cor;
	int Ano;
    int Valor;
	
	// Métodos Get e Set das propriedades
	public String getModelo() {
		return Modelo;
	}
	public EnumMarca getMarca() {
		return Marca;
	}
	public EnumCor getCor() {
		return Cor;
	}
	public int getAno() {
		return Ano;
	}
	public int getValor() {
		return Valor;
	}
	private void setValor(int valor) {
		Valor = valor;
	}
}
