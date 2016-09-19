package nl.jvr.oefening4.model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author vanrooijen
 */
public class Oval extends Shape {
    public void drawImage(Graphics g, int posX, int posY) {
        g.setColor(color);
        g.fillOval(posX, posY, width, height);
        g.setColor(Color.BLACK);
        g.drawOval(posX, posY, width, height);
    }
}
