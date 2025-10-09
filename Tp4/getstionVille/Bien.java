package gestionVille;

public class Bien {
	private int valEuro;
	private int CountEntretientMensuel;
	private static int nbExemple;
	
	public Bien() {
		valEuro = 0;
		CountEntretientMensuel = 0;
	}

	public Bien(int valEuro, int countEntretientMensuel) {
		super();
		this.valEuro = valEuro;
		CountEntretientMensuel = countEntretientMensuel;
	}

	public int getValEuro() {
		return valEuro;
	}

	public void setValEuro(int valEuro) {
		this.valEuro = valEuro;
	}

	public int getCountEntretientMensuel() {
		return CountEntretientMensuel;
	}

	public void setCountEntretientMensuel(int countEntretientMensuel) {
		CountEntretientMensuel = countEntretientMensuel;
	}

	public static int getNbExemple() {
		return nbExemple;
	}

	@Override
	public String toString() {
		return "Bien [valEuro=" + valEuro + ", CountEntretientMensuel=" + CountEntretientMensuel + "]";
	}
	
	public String getInfo() {
		return " Bien [ valEuro :" + this.getValEuro() +  " , CountEntretientMensuel :" + this.getCountEntretientMensuel() +" ]";
	}
	
	
}
