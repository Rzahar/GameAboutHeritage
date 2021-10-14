
public class Pokemon {
	//Définition des caractéristiques
	private String nom;
	private int hp;
	private int atk;

	// Définition de la méthode Pokemon
	public Pokemon() {
	};

	public Pokemon(String nom, int hp, int atk) {
		super();
		this.nom = nom;
		this.hp = hp;
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
	
	// On créé la méthode "attaquer" qui servira à calculer la différence entre l'attaque de l'attaquant et les pv du défenseur
	public double attaquer(Pokemon pokemon) {
		double result = pokemon.hp - this.hp;
		return result;
	}

	@Override
	public String toString() {
		return "Pokemon [nom=" + nom + ", hp=" + hp + ", atk=" + atk + "]";
	}
	
	
}
