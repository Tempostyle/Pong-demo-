package Entity;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle2 extends entities {

	private int xd, yd;

	public Paddle2(int x, int y) {
		super(x, y);

		w = 20;
		h = 70;
	}

	public void draw(Graphics g) {
		move();

		g.setColor(Color.GREEN);
		g.fillRect(x, y / 2, w, h);
	}

	private void move() {

		y += yd;
		x += xd;
	}

	public void setXD(int value) {
		xd = value;
	}

	public void setYD(int value) {
		yd = value;
	}

}

