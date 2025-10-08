package geometrie;

public class Vecteur {
    private int x;
    private int y;
    private String nom ="";
    private Point p = new Point(x,y);

    public Vecteur (){
        this.nom ="Le vecteur";
        this.p = new Point(this.x,this.y);
    }

    public Vecteur(Point p1){
        this.nom = "Le Vecteur";
        this.p = p1;
    }
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		p.setx(x);
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		Point m = new Point();
		return "nom= " + nom + " " + m + " jusqu'à " + this.p ;
	}

	public void setY(int y) {
		this.y = y;
		p.sety(y);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
	
	public void setP(int x , int y) {
		this.p = new Point (x,y);
	}

	public void aff() {
		Point m = new Point();
		System.out.println("nom = " + this.nom + " " + m + " jusqu'à " + this.p);
	}
	
	public Vecteur add(Vecteur v){
		Point a = this.getP();
		Point pr = a.ajt(v.getP());
		Vecteur v3 = new Vecteur(pr);
		v3.setNom( this.getNom() + v.getNom());
		return v3;
	}
	public Vecteur fois(Vecteur v){
		Point a = this.getP();
		Point pr = a.multiplie(v.getP());
		Vecteur v3 = new Vecteur(pr);
		v3.setNom( this.getNom() + v.getNom());
		return v3;
	}
	
	public double norme() {
		return Math.sqrt(this.getP().getx() + this.getP().gety());
	}
	
	public boolean comparaison(Point p1){
        return this.p == p1;
    } //aucune idée , aucune idée

	public boolean col(Vecteur v) {
		return ((this.getP().getx())/v.getP().getx()) ==  ((this.getP().gety())/v.getP().gety());
	}
	
    public Point rotation(double angle ){
  
    	double rx = Math.cos(angle) * (this.getP().getx()) - Math.sin(angle)*(this.getP().gety());
    	double ry = Math.sin(angle) * (this.getP().getx()) - Math.cos(angle)*(this.getP().gety());
        int x = (int)(rx);
        int y = (int)(ry);
    	this.p = new Point(x,y);
    	
    	return this.p;
        
    }



}
