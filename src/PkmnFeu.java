
public class PkmnFeu extends Pokemon  {
	// On défini les forces et faiblesses en fonction du type de pokemon adversaire
	// (eau>feu>plante>eau)
	double AtkSuperEfficace = this.getAtk()*2;
	double AtkPeuEfficace = this.getAtk() *0.5;
	
	public PkmnFeu(String nom, int hp, int atk) {
		super(nom, hp, atk);
	};
	
	public PkmnFeu(double AtkSuperEfficace, double AtkPeuEfficace) {
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
		return "PkmnFeu [AtkSuperEfficace=" + AtkSuperEfficace + ", AtkPeuEfficace=" + AtkPeuEfficace + "]";
	}
	

	
}
