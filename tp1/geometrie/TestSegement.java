package geometrie;


public class TestSegement {



	public static void main(String[] args) {

		Segement s = new Segement();

		System.out.println("origine : x,y " + s.toString() +"");

		Point p1 = new Point(7,8);
		Point p2 = new Point(5,9);

		Segement t = new Segement(p1,p2);

		t.setP1(p1);
		t.setP2(p2);

		System.out.println("s1 : x " + t.toString() +"");

		Segement temp = t.copy();

		System.out.println("temp : x " + t.copy().getP1() + " et y " + t.copy().getP2()+" ");


		Point pa = new Point(8,4);
		Point pb = new Point(7,5);

		t.setP1(pa);
		t.setP2(pb);

		System.out.println("t : x " + t.getP1() + " et y " + t.getP2() +" ");

		Point pe = new Point(7,4);
		Point pr = new Point(2,8);


		temp.translate(pe,pr);

		System.out.println("temp : x " + temp.getP1() + " et y " + temp.getP2() +" " );

	}



}