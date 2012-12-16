package pangea;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesteDI {

	@Test
	public void test() {
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		
		Processador processador = contexto.getBean(Processador.class);
		processador.processar();
		List<Registro> conteudo_processado = processador.getDestino().getConteudo();
		
		for (Registro registro : conteudo_processado) {
			assertNotNull(registro.getValor());
		}
		
	}

}
