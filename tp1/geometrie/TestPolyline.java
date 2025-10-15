package geometrie;

import java.util.ArrayList;

public class TestPolyline {

	public static void main(String[] args) {
		ArrayList<Point> tab = new ArrayList<Point>();
		Point p1 = new Point(4,8);
		Point p2 = new Point(1,5);
		Point p3 = new Point(7,3);	
		tab.add(p1);
		tab.add(p3);
		tab.add(p2);
		
		Polyline p = new Polyline(tab);	
		p.setTab(tab);
		//p.getTab();
		p.aff();
		System.out.println("");

		Point p4 = new Point(-4,-8);
		Point p5 = new Point(-1,-5);
		Point p6 = new Point(-7,-3);
		tab.add(p4);
		tab.add(p5);
		tab.add(p6);
		//p.setTab(tab);
		p.aff();
		System.out.println("");
		
		Vecteur m = new Vecteur();
		m.setX(8);
		m.setY(4);
		System.out.println("");

		System.out.println(p.test());

		System.out.println("");
		p.translate(m);
		System.out.println(p.nb_point());

		System.out.println("");
		System.out.println(p.test());
		System.out.println("");
		System.out.print(p.longueure());
		//p.aff();
		
		
	
	}
}
