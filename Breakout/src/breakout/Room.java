package breakout;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Room {
	Scene scene;
	Pane pane;
	int width, height;

	public Room(int width, int height) {
		this.width = width;
		this.height = height;
		pane = new Pane();
		scene = new Scene(pane, width, height);
		scene.setFill(Color.DARKRED);
	}
	
	public Scene getScene() {
		return scene;
	}
	public Pane getPane(){
		return pane;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

	public void collision(Ball ball){
		//Check if ball collides with a wall or falls down in the abyss
		if(ball.getY() < ball.getRadius() && ball.getDy() < 0)
			ball.bounceY();
		if(
				ball.getX() < ball.getRadius()
				&& ball.getDx() < 0
				|| ball.getX() > width - ball.getRadius()
				&& ball.getDx() > 0)
		{
			ball.bounceX();
		}
	}
}
