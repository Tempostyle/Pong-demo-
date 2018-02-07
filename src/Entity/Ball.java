package Entity;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends entities{
	
	private int xBall;
	private int yBall;
	
	private int xVelocity = -5;
	private int yVelocity = -5;
	
	public Ball(int x, int y) {
		super(x, y);
		System.out.println("Ball is drawn");
		xBall = x;
		yBall = y;
	}
	
	  public void update(){
		xBall = xBall + xVelocity;
		yBall = yBall + yVelocity;
		
		if(xBall < 0){
			xVelocity = 1;
		}
	}
	
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillOval(xBall, yBall , 50, 50);
		System.out.println("Ball is updated");
		update();
	}

}
