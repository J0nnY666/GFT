package entities;

public class Pessoas implements Comparable<Pessoas> {

	private String Nome;
	private Integer Idade;

	public Pessoas(String nome, Integer idade) {
		this.Nome = nome;
		this.Idade = idade;
	}

	public String getNome() {
		return Nome;
	}

	public Integer getIdade() {
		return Idade;
	}

	@Override
	public int compareTo(Pessoas iPessoas) {

		return (this.Idade - iPessoas.getIdade());
	}

	@Override
	public String toString() {
		return Nome
				+ " "
				+ Idade;
	}
	
}
