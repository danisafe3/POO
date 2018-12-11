package myguiproject;

import java.awt.Graphics;
import java.awt.Color;
import static java.lang.Boolean.*;

public class Text extends Entity{
    private Point c;
    private String text;

    public Text(Point c, String text, Color color) {
        super(color);
        this.c = c;
        this.text = text;
    }
    
    public void draw(Graphics g){
        if(this.lineColor == null)
            g.setColor(Color.BLACK);
        else
            g.setColor(this.lineColor);
        g.drawString(this.text, this.c.x, this.c.y);
    }
    
    public void translate(int dx, int dy){
        this.c.x += dx;
        this.c.y += dy;
    }
    
    public boolean isPointClose(Point p){
        
        return TRUE;
    }
    public boolean isSelected(Point p){
        
        return TRUE;
    }
}
