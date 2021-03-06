
public class PkmnEau extends Pokemon {
	// On défini les forces et faiblesses en fonction du type de pokemon adversaire
	// (eau>feu>plante>eau)
	double AtkSuperEfficace = this.getAtk()*2;
	double AtkPeuEfficace = this.getAtk() *0.5;
	String type = "Eau";

	public PkmnEau(String type, String nom, int hp, int atk) {
		super(type, nom, hp, atk);
	};

	public PkmnEau(double AtkSuperEfficace, double AtkPeuEfficace, String type) {
		this.AtkSuperEfficace = AtkSuperEfficace;
		this.AtkSuperEfficace = AtkPeuEfficace;
		this.type = type;
	}

	// On initie les methodes get/set
	public String getType() {
		return type;
	}

	public double getAtkSuperEfficace() {
		return AtkSuperEfficace;
	}

	public void setAtkSuperEfficace(double atkSuperEfficace) {
		AtkSuperEfficace = atkSuperEfficace;
	}

	public double getAtkPeuEfficace() {
		return AtkPeuEfficace;
	}

	public void setAtkPeuEfficace(double atkPeuEfficace) {
		AtkPeuEfficace = atkPeuEfficace;
	}

	@Override
	public String toString() {
		return "PkmnEau [AtkSuperEfficace=" + AtkSuperEfficace + ", AtkPeuEfficace=" + AtkPeuEfficace + "]";
	}

	// On défini les forces/faiblesses en fonction du type
	public double attaquer(Pokemon pokemon) {
		double result = 0;
		if (pokemon.getType() == "Eau" || pokemon.getType() == "Plante") {
			pokemon.setHp((int) result);
			result = (pokemon.getHp() - this.AtkPeuEfficace);
		} else if (pokemon.getType() == "Feu") {
			result = (pokemon.getHp() - this.AtkSuperEfficace);
			pokemon.setHp((int) result);
		} else {
			result = (pokemon.getHp() - this.getAtk());
			pokemon.setHp((int) result);
		}
		return result;
	}
}
