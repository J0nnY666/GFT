package entities;

import java.util.Scanner;

public class Veiculo {
	Scanner sc = new Scanner(System.in);
	public String marca;
	public String modelo;
	public String placa = "IJQ-1802";
	public String cor;
	public String Ligado = "Veículo Desligado";
	public boolean isLigado;
	public int velocidade = 0;
	public int abastecer;
	
	
	
	public int abastecer() {
			while (abastecer > 60) {
			System.out.println("Seu tanque só aguenta 60L");
			System.out.print("Abasteça seu veículo: ");
			abastecer = sc.nextInt();
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
	
	public String marca(String string) {
		return string;
	}
	
	public String modelo(String string) {
		return string;
	}
	
	public String cor(String string) {
		return string;
		
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
	
		
	





