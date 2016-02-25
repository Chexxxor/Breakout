package breakout;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application {
	private Stage gameStage;
	private Room room;
	private BrickManager brickMan;
	private Ball ball;
	private boolean gameOn;

	public void start(Stage primary) throws Exception {
		room = new Room(800, 800);
		brickMan = new BrickManager(8, 5);
		ball = new Ball();
		gameOn = true;

		gameStage = primary;
		gameStage.setTitle("Breakout - The Game!");
		gameStage.setScene(room.getScene());
		gameStage.setResizable(false);

		play();
	}
	
	public Game() {}

	public void play(){
		while(gameOn){
			tick();
			draw();
		}
	}
	
	private void tick(){
		ball.tick();
		room.collision(ball);
	}
	
	private void draw(){
		brickMan.draw();
		ball.draw();
		gameStage.show();
	}

}
