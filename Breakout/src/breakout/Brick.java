package breakout;

import java.util.ArrayList;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Brick {
	private static int width, height;
	private static ArrayList<Brick> bricks = new ArrayList<>();
	//private static BrickManager manager; //Reference to the manager if bricks needs it for anything.
	private boolean broken;
	private Rectangle rectangle;
	
	public Brick(){
		broken = false;
		rectangle = new Rectangle(width, height, Color.GREEN);
		bricks.add(this);
	}

	public Brick(Pane pane, Color color, int x, int y) {
		broken = false;
		rectangle = new Rectangle(x, y, width, height);
		rectangle.setFill(color);
		bricks.add(this);
		pane.getChildren().add(rectangle);
	}

	public static int getWidth(){
		return width;
	}
	public static int getHeight(){
		return height;
	}
	public static void setDimensions(int width, int height){
		Brick.width = width;
		Brick.height = height;
		if(!bricks.isEmpty()){
			for(Brick brick : bricks){
				brick.rectangle.setWidth(width);
				brick.rectangle.setHeight(height);
			}
		}
	}

	public Color getColor(){
		return (Color)rectangle.getFill();
	}
	public boolean isBroken(){
		return broken;
	}

	public void breakBrick(){
		broken = true;
	}
}
