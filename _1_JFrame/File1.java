package _1_JFrame;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

// 1 JFrame && 1 JLabel
public class File1 extends JFrame {
    File1() {
        this.setTitle("My First Project");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setResizable(false);
        setVisible(true);
    
        ImageIcon icon = new ImageIcon("logo.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));
        // this.getContentPane().setBackground(new Color(0xFFFFFF));
        // this.getContentPane().setBackground(Color.BLUE);
    
    }
    
}
