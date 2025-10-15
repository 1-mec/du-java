package lettre;

public class TestFeuille {

	public static void main(String[] args) {
		Feuille f = new Feuille();
		f.setVerso("oui oui baguette");
		f.setRecto("et non mdrr");
		f.retourner();
		f.aff();
		f.retourner();
		f.aff();	
		f.retourner();
		f.aff();
		f.retourner();
		System.out.println("");
		f.setVerso("blablabla");
		f.setRecto("bruh");
		f.retourner();
		f.aff();
		f.retourner();
		f.aff();
		f.retourner();
		f.aff();
	}

}

