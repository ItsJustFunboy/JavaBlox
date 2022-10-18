package Game;

import java.awt.Canvas;
import javax.swing.*;

public class Window extends Canvas{

    public static void createWindow(int WIDTH, int HEIGHT, String TITLE){

        //Display game = new Display();
        JFrame frame = new JFrame();

       // frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(TITLE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);

    }
}