package entities;

import java.util.Scanner;

public class Veiculo {
	Scanner sc = new Scanner(System.in);
	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	public String Ligado = "Veículo Desligado";
	private boolean isLigado;
	private int velocidade = 0;
	private int abastecer;
	
	public void setAbastecer(int Abastecer) {
		this.abastecer = Abastecer;
	}
	
	public int getAbastecer() {
			System.out.print("Abasteça seu veículo: ");
			abastecer = sc.nextInt();
			while (abastecer > 60) {
			System.out.println("Seu tanque só aguenta 60L");
			System.out.print("Abasteça seu veículo: ");
			abastecer = sc.nextInt();
			System.out.println("Tanque: " + abastecer + "L");
		}
			
	return abastecer;
	}
	
	public boolean ligar() {
		Ligado = "Veículo Ligado";
		return isLigado = true;
	}
	
	public void Desligar() {
		if(velocidade == 0) {
		Ligado = "Veículo Desligado";
		isLigado = true;
		}else {
			Ligado= "Reduza a velocidade para 0km/h antes de desligar o veiculo.";
		}
	}
	
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
	public String getMarca() {
		return Marca;
	}
	
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}
	
	public String getModelo() {
		return Modelo;
	}
	
	public void setCor(String Cor) {
		this.Cor = Cor;	
	}
	public String getCor() {
		return Cor;
	}
	
	public void setPlaca(String Placa) {
		this.Placa = Placa;
	}
	
	public String getPlaca() {
		return Placa;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int Velocidade) {
		this.velocidade = Velocidade;
	}
	
	public void acelerar() {
		if(isLigado == true) {
		velocidade +=  20;
	}else {
		System.out.println("Ligue o veículo primeiro antes de acelerar.");
	}
	}
		
	
	public void frear() {
		if(isLigado == true) {
		if(velocidade >= 20) {
		velocidade -= 20;
	}else if(velocidade < 20){
		System.out.println("Seu veículo já está parado");
				}
			}
	}
}
	
		
	





