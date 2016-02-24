package breakout;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application {
	public void start(Stage primary) throws Exception {
		Game game = new Game();
		game.play(primary);
	}
	
	private boolean gameOn;
	
	public Game() {
		gameOn = true;
	}

	public void play(Stage gameStage){
		while(gameOn){
			tick();
			draw(gameStage);
		}
	}
	
	private void tick(){
		//"1 tick = 1 frame"-ish
	}
	
	private void draw(Stage stage){
		
	}

}
