/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myguiproject;

import java.util.LinkedList;

/**
 *
 * @author u150276
 */

public class RectangularRegion extends PolygonalRegion{
    public RectangularRegion(LinkedList l)
    {
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
