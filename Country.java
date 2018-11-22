package myguiproject;

import java.awt.Graphics;
import java.awt.Color;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u151197
 */
public class Country extends PolygonalRegion{
    
    private String name;
    private LinkedList<City> cities;
    private LinkedList<Country> neighbors;
    private City capital;
    
    public Country(LinkedList l, String n, LinkedList cl, City cap){
        
        super(l);
        this.name = n;
        this.cities = cl;
        this.capital = cap;
    }
    
    public void addNeighbor(Country c){
        this.neighbors.add(c);
    }
    
    public void draw(Graphics g, int x, int y){
        super.draw(g, x, y);
        
        for(int i = 0; i < this.cities.size(); i++){
            City city = this.cities.get(i);
            g.drawString(city.getName(), city.getX() + x - 12, city.getY() + y - 2);
            if (this.capital.getName().equals(city.getName())){
                g.setColor(Color.RED);
            }
            city.draw(g, x, y);
            g.setColor(Color.BLACK);
        }
    }
    
}
