/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package drawing;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author arnol
 */
public class Drawing extends JPanel{

    /**
     * @param args the command line arguments
     */
    public void paintComponent(Graphics g) {
        // TODO code application logic here
        super.paintComponent(g);
//        int a = getWidth();
//        int b = getHeight();
//        int c = 280;
//        int d = 0;
//        g.drawLine(0, 0, a, b);
//        g.drawLine(0, 258, 280, 0);

//      super.paintComponent(g);
//      g.setColor(Color.YELLOW);
//      g.fillOval(10, 10, 200, 200);
//      // draw Eyes
//      g.setColor(Color.BLACK);
//      g.fillOval(55, 65, 30, 30);
//      g.fillOval(135, 65, 30, 30);
//      // draw Mouth
//      g.fillOval(50, 110, 120, 60);
//      // adding smile
//      g.setColor(Color.YELLOW);
//      g.fillRect(50, 110, 120, 30);
//      g.fillOval(50, 120, 120, 40);


    

        int linesToDraw = 15;
        int width = getWidth(); // total width
        int height = getHeight(); // total height
        int xDelta = width / linesToDraw;
        int yDelta = height / linesToDraw;

        // Put in a loop to draw draw lines from the
        // upper left corner to the end points as
        // follows:
        //     x = width, y = 0
        //     x = width - delta, y = delta
        //     x = width - 2 * delta, y = 2 * deltav
        //     ...
        //     x = (width - (n - 1) * delta), y = (n - 1) * delta
     // end method paintComponent

   
    }
    
}
