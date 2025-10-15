package exo1;

public class UnHerosSeDeplace extends MoyenDeTransport {
    
    public static void main(String[] args) {
        Voiture v = new Voiture();
        Ascenseur a = new Ascenseur();
        Fusee f = new Fusee();
        
        v.seDeplacer();
        System.out.println("Voiture: " + v.toString());
        
        a.seDeplacer();
        System.out.println("Ascenseur: " + a.toString());
        
        f.seDeplacer();
        System.out.println("Fusée: " + f.toString());
    }
}