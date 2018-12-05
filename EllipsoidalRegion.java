package myguiproject;

import java.awt.Graphics;
import java.awt.Color;
import static java.lang.Boolean.*;

public class EllipsoidalRegion extends Region{
    
    protected Point c;
    protected int r1;
    protected int r2;
    
    public EllipsoidalRegion(Point ci, int r1, int r2, Color lineColor, Color fillColor){
        super(lineColor, fillColor);
        this.c = ci;
        this.r1 = r1;
        this.r2 = r2;
    }
    
    public double getArea(){
        return this.r1*this.r2*Math.PI;
    }
    
    public void draw(Graphics g){
        g.setColor(this.fillColor);
        g.fillOval(c.getX(), c.getY(), this.r1, this.r2);
        g.setColor(this.lineColor);
        g.drawOval(c.getX(), c.getY(), this.r1, this.r2);
        g.setColor(Color.BLACK);
    }
    
    public boolean isPointInside(Point p){
        return FALSE;
    }
    
    public void translate(int dx, int dy){
        
    }
}
