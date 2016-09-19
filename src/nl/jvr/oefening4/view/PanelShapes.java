package nl.jvr.oefening4.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import nl.jvr.oefening4.model.Oval;
import nl.jvr.oefening4.model.Rectangle;
import nl.jvr.oefening4.model.Shape;

/**
 *
 * @author vanrooijen
 */
class PanelShapes extends JPanel {
    
    private final int numberOfShapes = 4;
    private ArrayList<Shape> shapes = new ArrayList();
    private ArrayList<Color> colours = new ArrayList();

    public PanelShapes() {
        Random random = new Random();
        Shape newShape = null;
        
        colours.add(Color.RED);
        colours.add(Color.BLUE);
        colours.add(Color.GREEN);
        colours.add(Color.BLACK);
        
        for (int i = 0; i < numberOfShapes; i++) {
            int randomShape = random.nextInt(2);
            
            if (randomShape == 1) {
                newShape = new Rectangle();
            } else {
                newShape = new Oval();
            }
            
            int randomColor = random.nextInt(4);
            newShape.setColor(colours.get(randomColor));
            shapes.add(newShape);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 20;
        int y = 20;
        for (Shape shape : shapes) {
            shape.drawImage(g, x, y);
            x += 30;
        }
    }
}