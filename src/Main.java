
public class Main {

	public static void main(String[] args) {
		Pokemon evoli = new Pokemon(null, "Evoli", 200, 30);
		PkmnEau carapuce = new PkmnEau("Eau", "Carapuce", 190, 40);
		PkmnFeu salameche = new PkmnFeu("Feu", "Salameche", 180, 50);
		PkmnPlante bulbizarre = new PkmnPlante("Plante", "Bulbizarre", 220, 30);

		System.out.println(salameche.attaquer(bulbizarre));
		System.out.println(bulbizarre.getHp());
		System.out.println(salameche.attaquer(bulbizarre));

		int tour = 1;
		while (!salameche.isDead() && !evoli.isDead()) {
			System.out.println("Nous sommes au numéro" + tour);
			tour++;
			if (tour % 2 != 0) {
				salameche.attaquer(evoli);
			} else {
				evoli.attaquer(salameche);
			}
		}
	}
}
