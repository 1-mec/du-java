package gestionVille;

public class Vehicule extends Bien{

	private String immatriculation ;
	private int nbPlace;
	
	public Vehicule(String immatriculation, int nbPlace) {
		super();
		this.immatriculation = immatriculation;
		this.nbPlace = nbPlace;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	@Override
	public String getInfo() {
		return "Vehicule [ " +super.getInfo() + "immatriculation=" + this.getImmatriculation() + ", nbPlace=" + this.getNbPlace() + "]";
	}
	

}
