package _6_FlowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
        public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10 , 10));
        /* 
        FlowLayout(FlowLayout.LEADING)
        FlowLayout(FlowLayout.TRAILING)
        FlowLayout(FlowLayout.LEFT)
        FlowLayout(FlowLayout.RIGHT)
        FlowLayout(FlowLayout.CENTER)
        
        */

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10 , 10));


        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));
        

        /* 
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));
        */
        frame.add(panel);
        frame.setVisible(true);
        /*
        JButton button1 = new JButton();
        button1.setText("button1");
        frame.add(button1);
        */
    }
}
