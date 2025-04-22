package assignment9;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	private Color color;
	
	public BodySegment(double x, double y, double size) {
		this.x =x;
		this.y = y;
		this.size = size;
		this.color = new Color (34, 139, 34);
	}
		
		//See ColorUtils for some color options (or choose your own)
	//}
	
	/**
	 * Draws the segment
	 */
	public void draw() {
		StdDraw.setPenColor(this.color);
		StdDraw.filledSquare(this.x, this.y, this.size / 2);
	}
	public double getX () {
		return this.x;
	
}
	public double getY () {
		return this.y;
	}
	
	public void setPostion (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
}