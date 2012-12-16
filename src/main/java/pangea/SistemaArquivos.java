package pangea;

import java.util.ArrayList;
import java.util.List;

public class SistemaArquivos implements Origem {

	public List<Registro> obterDados() {
		System.out.println("Obtendo a partir do sistema de arquivos");
		List<Registro> saida = new ArrayList<Registro>();
		int total = (int) (Math.random() * 100);
		for (int i = 0; i < total; i++) {
			saida.add(new Registro("Nome: " + i, "Sobrenome: " + i));
		}
		return saida;
	}

}
