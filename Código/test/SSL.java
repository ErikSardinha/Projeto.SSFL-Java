import javax.swing.*;
import java.awt.*;

public class SSL {
    
    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab;
    
    
    public SSL(){
       
        Login();
        
    
    }
    
    public void Login(){
    
        f = new JFrame("Login");
        f.setVisible(true);
        f.setSize(600,400);
        p = new JPanel();
        p.setBackground(Color.yellow);
        
        b1 = new JButton("Iniciar");
        lab = new JLabel("TESTANDO");
        
        p.add(b1);
        p.add(lab);
        
        f.add(p);
    }
    
    public static void main(String[] args){
    
        new SSL();
    
    }
}
