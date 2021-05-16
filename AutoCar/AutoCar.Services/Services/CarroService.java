package Services;

import Interfaces.ICarro;
import Models.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarroService implements ICarro {
	private List<Carro> Carros;
	
	public void PopularLista() {
		Carros = new ArrayList<Carro>();
		
		Carros.add(new Carro("Gol", "Volkswagen", "Vermelho", 2012, 35000));
		Carros.add(new Carro("Uno", "Fiat", "Prata", 2010, 25000));
		Carros.add(new Carro("Palio", "Fiat", "Preto", 2013, 37000));
		Carros.add(new Carro("Celta", "Chevrolet", "Vermelho", 2015, 40000));
	}

	public List<Carro> ObterPorMarca(String marca) {
		return Carros.stream().filter(carro -> carro.getMarca() == marca).collect(Collectors.toList());
	}

	public List<Carro> ObterPorCor(String cor) {
		return Carros.stream().filter(carro -> carro.getCor() == cor).collect(Collectors.toList());
	}
}
