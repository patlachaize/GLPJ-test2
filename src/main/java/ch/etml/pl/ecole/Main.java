package ch.etml.pl.ecole;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        EcoleService ecoleService = new EcoleService();
        CoursFrame coursFrame = new CoursFrame(ecoleService);
        coursFrame.setTitle("Cours");
        coursFrame.setSize(200, 200);
        coursFrame.setVisible(true);
        coursFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        EleveFrame eleveFrame = new EleveFrame(ecoleService);
        eleveFrame.setTitle("Eleves");
        eleveFrame.setSize(300, 200);
        eleveFrame.setLocation(200,0);
        eleveFrame.setVisible(true);
        eleveFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

}
