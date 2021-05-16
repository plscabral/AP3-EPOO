package Interfaces;
import java.util.List;
import Models.Carro;

public interface ICarro {
	void PopularLista();
	List<Carro> ObterPorMarca(String marca);
	List<Carro> ObterPorCor(String cor);
}
