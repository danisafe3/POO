/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myguiproject;

import java.awt.Graphics;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author gopbc
 */
public class Text {
    private Point c;
    private String text;

    public Text(Point c, String text) {
        this.c = c;
        this.text = text;
    }
    
    public void  draw(Graphics g){
        
        g.drawString(this.text, this.c.x, this.c.y);
        }
    public void move(Vector v){
        this.c.x +=v.x;
        this.c.y+=v.y;
    }
    
    public boolean isPointClose(Point p){
     
        
        return TRUE;
        
    }
    public boolean isSelected(Point p){
        
        return TRUE;
    }
}
