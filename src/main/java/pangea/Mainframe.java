package pangea;

import java.util.ArrayList;
import java.util.List;

public class Mainframe implements Destino {
	
	private List<Registro> registros = new ArrayList<Registro>();
	
	public void persistir(List<Registro> registros) {
		System.out.println("Mainframe recebe registros");
		if (registros != null) {
			this.registros.addAll(registros);
		}
	}
	
	public List<Registro> getConteudo() {
		return registros;
	}

}
