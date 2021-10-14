
public class Pokemon {
	// Définition des caractéristiques
	private String nom;
	private int hp;
	private int atk;
	String type;

	// Définition de la méthode Pokemon
	public Pokemon() {
	};

	public Pokemon(String type, String nom, int hp, int atk) {
		super();
		this.type = type;
		this.nom = nom;
		this.hp = hp;
		this.atk = atk;
	}

	// On créé des setters et getter pour récupérer les informations ou pour
	// intéragir avec elles
	public String getNom() {
		return this.nom;
	}

	public String getType() {
		return this.type;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	// On écrit la méthode "isDead" qui renverra true si les pv tombent à 0
	public boolean isDead() {
		if (hp == 0) {
			System.out.println("Votre pokemon est KO");
			return true;
		}
		return false;
	}

	// On créé la méthode "attaquer" qui servira à calculer la différence entre
	// l'attaque de l'attaquant et les pv du défenseur
	public double attaquer(Pokemon pokemon) {
		double result = pokemon.hp - this.atk;
		System.out.println("il reste " + result + " points de vie.");
		return result;
	}

	@Override
	public String toString() {
		return "Pokemon [nom=" + nom + ", hp=" + hp + ", atk=" + atk + "]";
	}

}
