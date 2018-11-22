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
        
        for(int i = 0; i < this.points.size();  i++ ){
        int x = this.points.get(i).getX();
        int y = this.points.get(i).getY();
    }
  }
}
