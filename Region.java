/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myguiproject;

import java.awt.Graphics;


public abstract class Region {
    
    public abstract double getArea();
    public abstract void draw(Graphics g, int x, int y);
    
}
