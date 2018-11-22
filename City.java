/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myguiproject;


public class City extends GeoPoint{
    private int numHab;
    
    public City(int x, int y, String n, int nh){
        super(x, y, n);
        this.numHab=nh;
    }
    
}

