package myguiproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gopbc
 */
import java.awt.Graphics;
import java.util.LinkedList;

public class World {

    private LinkedList<Continent> continents;
    private LinkedList<Ocean> oceans;

    public World(LinkedList c, LinkedList o) {
        this.continents = c;
        this.oceans = o;
    }

    public void draw(Graphics g, int x, int y) {

        for (int i = 0; i < this.continents.size(); i++) {
            this.continents.get(i).draw(g, x, y);
        }
        
        for (int i = 0; i < this.oceans.size(); i++) {
            this.oceans.get(i).draw(g, x, y);
        }
        
        System.out.println("- Drawn World.");
    }

}
