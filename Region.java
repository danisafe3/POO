package myguiproject;

import java.awt.Graphics;


public abstract class Region {
    private Color fillColor;

    public Region(Color fillColor) {
        this.fillColor = fillColor;
    }
    
    public abstract double getArea();
    public void setFillColor(Color c){
        
    }
    public abstract boolean isPointInside(Point p);
}
