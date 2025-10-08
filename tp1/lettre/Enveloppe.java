package papier;
import java.util.ArrayList;

public class Enveloppe {
	
	private boolean state ; //ouverte ou fermée
	private ArrayList<Feuille> feuilles = new ArrayList<Feuille>();
	private int maxFeuilles = 5;
	
	
	public Enveloppe() {
		super();
		this.state = true;
		this.feuilles = feuilles;
		this.maxFeuilles = maxFeuilles;
	}

	public int getMaxFeuilles() {
		return maxFeuilles;
	}

	public void setMaxFeuilles(int maxFeuilles) {
		this.maxFeuilles = maxFeuilles;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	public ArrayList<Feuille> getFeuilles() {
		return feuilles;
	}
	public void setFeuilles(ArrayList<Feuille> feuilles) {
		this.feuilles = feuilles;
	}
	
	public void ouvrir() {
		this.setState(true);
	}
	
	public void fermer() {
		this.setState(false);
	}

	public void ajoutFeuille(Feuille f) {
		int a =this.feuilles.size();
		if ( a < this.maxFeuilles ) {
			this.feuilles.add(f);
		}
	}
	
	public void lire() {
		if (!this.isState()){
			System.out.println("Non non non");
		} else {
			for (int i = 0 ; i < this.feuilles.size(); i++) {
				this.feuilles.get(i).setVisible(true);
				this.feuilles.get(i).aff();
				this.feuilles.get(i).setVisible(false);
				this.feuilles.get(i).aff();
			}
		}
		
	}
	
	public void taille() {
		System.out.println(this.feuilles.size());
	}

	@Override
	public String toString() {
		if (!this.isState()){
			return "Non non non";
		} else {
			return "Enveloppe [state=" + state + ", feuilles=" + feuilles + ", maxFeuilles=" + maxFeuilles + "]";
		}
	}
}
