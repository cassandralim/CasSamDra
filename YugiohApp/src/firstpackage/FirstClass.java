package firstpackage;


import java.awt.*;
import javax.swing.*;

/* FrameDemo.java requires no other files. */
public class FirstClass {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Sam has monkey butt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(1750, 1000));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        Player p = new Player("Sam");
        JLabel label1 = new JLabel(p.getName() + " has won " + p.gamesWon );
        frame.add(label1);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}