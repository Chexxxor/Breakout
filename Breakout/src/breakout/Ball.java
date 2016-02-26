package breakout;

import javafx.scene.shape.Sphere;
import javafx.scene.layout.Pane;

public class Ball {
	private int x, y, dx, dy, radius;
	private Sphere sphere;

	public Ball(Pane pane) {
		x = 450;
		y = 550;
		dx = 0;
		dy = -3;
		radius = 4;
		sphere = new Sphere(radius);
		pane.getChildren().add(sphere);
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
		y += dy;
	}
	
	public void updateSphere(){
		sphere.setLayoutX(x);
		sphere.setLayoutY(y);
	}
	
	public void bounceX(){
		x = -x;
	}
	public void bounceY(){
		y = -y;
	}

}
