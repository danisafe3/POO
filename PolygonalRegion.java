package myguiproject;

import java.awt.Graphics;
import java.util.LinkedList;
import static java.lang.Boolean.*;

public class PolygonalRegion extends Region{
    
    protected LinkedList<Point> points;

    public PolygonalRegion(LinkedList l) {
        this.points = l;
    }

    public double getArea() {

        double a1 = 0, a2 = 0;

        int x1, y1, x2, y2;
        
        if (this.points.size() < 3) {
            System.out.println("ERROR: Points missing");
        }

        for (int i = 0; i < this.points.size(); i++) {
            x1 = this.points.get(i).getX();
            y1 = this.points.get(i).getY();

            if (i == this.points.size() - 1) {
                x2 = this.points.get(0).getX();
                y2 = this.points.get(0).getY();

                a1 += x1 * y2;
                a2 += x2 * y1;

            } else {
                x2 = this.points.get(i + 1).getX();
                y2 = this.points.get(i + 1).getY();

                a1 += x1 * y2;
                a2 += x2 * y1;
            }

        }

        double area = (1 / 2) * (a1 - a2);

        return area;
    }

    public void draw(Graphics g, int x, int y) {

        int x1, y1, x2, y2;
        int check = 0;
        
        if (this.points.size() < 2) {
            System.out.println("ERROR: Points missing");
        }

        for (int i = 0; i < this.points.size(); i++) {
            x1 = this.points.get(i).getX();
            y1 = this.points.get(i).getY();

            if (i == this.points.size() - 1) {
                x2 = this.points.get(0).getX();
                y2 = this.points.get(0).getY();
                check = 1;
            } else {
                x2 = this.points.get(i + 1).getX();
                y2 = this.points.get(i + 1).getY();
            }

            g.drawLine((int) (x1 + x), (int) (y1 + y), (int) (x2 + x), (int) (y2 + y));

            if (check == 1){
                System.out.println("   Drawn line between " + this.points.get(i).infoString() + " and " + this.points.get(0).infoString());
            } else {
                System.out.println("   Drawn line between " + this.points.get(i).infoString() + " and " + this.points.get(i+1).infoString());
            }
        }
        
    }
    
    public boolean isPointInside(Point p){
        
        int sign = 0;
        
        Point q1, q2;
        
        for (int i = 0; i < this.points.size(); i++) {
            
            q1 = this.points.get(i);

            if (i == this.points.size() - 1) {
                q2 = this.points.get(0);
            } else {
                q2 = this.points.get(i + 1);
            }
            
            Vector q2q1 = q2.difference(q1);
            Vector pq1 = p.difference(q1);
            
            int crossProd = q2q1.crossProduct(pq1);
            
            if (i == 0){
                if (crossProd > 0)
                    sign = 1;
                else
                    sign = -1;
            }else{
                int y = crossProd * sign;
                if (y < 0)
                   return FALSE;
            }
            
        }
        
        return TRUE;
    }
    
}
