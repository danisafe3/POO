package myguiproject;

public class Point {

    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    
    public String infoString() {
        return ("Point (" + x + "," + y + ")");
    }
    
    public void translate(int x, int y){
        this.x += x;
        this.y += y;
    }
    
    public Vector difference(Point a){
        int newX = this.x - a.getX();
        int newY = this.y - a.getY();
        Vector v = new Vector(newX, newY);
        return v;
    }

}
