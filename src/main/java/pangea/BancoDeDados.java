package pangea;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados implements Origem {

	public List<Registro> obterDados() {
		System.out.println("Obtendo a partir do banco de dados");
		List<Registro> saida = new ArrayList<Registro>();
		saida.add(new Registro("João", "Rocha"));
		saida.add(new Registro("Renato", "Machado"));
		saida.add(new Registro("Joca", "Moreira"));
		return saida;
	}

}
