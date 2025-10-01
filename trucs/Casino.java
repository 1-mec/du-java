package trucs;

import javax.swing.*;
import java.awt.*;


//boutons -> rester sur le mm truc

public class Casino extends JFrame {
    private JFrame f = new JFrame(); 
    private JButton send = new JButton("Click right there");
    private JLabel lab = new JLabel("clickez sur le mode de jeux souhaitÃ©");
    

    public void init() {
        f.setSize(920,600);
        
        send.setPreferredSize(new Dimension(100,100));
        send.addActionListener(e -> {
            f.dispose();
        });
        
        lab.setSize(70,80);
        f.add(lab);
        f.setLayout(new FlowLayout());
        f.setLocation(400,300);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.add(send);
        f.setVisible(true);
    }

    public void activites(){
        toto t = new toto();
        t.jouer();
        init();
        char[] x = t.res ;
    }

    public static void main(String[] args) {
       Casino c = new Casino();
       c.init();
       c.activites();
    }
}

