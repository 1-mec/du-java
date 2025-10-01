package trucs;
import javax.swing.*;
import java.awt.*;
import trucs.Casino.*;
public class toto {

    public toto(){
    }

    Casino c = new Casino();
    
    Color colore = new Color(255,0,0);
    private JFrame TOto = new JFrame();
    private JPanel pan = new JPanel();
    private JButton btn = new JButton("blabla");
    private char[] signe1 = {'<','>'};
    private char[] signe2 = {'-','o'};
    private char[] signe3 = {'|','+'};
    
    public char[] res = new char[5];

    public char[] jouer(){
        
    for (int i = 0 ; i < 5 ; i++) {
        int p = (int)(Math.random()*2);
        switch(i)
        {
        case(1 | 5):
            res[i] = signe1[p];
            break;
        case(2| 4):
            res[i] = signe2[p];
            break;
        case(3):
            res[i] = signe3[p];
        }
        res[i] = signe1[p];
    }
    return res;
    }

    public void aff(){
        TOto.setSize(1920,1080);

        pan.setBounds(new Rectangle(400, 300, 300,400));
        pan.setBackground(colore);

        
        JPanel x = new JPanel();
        x.setBounds(new Rectangle(400, 300, 400,300));
        x.setBackground(Color.BLACK);

        btn.setBounds(800,650,100,100);
        btn.addActionListener(e -> {
            TOto.dispose();
            c.activites();
        });

        //TOto.add(x);
        TOto.add(pan);
        TOto.add(btn);
        TOto.setLayout(null);
        TOto.setVisible(true);
    }
    public static void main(String[] args) {
        toto t = new toto();
        t.aff();

    }
    
}
