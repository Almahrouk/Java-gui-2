package _10_JOptionPane;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        // JOptionPane
        /*
            pop-up a standard dialog box that prompts user 
            for a value or informs them of something.
        */
        JOptionPane.showMessageDialog(null, "This is useless info", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Really??", "Question", JOptionPane.QUESTION_MESSAGE);
        /* 
        while(true) {
            JOptionPane.showMessageDialog(null, "You're Computer Has A VIRUS!!!!", "VIRUS", JOptionPane.WARNING_MESSAGE);
        }
        */
        JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!!", "Get Help", JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showConfirmDialog(null, "Bro, Do You Even Code??", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        // System.out.println(JOptionPane.showConfirmDialog(null, "Bro, Do You Even Code??", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION););
        // int answer = JOptionPane.showConfirmDialog(null, "Bro, Do You Even Code??", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);

        // String name = JOptionPane.showInputDialog("What is your name ?")
        // System.out.println("Hello" + name);
        String[] response = {"No, you're awesome", "thank you!", "Oooooh Do I?"};
        JOptionPane.showOptionDialog(null, "You are awesome!", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, response, 0);



    }
}
