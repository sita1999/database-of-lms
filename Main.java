package sita;

import java.awt.EventQueue;
import sita.frame.LoginFrame;

/**
 *
 * @author sita kumari
 */
public class Main {
    public static void main(String[] args) {
         EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
