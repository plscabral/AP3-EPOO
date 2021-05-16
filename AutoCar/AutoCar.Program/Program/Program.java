package Program;

import Models.Carro;
import Interfaces.ICarro;
import Services.CarroService;
import java.util.List;
import java.util.ArrayList;

public class Program {	
	public static void main(String[] args) {
		System.out.println("Iniciando ...");
		
		System.out.println();
		System.out.println("Instânciando CarroService");
		CarroService service = new CarroService();
		
		System.out.println();
		System.out.println("Populando lista de carros");
		service.PopularLista();
		
		System.out.println();
		System.out.println("Exibindo apenas os carros da marca Fiat");
		List<Carro> carros = service.ObterPorMarca("Fiat");
		carros.forEach(carro -> System.out.println(carro.getModelo() + " - " + carro.getMarca() + " - " + carro.getCor() + " - " + carro.getAno() + " - " + carro.getValor()));
		
		System.out.println();
		System.out.println("Exibindo apenas os carros com cor vermelha!");
		List<Carro> carrosVermelhos = service.ObterPorCor("Vermelho");
		carrosVermelhos.forEach(carro -> System.out.println(carro.getModelo() + " - " + carro.getMarca() + " - " + carro.getCor() + " - " + carro.getAno() + " - " + carro.getValor()));	
	}
}
