package program;

import entities.Guerreiro;
import entities.Mago;

public class Main {

	public static void main(String[] args) {

		Mago mago = new Mago("Gideon", 100, 350, 25, 3, 1);
		
		mago.levelUP();
		mago.aprenderMagia("Bola de fogo");
		mago.aprenderMagia("Estaca de gelo");
		System.out.println(mago);
		mago.listaMagias();
		mago.attack();

		System.out.println();
		System.out.println();
		
		Guerreiro guerreiro = new Guerreiro("Radagon", 180, 80, 5, 20, 1);
		
		guerreiro.levelUP();
		guerreiro.aprenderHabilidade("Corte ascendente");
		guerreiro.aprenderHabilidade("Pisão");
		System.out.println(guerreiro);
		guerreiro.listaHabilidades();
		guerreiro.attack(); 
	}

}
