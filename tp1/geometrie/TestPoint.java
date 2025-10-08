package geometrie;

public class TestPoint {

	 public static void main(String[] args) {

	 

	 Point origine = new Point();

	 

	 System.out.println("origine : x " + origine.getx() + " et y " + origine.gety()+" ");

	 Point p = origine.nouv(3,2);

	 System.out.println("p : x " + origine.nouv(3,2).getx() + " et y " + origine.nouv(3,2).gety()+" ");

	 Point temp = p.copy();

	 System.out.println("temp : x " + p.copy().getx() + " et y " + p.copy().gety()+" ");

	 p.setx(4);

	 p.sety(7);

	 System.out.println("p : x " + p.getx() + " et y " + p.gety() +" ");

	 temp.translate(4, 7);

	 System.out.println("temp : x " + temp.getx() + " et y " + temp.gety() +" ");

	 Point t = new Point(4,7);

	 System.out.println(p.confindu( t));
	 System.out.println(p.confindu( temp));

	 System.out.println(p.distance(temp));
	 
	 System.out.println((p.ajt(t)).toString());


	 }



	}

