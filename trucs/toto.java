package trucs;
import javax.swing.*;
import java.awt.*;
public class toto {

    public toto(){
    }

    Casino c = new Casino();

    int compteur ;
    Color colore = new Color(255,0,0);
    private JFrame TOto = new JFrame();
    private JPanel pan = new JPanel();
    private JButton btn = new JButton("Acceuil");
    private JButton btn2 = new JButton("recommencer");
    private char[] signe1 = {'<','>'};
    private char[] signe2 = {'-','o'};
    private char[] signe3 = {'|','+'};
    public char[] res = new char[5];

    public char[] jouer(){
        
	    for (int i = 0 ; i < 5 ; i++) {
	        int p = (int)(Math.random()*2);
	        switch(i)
	        {
	        case(0):
	        case(4):
	            res[i] = signe1[p];
	            break;
	        case(1):
	        case(3):
	            res[i] = signe2[p];
	            break;
	        case(2):
	            res[i] = signe3[p];
	        }
	        
	        System.out.print(res[i]);
	    	}
	    char[] tot = {'<','o','+','o','>'};
	    if (res == tot ) {
	    	compteur ++;
	    }
	    return res;
    }
    
    JLabel tr = new JLabel (new String(Integer.toString(compteur)));

    public void aff(){
        TOto.setSize(1920,1080);

        tr.setBounds(0,0, 10,10);
        
        pan.setBounds(new Rectangle(400, 300, 300,400));
        pan.setBackground(colore);

        
        JPanel x = new JPanel();
        x.setBounds(new Rectangle(400, 300, 400,300));
        x.setBackground(Color.BLACK);

        btn.setBounds(950,750,100,80);
        btn.addActionListener(e -> {
            TOto.dispose();
            c.activites();
            
        });
        btn2.setBounds(750,750,100,80);
        btn2.addActionListener(e -> {
            System.out.println("");
            System.out.println(compteur);
            jouer();
            
        });
        
        //TOto.add(x);

        TOto.add(tr);
        TOto.add(pan);
        TOto.add(btn);
        TOto.add(btn2);
        TOto.setLayout(null);
        TOto.setVisible(true);
    }
    public static void main(String[] args) {
        toto t = new toto();
        t.aff();
        t.jouer();

    }
    
}
