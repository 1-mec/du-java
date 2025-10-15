package exo1;

public class Fusee extends MoyenDeTransport{
	
	public Fusee() {
		super();
	}

	@Override
	public void deplacementEnX(int a) {
		setX(limitation((100*getVitesseIniti()),1200)) ;
	}

	@Override
	public void deplacementEnY(int a) {
		setY(limitation((100*getVitesseIniti()),1200));
	}
}
