package myguiproject;

import java.awt.Color;
import java.awt.Graphics;


public class EllipsoidalRegion extends Region{
    
    protected Point c;
    protected int r1;
    protected int r2;
    
    public EllipsoidalRegion(Point ci, int r1, int r2){
        this.c = ci;
        this.r1 = r1;
        this.r2 = r2;
    }
    
    public double getArea(){
        return this.r1*this.r2*Math.PI;
    }
    
    public void draw(Graphics g, int x, int y){
        g.setColor(Color.CYAN);
        g.fillOval(c.getX() + x, c.getY() + y, this.r1, this.r2);
        g.setColor(Color.BLACK);
    }
}
