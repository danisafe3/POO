package myguiproject;

import java.awt.Color;
import java.util.LinkedList;

public class RectangularRegion extends PolygonalRegion{
    
    public RectangularRegion(LinkedList l, Color lineColor, Color fillColor)
    {
        super(l, lineColor, fillColor);
    }
    
    public double getArea(){
        int x1,y1,x2,y2;
        x1 = this.points.get(0).getX();
        y1 = this.points.get(0).getY();
        x2 = this.points.get(2).getX();
        y2 = this.points.get(2).getY();
        return (x2-x1)*(y2-y1);
  }
}
