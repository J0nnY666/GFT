package entities;

public class Vendedor extends Funcionario {

	public Vendedor() {

	}

	public Vendedor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	public Double bonificacao() {
		return salario + 3000.0;
	}

	@Override
	public String toString() {
		return "Vendedor: Nome: " + nome + ", idade: " + idade + " anos, salario: R$ " + salario + ", bonificacao: R$ "
				+ bonificacao();
	}


}
