package pangea;

public class Registro {
	
	private String nome;
	private String sobrenome;
	
	public String getNome() {return nome;}
	public String getSobrenome() {return sobrenome;}
	
	public Registro(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String toString() {
		return getNome() + ", " + getSobrenome();
	}
	
	private String valor;
	public String getValor() {return valor;}
	public void setValor(String valor) {this.valor = valor;}
	
}
