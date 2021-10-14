
public class Main {

	public static void main(String[] args) {
		Pokemon evoli = new Pokemon("Evoli",100,30);
		PkmnEau carapuce = new PkmnEau ("Carapuce", 90, 40);
		PkmnFeu salameche = new PkmnFeu("Salameche", 80, 50);
		PkmnPlante bulbizarre = new PkmnPlante("Bulbizarre", 100,30);
		
		System.out.println(carapuce.attaquer(evoli));
	}

}
