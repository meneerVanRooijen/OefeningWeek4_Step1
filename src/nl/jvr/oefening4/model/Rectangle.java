package nl.jvr.oefening4.model;

import java.awt.Color;
import java.awt.Graphics;
import nl.jvr.oefening4.model.Shape;

/**
 *
 * @author vanrooijen
 */
public class Rectangle extends Shape {
    
    public void drawImage(Graphics g, int posX, int posY) {
        g.setColor(color);
        g.fillRect(posX, posY, width, height);
        g.setColor(Color.WHITE);
        g.drawRect(posX, posY, width, height);
    }    
}