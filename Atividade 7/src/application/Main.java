package application;

import entities.Gerente;
import entities.Supervisor;
import entities.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Marco", 29, 1315.00);
		Supervisor supervisor = new Supervisor("João", 23, 1118.00);
		Vendedor vendedor = new Vendedor("Luísa", 21, 1010.00);
		
		System.out.println(gerente);
		System.out.println(supervisor);
		System.out.println(vendedor);

	}

}
