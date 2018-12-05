package myguiproject;

import java.awt.event.*;
import java.awt.*;
import static java.lang.Boolean.*;
import javax.swing.*;
import java.util.*;

public class DrawPanel extends JPanel{
	protected LinkedList< Entity > drawables;
        protected LinkedList< Entity > selection;
	public DrawPanel() {
		drawables = new LinkedList< Entity >();
                //addMouseListener( this );
	}

	public void addDrawable( Entity entity ) {
		drawables.add( entity );
	}

	protected void paintComponent( Graphics g ) {
		super.paintComponent(g);
		for ( int i = 0; i < drawables.size(); ++i )
			drawables.get( i ).draw( g );
	}

	public void translate( int dx, int dy ) {
		for ( int i = 0; i < drawables.size(); ++i )
			drawables.get( i ).translate( dx, dy );
	}
        
        /*
        @Override
        public void mousePressed(MouseEvent e){
            Point c = new Point(e.getX(),e.getY());
            if (isPointInside(c) == TRUE)
            System.out.println("The point is inside");
        }
        
        @Override
        public void mouseReleased(MouseEvent e);
        public void mouseEntered(MouseEvent e);
        @Override
        public void mouseExited(MouseEvent e);
        @Override
        public void mouseClicked(MouseEvent e);
*/
}
