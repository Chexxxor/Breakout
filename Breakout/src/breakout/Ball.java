package breakout;

public class Ball {
	private int x, y, dx, dy, radius;

	public Ball() {
		x = 400;
		y = 700;
		dx = 0;
		dy = -3;
		radius = 4;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getDx() {
		return dx;
	}
	public int getDy() {
		return dy;
	}
	public int getRadius(){
		return radius;
	}

	public void tick(){
		x += dx;
		y += dx;
	}
	
	public void bounceX(){
		x = -x;
	}
	public void bounceY(){
		y = -y;
	}
	
	public void draw(){
		
	}

}
