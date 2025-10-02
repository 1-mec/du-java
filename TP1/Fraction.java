package tp3;

public class Fraction {
	private int denum;
	private int nume;

	public static int pgcd(int a, int b) {
		int c;
		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	public Fraction(int num, int den) {
		this.denum = den;
		this.nume = num;
	}

	public int getNumerateur() {
		return nume;
	}

	public int getDenominateur() {
		return denum;
	}

	public void setDenominateur(int den) {
		if (den != 0) {
			this.denum = den;
		}
	}

	public void setNumerateur(int num) {
		this.nume = num;
	}

	public boolean egaleA(Fraction f) {
		if (((double) (f.nume) / f.denum) == ((double) (this.nume) / this.denum)) {
			return true;
		}
		return false;
	}

	public void ajoute(Fraction f) {
		if (this.denum != f.denum) {
			this.denum *= f.denum;
			this.nume *= pgcd(f.nume, f.denum);
			f.denum *= pgcd(this.nume, this.denum);
			f.nume *= pgcd(this.nume, this.denum);
		}
		if (this.denum < 0) {
			this.denum = -(this.denum * 2);
			this.nume = -(this.nume * 2);
		}
		this.nume += f.nume;
	}

	public void reduire() {
		/*
		 * if (this.denum < 0) { this.denum = -(this.denum ); this.nume = -(this.nume);
		 * 
		 * }
		 */
		this.denum /= pgcd(this.nume, this.denum);
		this.nume /= pgcd(this.nume, this.denum);

	}

	public static void main(String[] args) {

	}

}
