public class Demo {
	public static void main(String[] args) {
		//mitchel/ Deelnemer boolean persoonlijkheid int technisch int leeftijd > 35
		Deelnemer sollicitant1 = new Deelnemer();
		Deelnemer sollicitant2 = new Deelnemer();
		Deelnemer sollicitant3 = new Deelnemer();
		sollicitant1.vullen(true, 55, 22);
		sollicitant2.vullen(false, 55, 22);
		sollicitant3.vullen(true, 45, 22);
		aannemen(sollicitant1);
		aannemen(sollicitant2);
		aannemen(sollicitant3);
		boolean frits = true;
		if(frits) {
			System.out.println("go");
		}
	}
	static void aannemen(Deelnemer deelnemer) { // mooie methode
		if(deelnemer.geschiktePersoonlijkheid && deelnemer.technischeUitslag > 50 && deelnemer.leeftijd < 35) {
			System.out.println("U bent aangenomen");
		}else {
			System.out.println("U bent niet aangenomen");
		}
	}
}
class Deelnemer{
	boolean geschiktePersoonlijkheid;
	int technischeUitslag;
	int leeftijd;
	
	void vullen(boolean gp, int tu, int deLeeftijd) {
		geschiktePersoonlijkheid = gp;
		technischeUitslag = tu;
		leeftijd = deLeeftijd;
	}
}
