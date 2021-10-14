
public class Main {

	public static void main(String[] args) {
		Pokemon evoli = new Pokemon(null,"Evoli",100,30);
		PkmnEau carapuce = new PkmnEau ("Eau", "Carapuce", 90, 40);
		PkmnFeu salameche = new PkmnFeu("Feu","Salameche", 80, 50);
		PkmnPlante bulbizarre = new PkmnPlante("Plante","Bulbizarre", 120,30);
		
		System.out.println(salameche.attaquer(salameche));
	}

}
