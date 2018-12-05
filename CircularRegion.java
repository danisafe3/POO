package myguiproject;

import java.awt.Color;

public class CircularRegion extends EllipsoidalRegion{

    public CircularRegion(Point ci, int r, Color lineColor, Color fillColor) {
        super(ci, r, r, lineColor, fillColor);
    }
    
}
