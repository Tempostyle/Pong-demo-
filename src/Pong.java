import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Entity.Ball;
import Entity.Paddle;
import Entity.Paddle2;


public class Pong extends JPanel implements KeyListener{

	private static final long serialVersionUID = 1L;
	
	private static final int WIDTH = 650;
	private static final int HEIGHT = 520;
	
	private int x = 600;
	private int y = HEIGHT / 2;
	
	private int x2 = 25;
	private int y2 = HEIGHT / 3;
	
	
	private int x3 = 325;
	private int y3 = 260;
	
	private Paddle paddle;
	private Paddle2 paddle2;
	private Ball ball;
	
	public Pong(){
		Dimension size = new Dimension(WIDTH, HEIGHT);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setFocusable(true);
		addKeyListener(this);
		
		ball = new Ball(x,y);
		paddle2 = new Paddle2(x2, y2);
		paddle = new Paddle(x, y);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.GREEN);
		g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
		
		g.setColor(Color.WHITE);
		g.drawOval(225, getHeight() / 3, 200, 200);
		
/*		g.setColor(Color.GREEN);
		g.fillRect(25, getHeight() / 3, 20, 70); */
		
		ball.draw(g);
		paddle2.draw(g);
		paddle.draw(g);
		
		repaint();
	}
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Pong");
		Pong pong = new Pong();
		frame.add(pong);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
	}

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		
		if(c == KeyEvent.VK_DOWN){
			paddle.setYD(5);
		}
		
		if(c == KeyEvent.VK_S){
			paddle2.setYD(5);
		}
		
		if(c == KeyEvent.VK_W){
			paddle2.setYD(-5);
		}
		
		if(c == KeyEvent.VK_UP){
			paddle.setYD(-5);
		}
	}

	public void keyReleased(KeyEvent e) {
		paddle.setYD(0);
		paddle2.setYD(0);
	}
	

}
