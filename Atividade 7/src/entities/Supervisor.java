package entities;

public class Supervisor extends Funcionario {

	public Supervisor() {
		super();
	}

	public Supervisor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);

	}

	public Double bonificacao() {
		return salario + 5000.0;
	}

	@Override
	public String toString() {
		return "Supervisor: Nome: " + nome + ", idade: " + idade + " anos, salario: R$ " + salario + ", bonificacao: R$ "
				+ bonificacao();
	}

}
