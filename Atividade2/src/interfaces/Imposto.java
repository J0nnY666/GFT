package interfaces;

import java.util.List;

import model.Livro;
import model.VideoGame;

public class Imposto {
	List<Livro> livros;
	List<VideoGame> videoGames;
	
	public void calculaImposto() {
		for (int i = 0; i < livros.size(); i++) {
			if(livros.get(i).getTema() == "Educativo") {
				System.out.println("Testee");
			}
		}
		
	}
	
	
	
	
}
