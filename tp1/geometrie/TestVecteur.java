package geometrie;

public class TestVecteur {
	public static void main(String[] args) {
		Vecteur v = new Vecteur();
		v.aff();
		System.out.println("");
		
		v.setX(5);
		v.setY(7);
		Point p = new Point(v.getX(),v.getY());
		v.setP(p);
		String a = v.getNom();
		v.setNom("1er vercteur");
		v.aff();
		System.out.println("");
		Vecteur m = new Vecteur();
		m.setX(8);
		m.setY(4);
		m.aff();
		System.out.println("");
		System.out.println("add " + (v.add(v).toString()));
		System.out.println("add " + (v.add(m).toString()) + "\n");

		System.out.println("fois " + (v.fois(v).toString()));
		System.out.println("fois " + (v.fois(m).toString()) + "\n");
		
		System.out.println("norme " + v.norme()+ "\n");

		System.out.println("comparaison " + v.comparaison(v.getP()));
		System.out.println("comparaison " + v.comparaison(m.getP()) + "\n");

		System.out.println("col " + v.col(v));
		System.out.println("col " + v.col(m) + "\n");

		System.out.println("rotation " + v.rotation(544.12685453435468) + "\n");
		
	}
}
