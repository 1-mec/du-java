package exo1;

public class Voiture extends MoyenDeTransport{

	public Voiture() {
		super();
	}

	@Override
	public void deplacementEnX(int a) {
		setX(limitation((10*getVitesseIniti()),150)) ;
	}

	@Override
	public void deplacementEnY(int a) {
		
	}
	
}
