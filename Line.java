package myguiproject;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Entity{
    
    protected Point p1;
    protected Point p2;
    
    public Line(Point p1, Point p2, Color lineColor){
        super(lineColor);
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public void translate(int dx, int dy){
        this.p1.x += dx;
        this.p1.y += dy;
        this.p2.x += dx;
        this.p2.y += dy;
    }
    
    public void draw(Graphics g){
        if(this.lineColor == null)
            g.setColor(Color.BLACK);
        else
            g.setColor(this.lineColor);
        g.drawLine(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
    }
    
}
