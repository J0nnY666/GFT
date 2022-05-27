package entities;

public class Gerente extends Funcionario {

	public Gerente() {

	}

	public Gerente(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	public Double bonificacao() {
		return salario + 10000.0;
	}

	@Override
	public String toString() {
		return "Gerente: Nome: " + nome + ", idade: " + idade + " anos, salario: R$ " + salario + ", bonificacao: R$ "
				+ bonificacao();
	}

}
