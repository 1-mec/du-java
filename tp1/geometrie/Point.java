package geometrie;

public class Point {

	private int x;
	private int y;

	public Point (){
		this.x = 0;
		this.y = 0;
	}
	public Point (int a, int b){
		this.x = a;
		this.y = b;
	}

	public int getx() {
		return this.x;
	}

	public int gety() {
		return this.y;
	}

	public void setx(int z) {
		this.x = z;
	}

	public void sety(int z) {
		this.y = z;
	}

	public Point nouv(int e, int r) {
		Point p = new Point(e,r);
		return p;
	}

	public Point copy() {
		return new Point(this.x , this.y);
	}

	public Point origine() {
		return new Point();
	}

	public boolean confindu(Point p) {
		return this.x == p.getx() && this.y == p.gety();
	}

	public int distance(Point p){
		double t = Math.sqrt(((double)(this.x-p.getx())*(this.x-p.getx()))+((double)(this.y-p.gety())*(this.y-p.gety())));
		int a = (int)(t);
		return a;
	}
	
	public Point ajt(Point p) {
		Point p3 = new Point((this.x + p.getx()),(this.y+p.gety()));
		return p3;
	}
	
	public Point multiplie(Point p) {
		Point p3 = new Point((this.x * p.getx()),(this.y * p.gety()));
		return p3;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void translate(int e, int r) {
		setx(e);
		setx(r);
	}
}




