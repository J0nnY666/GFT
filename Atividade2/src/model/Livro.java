package model;

public class Livro {
	private String nome;
	private double preco;
	private int livrosEstoque;
	private String autor;
	private String tema;
	private int paginas;
	
	public Livro(String nome, double preco, int livrosEstoque, String autor, String tema, int paginas) {
		this.nome = nome;
		this.preco = preco;
		this.livrosEstoque = livrosEstoque;
		this.autor = autor;
		this.tema = tema;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Titulo: " + nome + " , preco: " + preco + " , quantidade: " + livrosEstoque + " em estoque.";
	}

	public int getLivrosEstoque() {
		return livrosEstoque;
	}

	public void setLivrosEstoque(int livrosEstoque) {
		this.livrosEstoque = livrosEstoque;
	}
	
	public Double LivroTotal() {
		return livrosEstoque * preco;
	}
	
}
