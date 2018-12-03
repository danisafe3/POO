package myguiproject;

import java.util.LinkedList;

public class RectangularRegion extends PolygonalRegion{
    
    public RectangularRegion(LinkedList l)
    {
        super(l);
    }
    
    public double getArea(){
        int x1 = 0;
        int y1 = 0;    
        int x2 = 0; 
        int y2 = 0;
        x1 = this.points.get(0).getX();
        y1 = this.points.get(0).getY();
        x2 = this.points.get(2).getX();
        y2 = this.points.get(2).getY();
        return (x2-x1)*(y2-y1);
  }
}
