
public class PkmnEau extends Pokemon {
	// On défini les forces et faiblesses en fonction du type de pokemon adversaire
	// (eau>feu>plante>eau)
	double AtkSuperEfficace;
	double AtkPeuEfficace;

	public PkmnEau() {
	};

	public PkmnEau(double AtkSuperEfficace, double AtkPeuEfficace) {
		this.AtkSuperEfficace = AtkSuperEfficace;
		this.AtkSuperEfficace = AtkPeuEfficace;
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

}
