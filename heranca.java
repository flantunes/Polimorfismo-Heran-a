package PolimorfismoHeranca;
        //animal
public class heranca {
	
	private String nome;
	private int idade;
	private String som;
	
	
	public void setSom(String som) {
		this.som = som;
	} 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	} 
	public String emitirSom() {
		return som;
	}
	
}


