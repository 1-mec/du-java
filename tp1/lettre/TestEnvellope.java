package papier;

import java.util.ArrayList;

public class TestEnvellope {

	public static void main(String[] args) {
		Enveloppe e = new Enveloppe();
		
		Feuille f = new Feuille();
		f.setVerso("oui oui baguette");
		f.setRecto("et non mdrr");
		
		Feuille a = new Feuille();
		a.setVerso("bruh");
		a.setRecto("bluhhhh");
		
		Feuille b = new Feuille();
		b.setVerso("Kanye");
		b.setRecto("West");
		
		ArrayList<Feuille> t = new ArrayList<Feuille>();

		t.add(f);
		t.add(a);
		
		
		e.setState(false);
		e.setMaxFeuilles(5);
		e.setFeuilles(t);
		
		e.ouvrir();
		
		e.ajoutFeuille(b);
		System.out.println(e.toString()+"\n");
		e.lire();
		System.out.println("");
		System.out.println(e.getFeuilles());
		
		e.fermer();
		System.out.println(e.toString());
		e.lire();
		System.out.println("");
		System.out.println(e.getFeuilles());
	}

}
