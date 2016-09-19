package nl.jvr.oefening4.model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author vanrooijen
 */
public class Shape {
    
    protected Color color;
    protected int width = 20;
    protected int height = 20;

    public void drawImage(Graphics g, int posX, int posY) {
        System.out.println("drawImage not implemented for shape");
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
}