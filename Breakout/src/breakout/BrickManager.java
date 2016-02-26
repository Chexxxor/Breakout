package breakout;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class BrickManager {
	Brick[][] bricks;

	public BrickManager(Pane pane, int dimensionX, int dimensionY, int width, int height) {
		Brick.setDimensions(width, height);
		bricks = new Brick[dimensionY][dimensionX];
		for(int y = 0; y < dimensionY; y++){
			for(int x = 0; x < dimensionX; x++){
				bricks[y][x] = new Brick(pane, Color.CYAN, x*(width + 5), y*(height + 5));
			}
		}
	}
	
	public boolean isCollision(Ball ball){
		//if(ball.getY() < .... 
		//	bricks[y][x].breakBrick();
		//	ball.bounceXorY();
		return false;
	}
	
	public void collision(Ball ball){
		
	}
	
	public void draw(Scene scene){
		
	}

}
