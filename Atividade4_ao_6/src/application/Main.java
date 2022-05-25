package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Pessoas;

public class Main {

	public static void main(String[] args) {
		Pessoas joao = new Pessoas("João", 15);
		Pessoas leandro = new Pessoas("Leandro", 21);
		Pessoas paulo = new Pessoas("Paulo", 17);
		Pessoas jessica = new Pessoas("Jessica", 18);

		List<Pessoas> listaPessoas = new ArrayList<>();
		listaPessoas.add(joao);
		listaPessoas.add(leandro);
		listaPessoas.add(paulo);
		listaPessoas.add(jessica);

		System.out.println("----------------------------------------------");
		System.out.println("Lista Completa:");
		System.out.println("");
		System.out.println("NOME / IDADE");
		for (int i = 0; i < listaPessoas.size(); i++) {
			System.out.println(listaPessoas.get(i).getNome() + " " + listaPessoas.get(i).getIdade());
		}

		
		//Pessoa mais velha
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("Pessoa mais velha:");
		System.out.println("");
		Pessoas pessoaMaisVelha = Collections.max(listaPessoas);
		System.out.println("NOME / IDADE");
		System.out.println(pessoaMaisVelha.getNome());
		System.out.println(pessoaMaisVelha.getIdade());

		
		
		// Remover menores de 18 anos
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("Removendo menores de 18 anos:");
		System.out.println("");
		System.out.println("NOME / IDADE");
		for (int i = 0; i < listaPessoas.size(); i++) {
			listaPessoas.removeIf(x -> x.getIdade() < 18);
			System.out.println(listaPessoas.get(i).getNome() + " " + listaPessoas.get(i).getIdade());

		}

		// Jessica
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("Jessica está na lista? ");
		System.out.println("");
		if (listaPessoas.contains(jessica)) {
			System.out.println("NOME / IDADE");
			System.out.println(jessica);
		} else {
			System.out.println("Jessica não foi encontrada na lista.");
		}

	}

}
