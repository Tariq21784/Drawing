/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawing;
import java.awt.BorderLayout;
import javax.swing.*;
/**
 *
 * @author arnol
 */
public class DrawingTest {
    public static void main(String[] args) {
    JFrame app = new JFrame();
    Drawing draw = new Drawing();
    app.setSize( 300, 300 );
    app.setVisible( true );
    app.add(draw);

//      Drawing smiley = new Drawing();
//      JFrame app = new JFrame("Smiley App");
//      app.add(smiley, BorderLayout.CENTER);
//      app.setSize(300, 300);
//      app.setLocationRelativeTo(null);
//      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      app.setVisible(true);



        // set the frame to exit when it is closed
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
