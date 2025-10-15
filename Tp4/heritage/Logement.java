package gestionVille;

public class Logement extends Bien{
	private int superficie;
	private int PlacesMax;
	private int PersonnesLogee;
	
	public int getPersonnesLogee() {
		return PersonnesLogee;
	}

	public void setPersonnesLogee(int personnesLogee) {
		PersonnesLogee = personnesLogee;
	}

	public Logement() {
		super();
	}


	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getPlacesMax() {
		return PlacesMax;
	}

	public void setPlacesMax(int placesMax) {
		PlacesMax = placesMax;
	}
	
	
	public Logement(int superficie, int placesMax, int personnesLogee) {
		super();
		this.superficie = superficie;
		PlacesMax = placesMax;
		PersonnesLogee = personnesLogee;
	}

	@Override
	public String getInfo() {
		return "Logement [ "+ super.getInfo() +"," + this.getSuperficie() + ", PlacesMax" + this.getPlacesMax() + "]";
	}
}
