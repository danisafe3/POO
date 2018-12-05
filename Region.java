package myguiproject;

import java.awt.Graphics;
import java.awt.Color;


public abstract class Region extends Entity{
    
    protected Color fillColor;

    public Region(Color lineColor, Color fillColor) {
        super(lineColor);
        this.fillColor = fillColor;
    }
    
    public abstract double getArea();
    
    public void setFillColor(Color c){
        this.fillColor = c;
    }
    
    public abstract boolean isPointInside(Point p);
}
