package myguiproject;

import java.awt.Graphics;
import java.util.LinkedList;

public class Lake extends EllipsoidalRegion{
    private String name;
    private LinkedList<Country> adjacent;
    
    public Lake(Point c1, int r1, int r2, String n){
        super(c1, r1, r2);
        this.name = n;
    }
    
    public void addAdjacent(Country c){
        this.adjacent.add(c);
    }
    
    public void draw(Graphics g, int x, int y){
        super.draw(g, x, y);
        g.drawString(this.name, this.c.getX() + x, this.c.getY() + r2/2 + y);
    }
}
