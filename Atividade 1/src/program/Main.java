package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Veiculo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Veiculo veiculo = new Veiculo();
		
		veiculo.setPlaca("T3STE-BR0");
		System.out.print("Selecione a marca do seu veículo: ");
		veiculo.setMarca(sc.next());
		System.out.print("Selecione o modelo do seu veículo: ");
		veiculo.setModelo(sc.next()); 
		System.out.print("Selecione a Cor do seu veículo: ");
		veiculo.setCor(sc.next()); 
		veiculo.getAbastecer();
		
			
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Placa (padrão): " + veiculo.getPlaca());
		System.out.println("Cor: " + veiculo.getCor());
			System.out.println();
	
////////////////////////////////////////////////////////////////////////////		
		veiculo.ligar();
		
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		
		veiculo.frear();
		veiculo.frear();
		veiculo.frear();
		//veiculo.frear();
		//veiculo.frear();
		//veiculo.frear();
		
	//veiculo.Desligar();
		
///////////////////////////////////////////////////////////////////////////////		
		System.out.println(veiculo.Ligado);
		System.out.println(veiculo.getVelocidade() + " km/h");	
		
		sc.close();
	}

}
