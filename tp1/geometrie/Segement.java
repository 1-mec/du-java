package geometrie;




public class Segement {

	private int a = 0;
	private int b = 0;
	private int c = 0;
	private int d = 0;

	private Point p1 = new Point( a, b);
	private Point p2 = new Point( c, d);

	public Segement() {
		super();
		p1 = new Point();
		p2 = new Point(); 
	}

	public Segement(Point p1 , Point p2) {
		super();
		p1 = new Point( a, b);
		p2 = new Point( c, d);
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}
	
	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Segement copy(){
		return new Segement(this.p1 , this.p2);
	}

	public void translate(Point e , Point r){
		this.p1 = e;
		this.p2 = r;
	}

	@Override

	public String toString() {
		return "Segement [p1=" + p1 + ", p2=" + p2 + "]";
	}



}




