package exo1;

public class Ascenseur extends MoyenDeTransport{

	public Ascenseur() {
		super();
	}

	@Override
	public void deplacementEnY(int a) {
		setY(limitation((5*getVitesseIniti()),50)) ;
	}

	@Override
	public void deplacementEnX(int a) {
	}

}

