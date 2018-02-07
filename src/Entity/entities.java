package Entity;

import java.awt.Graphics;

public class entities {
	
	protected int x, y, w, h;
	protected boolean removed = false;
	
	public entities(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g){
		
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	public int getW() { return w; }
	public int getH() { return h; }
}
