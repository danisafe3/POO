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
        
        CircularRegion circle = new CircularRegion(new Point(50, 50), 120, Color.BLACK, Color.GREEN);
        app.addDrawable(circle);
        // Para comprobar si isPointInside de Ellipsoidal funciona correctamente
        if (circle.isPointInside(new Point(170, 170)))
            System.out.println("Point (170, 170) inside circle.");
        else
            System.out.println("ERROR.");
        if (!circle.isPointInside(new Point(280, 280)))
            System.out.println("Point (280, 280) not inside circle.");
        else
            System.out.println("ERROR.");
        if (circle.isPointInside(new Point(290, 170)))
            System.out.println("Point (290, 170) inside circle.");
        else
            System.out.println("ERROR.");
        
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
        TriangularRegion tr1 = new TriangularRegion(triangular1, Color.BLACK, Color.CYAN);
        app.addDrawable(tr1);
        
        Line l1 = new Line(new Point(200, 100), new Point(350, 300), null);
        app.addDrawable(l1);
        
        Text txt1 = new Text(new Point(100, 400), "Daniel", Color.ORANGE);
        app.addDrawable(txt1);

        Text txt2 = new Text(new Point(100, 410), "Gerard", Color.BLUE);
        app.addDrawable(txt2);

    }
    
}
