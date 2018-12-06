/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myguiproject;

import static java.lang.Boolean.*;
import java.awt.Color;

/**
 *
 * @author Daniel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityDrawer app = new EntityDrawer();
        
        CircularRegion circle = new CircularRegion(new Point(50, 60), 120, Color.BLACK, Color.GREEN);
        app.addDrawable(circle);
        
    }
    
}
