package myguiproject;

public class City extends GeoPoint{
    private int numHab;
    
    public City(int x, int y, String n, int nh){
        super(x, y, n);
        this.numHab=nh;
    }
    
}

