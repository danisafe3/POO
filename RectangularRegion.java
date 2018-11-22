package myguiproject;

import java.util.LinkedList;

public class RectangularRegion extends PolygonalRegion{
    
    public RectangularRegion(LinkedList l){
        super(l);
    }
    
    public double getArea(){
        int x = 0;
        int y = 0;        
        for(int i = 0; i < this.points.size();  i++ ){
        x = this.points.get(i).getX();
        y = this.points.get(i).getY();
    }
        return x*y;
  }
}
