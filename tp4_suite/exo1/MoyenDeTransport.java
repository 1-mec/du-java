package exo1;

public abstract class MoyenDeTransport implements Deplacement {
	private int x ;
	private int y ;
	private int vitesse ;
	private final int vitesseIniti = 10;
	
	public MoyenDeTransport() {
		super();
		this.x = 0;
		this.y = 0;
		this.setVitesse(getVitesseIniti());
	}


	public void deplacementEnX(int a) {
	}

	public void deplacementEnY(int b) {
	}
	public void seDeplacer() {
		deplacementEnX(x);
		deplacementEnY(y);
	}

	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}

	public int limitation(int a , int vitessMax ) {
		if (a > vitessMax) {
			return this.setVitesse(vitessMax);
		} else {
			return this.setVitesse(a);
		}
		
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getVitesse() {
		return vitesse;
	}


	public int setVitesse(int vitesse) {
		this.vitesse = vitesse;
		return vitesse;
	}


	public int getVitesseIniti() {
		return vitesseIniti;
	}
	
}
