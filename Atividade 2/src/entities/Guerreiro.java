package entities;

public class Guerreiro extends Personagem {
	
	public Guerreiro(String nome, Integer vida, Integer mana, Integer inteligencia, Integer forca,
			Integer level) {
		super(nome, vida, mana,inteligencia, forca, level);
		
	}

	private String habilidade = " | "; 
	

	
	public String aprenderHabilidade(String string) {
		habilidade += string +" | ";
		
		return habilidade;
	}
	
	public Double ataque() {
		Double ataque = (getForca() * getLevel()) + Math.random() * 300;
		return ataque;
	}
	
	public void attack() {
		System.out.printf(getNome() +  " atacou inflingiu um dano de: " + "%.0f", ataque());
	}
	
	@Override
	public String toString() {
		return "Guerreiro: " + getNome() + ", Vida: " + getVida() + ", Mana: " + getMana() + ","
				 + " Inteligencia: " + getInteligencia() + ", Forca: " + getForca() + ", Level: "
				+ getLevel(); 
	}

	public void levelUP() {
		level++;
		vida += 30;
		mana += 5;
		inteligencia += 3;
		forca += 25;
	}
	
	public void listaHabilidades() {
		String lista = habilidade;
			System.out.println("Lista de Habilidades: " + lista);
		}
	}



