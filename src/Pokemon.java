
public class Pokemon {
	private String nom;
	private int hp;
	private int atk;

	public Pokemon() {
	};

	public Pokemon(String nom, int hp, int atk) {
		super();
		this.nom = nom;
		this.hp = hp;
		this.atk = atk;
	}

	public boolean isDead() {
		if (hp == 0) {
			return true;
		} else {
			return false;
	}
}
}
