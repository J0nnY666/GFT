package model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;

	List<Livro> livros;
	List<VideoGame> videoGames;

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> listaLivros() {
		System.out
				.println("------------------------------------------------------------------------------------------");
		if (livros.isEmpty()) {
			System.out.println("A loja não tem livros no estoque");
		} else {
			System.out.println(
					"------------------------------------------------------------------------------------------");
			System.out.println("A Loja Americanas possui estes livros para venda:");
			for (int i = 0; i < livros.size(); i++) {
				System.out.println("Titulo: " + livros.get(i).getNome() + ", preco: " + livros.get(i).getPreco()
						+ " , quantidade em estoque: " + livros.get(i).getLivrosEstoque());
			}
		}
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		System.out
				.println("------------------------------------------------------------------------------------------");
		if (videoGames.isEmpty()) {
			System.out.println("A loja não tem video-games no estoque");
		} else {
			System.out.println(
					"------------------------------------------------------------------------------------------");
			System.out.println("A Loja Americanas possui estes video-games para venda:");
			for (int i = 0; i < videoGames.size(); i++) {
				System.out.println(
						"Video-game: " + videoGames.get(i).getModelo() + ", preco: " + videoGames.get(i).getPreco()
								+ " , quantidade em estoque: " + videoGames.get(i).getGameEstoque());
			}
		}
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void calculaPatrimonio() {
		double patrimonioLivros = 0;
		for (int i = 0; i < livros.size(); i++) {
			patrimonioLivros += livros.get(i).getLivrosEstoque() * livros.get(i).getPreco();
		}
		for (int i = 0; i < videoGames.size(); i++) {
			patrimonioLivros += videoGames.get(i).getGameEstoque() * videoGames.get(i).getPreco();
		}
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.printf("O patrimonio da Loja Americanas é de: R$ %.2f ", patrimonioLivros);
	}

	public void calculaImposto() {

		System.out
				.println("------------------------------------------------------------------------------------------");
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getTema() == "Educativo") {
				System.out.println("Livro educativo não tem imposto: Java POO. ");
			}
			if (livros.get(i).getTema() != "Educativo") {
				double imposto = 0.1 * livros.get(i).getPreco();
				System.out.println("R$ " + imposto + " de imposto sobre o livro " + livros.get(i).getNome() + ".");
			}
		}
		System.out.println();
		for (int i = 0; i < videoGames.size(); i++) {
			if (videoGames.get(i).isUSado() == true) {
				double imposto = 0.25 * videoGames.get(i).getPreco();
				System.out.println("Imposto " + videoGames.get(i).getNome() + " " + videoGames.get(i).getModelo()
						+ " usado: R$ " + imposto);
			} else {
				double imposto = 0.45 * videoGames.get(i).getPreco();
				System.out.println("Imposto " + videoGames.get(i).getNome() + " " + videoGames.get(i).getModelo()
						+ " novo: R$ " + imposto);
			}
		}

	}
}
