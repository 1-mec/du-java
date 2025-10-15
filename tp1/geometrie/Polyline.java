package geometrie;

import java.util.ArrayList;

public class Polyline {

	private ArrayList<Point> tab = new ArrayList<Point>();	
	
	public Polyline() {
		this.tab= null ; 
	}
	
	public Polyline(ArrayList<Point> p) {
		for (int i = 0; i < tab.size() ; i++) {
			this.tab.add(new Point(p.get(i).getx(),p.get(i).gety()));		
		}
	}

	public ArrayList<Point> getTab() {
		return tab;
	}

	public void setTab(ArrayList<Point> tab) {
		this.tab = tab;
	}

	public void aff() {
		for (int i = 0 ; i < this.tab.size() ; i++ ) {
			System.out.print( this.tab.get(i) + " , ");
		}
		System.out.println("");
	}
	
	public int nb_point() {
		return this.tab.size();
	}
	
	public void translate(Vecteur v) {
		for (int i = 0; i < tab.size() ; i++) {
			Point t = this.tab.get(i);
			System.out.print(this.tab.get(i)+ "et ensuite");
			this.tab.set(i,t.ajt(v.getP() ));	
			System.out.println(this.tab.get(i));
		}
	}
	
	public boolean test() {
		int compteurx = this.tab.get(0).getx();
		int compteury = this.tab.get(0).gety();
		for (int i = 0; i < this.tab.size() ; i++) {	
			compteurx += this.tab.get(i).getx();
			compteury += this.tab.get(i).gety();
		}
		Point p = new Point (compteurx,compteury);
		Point y = new Point (this.tab.get(0).getx(),this.tab.get(0).gety());

		return (p.confindu(y) == true);
	}
	
	public double longueure() {
		int compteurx = 0;
		int compteury = 0;
		for (int i = 0; i < this.tab.size() ; i++) {	
			compteurx += this.tab.get(i).getx();
			compteury += this.tab.get(i).gety();
		}
		double res = ((double)(compteurx)/(double)(compteury));
		if (compteury == 0) {
			return 0;
		}
		return res;
	}


}
