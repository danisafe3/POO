package myguiproject;

import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author u151197 u150276
 */
public class GeoPoint extends Point{
    
    //Atributos
    private String name;
    
    //Métodos
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public GeoPoint(int x, int y, String n)
    {
        super(x,y);
        this.name = n;
    }
    
    public void printPoint()
    {
        String city = this.name;
        int x = this.x;
        int y = this.y;
        System.out.println( "City " + city + " (" + x + "; " + y + ")" );
    }
    
    public double distance (Point p)
    {
        int x1 = this.x;
        int x2 = p.getX();
        int y1 = this.y;
        int y2 = p.getY();
        return (Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
    }
 
    public void draw(Graphics g, int x, int y)
    {
        g.fillOval(this.x + x, this.y + y, 3, 3);
    }
    
}
