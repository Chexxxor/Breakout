package breakout;

public class BrickManager {
	Brick[][] bricks;

	public BrickManager(int dimensionX, int dimensionY) {
		bricks = new Brick[dimensionY][dimensionX];
		for(int y = 0; y < dimensionY; y++){
			for(int x = 0; x < dimensionX; x++){
				bricks[y][x] = new Brick();
			}
		}
	}
	
	public boolean isCollision(Ball ball){
		return false;
	}
	
	public void draw(){
		
	}

}
