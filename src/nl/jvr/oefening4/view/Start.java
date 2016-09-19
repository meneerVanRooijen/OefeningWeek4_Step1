package nl.jvr.oefening4.view;

import javax.swing.*;

/**
 *
 * @author vanrooijen
 */
public class Start extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new Start();
        frame.setSize( 500, 300 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Oefening week 4" );
        frame.setContentPane( new PanelShapes() );
        frame.setVisible( true );
    }
}