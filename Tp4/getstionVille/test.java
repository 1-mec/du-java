package gestionVille;

public class test {
	public static void main(String[] args) {
		Bien b = new Bien();
		
		Vehicule v = new Vehicule("MB-974-QZ",5);
		v.setValEuro(10);
		v.setCountEntretientMensuel(2);
		System.out.println(v.getInfo());
		
		Logement l = new Logement();
		l.setSuperficie(40);
		l.setPlacesMax(4);
		l.setValEuro(10);
		l.setCountEntretientMensuel(2);
		System.out.println(l.getInfo());
		


		
	}
}
