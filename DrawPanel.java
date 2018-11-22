package myguiproject;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class DrawPanel extends JPanel {
	protected LinkedList< Entity > drawables;

	public DrawPanel() {
		drawables = new LinkedList< Entity >();
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
}
