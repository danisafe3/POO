package myguiproject;

import java.awt.Graphics;
import java.awt.Color;

abstract public class Entity {
	protected Color lineColor;

	public Entity( Color lcinit ) {
		lineColor = lcinit;
	}

	abstract public void draw( Graphics g );

	abstract public void translate( int dx, int dy );
	
}
