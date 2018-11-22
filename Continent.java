package myguiproject;

import java.awt.Graphics;
import java.util.LinkedList;

public class Continent {

    private String name;
    private LinkedList<Country> countries;
    private LinkedList<Lake> lakes;

    public Continent(String name, LinkedList c, LinkedList l) {

        this.name = name;
        this.countries = c;
        this.lakes = l;
        
    }

    public double getTotalArea() {

        double area = 0;
        //hacer que el area total sea la suma de todos los countries
        for (int i = 0; i < this.countries.size(); i++) {
            area += this.countries.get(i).getArea();
        }

        return area;
    }

    public void draw(Graphics g, int x, int y) {

        for (int i = 0; i < this.countries.size(); i++) {
            this.countries.get(i).draw(g, x, y);
        }
        
        for (int i = 0; i < this.lakes.size(); i++) {
            this.lakes.get(i).draw(g, x, y);
        }
        
        System.out.println("Drawn continent " + this.name);
    }
}
