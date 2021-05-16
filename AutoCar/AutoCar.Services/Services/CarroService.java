package Services;

import Interfaces.ICarro;
import Models.Carro;
import Models.EnumCor;
import Models.EnumMarca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarroService implements ICarro {
	private List<Carro> Carros;
	
	public void PopularLista() {
		Carros = new ArrayList<Carro>();
		
		Carros.add(new Carro("Gol", "VOLKSWAGEN","VERMELHO", 2012, 35000));
		Carros.add(new Carro("Uno", "FIAT", "PRATA", 2010, 25000));
		Carros.add(new Carro("Palio", "FIAT", "PRETO", 2013, 37000));
		Carros.add(new Carro("Celta", "CHEVROLET", "VERMELHO", 2015, 40000));
	}

	public List<Carro> ObterPorMarca(String marca) {
		return Carros.stream().filter(carro -> carro.getMarca() == EnumMarca.valueOf(marca.toUpperCase())).collect(Collectors.toList());
	}

	public List<Carro> ObterPorCor(String cor) {
		return Carros.stream().filter(carro -> carro.getCor() == EnumCor.valueOf(cor.toUpperCase())).collect(Collectors.toList());
	}
}
