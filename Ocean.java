package myguiproject;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;


public class Ocean extends PolygonalRegion{
    private String name;
    
    public Ocean(String n, LinkedList points){
        super(points);
        this.name = n;
    }
    
    public void draw(Graphics g, int x, int y){
        int size = this.points.size();
        int xArr[] = new int[size];
        int yArr[] = new int[size];
        
        for (int i = 0; i < size; i++){
            xArr[i] = this.points.get(i).getX() + x;
            yArr[i] = this.points.get(i).getY() + y;    
        }
        
        g.setColor(Color.BLUE);
        g.fillPolygon(xArr, yArr, size);
        g.setColor(Color.CYAN);
        g.drawPolygon(xArr, yArr, size);
        g.setColor(Color.BLACK);
        
    }
}
