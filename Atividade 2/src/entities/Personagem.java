package entities;

public class Personagem {
	protected String nome;
	protected Integer vida;
	protected Integer mana;
	protected Integer inteligencia;
	protected Integer forca;
	protected Integer level;
	
	public Personagem(String nome, Integer vida, Integer mana, Integer inteligencia, Integer forca,
			Integer level) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public Integer getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}

	public Integer getForca() {
		return forca;
	}

	public void setForca(Integer forca) {
		this.forca = forca;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public int levelUp() {
		return level++;
	}
}
