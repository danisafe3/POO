package myguiproject;

public class Vector extends Point{
    
    public Vector(int x, int y){
        super(x, y);
    }
    
    public int crossProduct(Vector v){
        int x1y2 = this.x * v.getY();
        int y1x2 = this.y * v.getX();
        int i = x1y2 - y1x2;
        return i;
    }
    
}

