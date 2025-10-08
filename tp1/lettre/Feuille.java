package lettre;

public class Feuille {
	private String verso;
	private String recto;
	private boolean visible ;
	
	public Feuille() {
		this.recto = "Titre";
		this.visible = true;
	}
	
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public String getVerso() {
		return verso;
	}
	public void setVerso(String verso) {
		this.verso = verso;
	}
	public String getRecto() {
		return recto;
	}
	public void setRecto(String recto) {
		this.recto = recto;
	}

    public void retourner() {
    	this.setVisible(!this.visible);
    }

	@Override
	public String toString() {
		return "Feuille [verso=" + verso + ", recto=" + recto + ", visible=" + visible +" ]";
	}

	public void aff() {
		if (this.isVisible() == true) {
			if (this.recto == null) {
				System.out.println("Feuille [ le recto vide mdrr ]");
			} else {
				System.out.println("Feuille [ recto = \" "+ recto +" \" car c'est " + visible + " ]");
			}
		} else {
			if (this.verso == null) {
				System.out.println("Feuille [ le verso vide mdrr ]");
			} else {
			System.out.println("Feuille [ verso = \" "+ verso +" \" car c'est " + visible + " ]");
			}
		}
	}
	
	public void aff2() {
		System.out.println("Feuille [verso=" + verso + ", recto=" + recto + ", visible=" + visible +" ]");
	}
	
	

}

