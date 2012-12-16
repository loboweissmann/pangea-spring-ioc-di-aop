package pangea;

import java.util.List;

public class Processador {
	
	public void init() {
		System.out.println("Oi");
	}
	
	private Origem origem;
	
	private Destino destino;
	
	public void processar() {
		List<Registro> conteudo = getOrigem().obterDados();
		
		for (Registro registro : conteudo) {
			registro.setValor(registro.getNome() + ":" + registro.getSobrenome() + "=" + registro.getSobrenome().length());
		}
		
		getDestino().persistir(conteudo);
	}

	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	
}
