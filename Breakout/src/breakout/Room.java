package breakout;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Room {
	//Stage room;
	Scene scene;
	GridPane grid;
	int width, height;

	public Room(int width, int height) {
		//room = stage;
		this.width = width;
		this.height = height;
		grid = new GridPane();
		scene = new Scene(grid, width, height);
		scene.setFill(Color.BLACK);
		//room.setScene(scene);
	}
	
	public Scene getScene() {
		return scene;
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
	
	/*public void draw(){
		room.show();
	}*/

}
