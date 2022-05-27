package model;

public class VideoGame {
	
	private String nome;
	private double preco;
	private int gameEstoque;
	private String marca;
	private String modelo;
	private boolean isUSado;
	
	public VideoGame(String nome, double preco, int gameEstoque, String marca, String modelo, boolean isUSado) {
		this.nome = nome;
		this.preco = preco;
		this.gameEstoque = gameEstoque;
		this.marca = marca;
		this.modelo = modelo;
		this.isUSado = isUSado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getGameEstoque() {
		return gameEstoque;
	}
	public void setGameEstoque(int gameEstoque) {
		this.gameEstoque = gameEstoque;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isUSado() {
		return isUSado;
	}
	public void setUSado(boolean isUSado) {
		this.isUSado = isUSado;
	}	
	
	public double videoGameTotal() {
		return gameEstoque * preco;
	}
}
