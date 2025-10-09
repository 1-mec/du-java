package gestionVille;

import java.util.ArrayList;

public class Ville {
	private ArrayList<Bien> biens = new ArrayList<Bien>();
	
	public Ville(ArrayList<Bien> biens) {
		super();
		this.biens = biens;
	}

	public int getNbVehile() {
		int o = 0;
		for (int i = 0; i < this.biens.size(); i++) {
			Bien b = this.biens.get(i);
			if (b instanceof Vehicule) {
				o++;
			}
		}
		return o;
	}
	
	public int getNbLogee() {
		int o = 0;
		for (int i = 0; i < this.biens.size(); i++) {
			Bien b = this.biens.get(i);
			if (b instanceof Logement) {
				int temp = ((Logement) b).getPersonnesLogee();
				o += temp;
			}
		}
		return o;
	}
	
	public int getCoutVehicule() {
		int o = 0;
		for (int i = 0; i < this.biens.size(); i++) {
			Bien b = this.biens.get(i);
			if (b instanceof Vehicule) {
				int temp = ((Vehicule)b).getCountEntretientMensuel();
				o+= temp;
			}
		}
		return o;
	}
	
	public int getCout() {
		int o = 0;
		for (int i = 0; i < this.biens.size(); i++) {
			Bien b = this.biens.get(i);
			if (b instanceof Logement) {
				int temp = ((Logement)b).getCountEntretientMensuel();
				o+= temp;
			}
		}
		return o;
	}
	
	


	public Ville() {
		// TODO Auto-generated constructor stub
	}
	
	

}
