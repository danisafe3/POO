package myguiproject;

import java.awt.Color;
import java.math.*;

public class CircularRegion extends EllipsoidalRegion{

    public CircularRegion(Point ci, int r, Color lineColor, Color fillColor) {
        super(ci, r, r, lineColor, fillColor);
    }
    public double getArea(){
        return Math.pow(r1, 2)*Math.PI;
    }
}