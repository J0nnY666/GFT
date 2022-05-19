package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Veiculo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Veiculo veiculo = new Veiculo();

		System.out.print("Selecione a marca do seu veículo: ");
		veiculo.marca = sc.nextLine();
		System.out.print("Selecione o modelo do seu veículo: ");
		veiculo.modelo = sc.nextLine();
		System.out.print("Selecione a Cor do seu veículo: ");
		veiculo.cor = sc.nextLine();
		System.out.print("Abasteça seu veículo: ");
		veiculo.abastecer = sc.nextInt();
		veiculo.abastecer();
			
		System.out.println("Marca: " + veiculo.marca);
		System.out.println("Modelo: " + veiculo.modelo);
		System.out.println("Placa: " + veiculo.placa);
		System.out.println("Cor: " + veiculo.cor);
		System.out.println("Tanque: " + veiculo.abastecer + "L");
		
		System.out.println();
	
////////////////////////////////////////////////////////////////////////////		
	//	veiculo.ligar();
		
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		
//		veiculo.frear();
//		veiculo.frear();
//		veiculo.frear();
//		veiculo.frear();
		veiculo.frear();
		veiculo.frear();
		
	//veiculo.Desligar();
		
///////////////////////////////////////////////////////////////////////////////		
		System.out.println(veiculo.Ligado);
		System.out.println(veiculo.velocidade + " km/h");	
		
		sc.close();
	}

}
