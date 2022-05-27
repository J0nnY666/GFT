package entities;

public class Mago extends Personagem {

	public Mago(String nome, Integer vida, Integer mana, Integer inteligencia, Integer forca, Integer level) {
		super(nome, vida, mana, inteligencia, forca, level);
		
	}

	private String magia = " | ";

	

	public String aprenderMagia(String string) {
		magia += string + " | ";

		return magia;
	}

	public Double ataque() {
		Double ataque = getInteligencia() * getLevel() + Math.random() * 300;
		return ataque;
	}

	public void attack() {
		System.out.printf(getNome() + " atacou inflingiu um dano de: " + "%.0f", ataque());
	}

	@Override
	public String toString() {
		return "Mago: " + getNome() + ", Vida: " + getVida() + ", Mana: " + getMana() + "," + " Inteligencia: "
				+ getInteligencia() + ", Forca: " + getForca() + ", Level: " + getLevel();
	}

	public void levelUP() {
		level++;
		vida += 3;
		mana += 15;
		inteligencia += 25;
		forca += 2;
	}

	public void listaMagias() {
		String lista = magia;
		System.out.println("Lista de Magias: " + lista);
	}
}
