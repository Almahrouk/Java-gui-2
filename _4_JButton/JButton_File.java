package _4_JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.border.Border;

// JButton & Event
public class JButton_File extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    JButton_File() {
        ImageIcon icon = new ImageIcon("");
        ImageIcon icon2 = new ImageIcon("");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("Click me!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
        // add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /* 
        if (e.getSource().equals(button)) {
            System.out.println("You clicked the button.");
        }
        */
        if(e.getSource()==button) {
            System.out.println("Yessssss");
            // button.setEnabled(false);
            label.setVisible(true);
        }
    }
    
}
