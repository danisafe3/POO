package myguiproject;

import java.awt.*;
import java.awt.event.*;
import static java.lang.Boolean.*;
import javax.swing.*;
import java.util.*;

public class DrawPanel extends JPanel implements MouseListener {
    
	protected LinkedList< Entity > drawables;
        protected LinkedList< Entity > selection;
        
	public DrawPanel() {
                drawables = new LinkedList< Entity >();
                addMouseListener( this );
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
		for ( int i = 0; i < selection.size(); ++i )
			selection.get( i ).translate( dx, dy );
	}
        
        @Override
        public void mousePressed(MouseEvent e){
            Point c = new Point(e.getX(),e.getY());
                for (int i = 0; i < this.drawables.size(); i++){
                    if (this.drawables.get(i) instanceof Region){
                        System.out.println("ok");
                        /*
                        if (this.drawables.get(i).isPointInside(c)){
                            this.selection.add(this.drawables.get(i));
                            System.out.println("The point is inside");
                        }
                        */
                    }
                }
        }
        
        public void mouseReleased(MouseEvent e){
        }
        public void mouseEntered(MouseEvent e){
        }
        public void mouseExited(MouseEvent e){
        }
        public void mouseClicked(MouseEvent e){
        }
}
