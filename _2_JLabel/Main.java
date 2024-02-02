package _2_JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;


// 1 JFrame && 1 JLabel
public class Main {
    public static void main(String[] args) {
        
        // JLabel = a GUI display area for a string of text, image, or bouth.
        ImageIcon image = new ImageIcon("two/Developer.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

        JLabel label = new JLabel();
        label.setText("Bor, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(-25); // set gap of text to image
        label.setBackground(Color.BLACK);
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 250, 250);


        JFrame frame = new JFrame("My Secound Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        // frame.getContentPane().add(label);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
        
        // label.setBounds(0, 0, 500, 375);
    }
}



