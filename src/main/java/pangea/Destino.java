package pangea;
import java.util.List;

public interface Destino {
	public List<Registro> getConteudo();
	public void persistir(List<Registro> registros);
	
}
