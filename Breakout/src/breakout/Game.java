package breakout;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application {
	public void start(Stage primary) throws Exception {
		Game game = new Game();
		game.play(primary);
	}
	
	private BrickManager brickMan;
	private Ball ball;
	private boolean gameOn;
	
	public Game() {
		brickMan = new BrickManager(8, 5);
		ball = new Ball();
		gameOn = true;
	}

	public void play(Stage gameStage){
		while(gameOn){
			tick();
			draw(gameStage);
		}
	}
	
	private void tick(){
		ball.tick();
	}
	
	private void draw(Stage stage){
		brickMan.draw();
		ball.draw();
		stage.show();
	}

}
