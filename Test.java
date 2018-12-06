package myguiproject;

import static java.lang.Boolean.*;
import java.awt.Color;
import java.util.LinkedList;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityDrawer app = new EntityDrawer();
        
        CircularRegion circle = new CircularRegion(new Point(50, 60), 120, Color.BLACK, Color.GREEN);
        app.addDrawable(circle);
        
        LinkedList<Point> rectangular1 = new LinkedList<>();
        
        rectangular1.add(new Point(400,60));
        rectangular1.add(new Point(400,200));
        rectangular1.add(new Point(500,200));
        rectangular1.add(new Point(500,60));
        
        RectangularRegion rect1 = new RectangularRegion(rectangular1, Color.BLACK, Color.RED);
        app.addDrawable(rect1);
        
        LinkedList<Point> triangular1 = new LinkedList<>();
        
        triangular1.add(new Point(270,220));
        triangular1.add(new Point(200,325));
        triangular1.add(new Point(330,325));
        
        TriangularRegion t1 = new TriangularRegion(triangular1, Color.BLACK, Color.BLUE);
        app.addDrawable(t1);

    }
    
}
