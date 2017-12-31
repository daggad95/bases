import processing.core.PApplet;
import bases.GameState;


public class Main extends PApplet {
	private static GameState game;

	public static void main(String args[]) {
		PApplet.main("Main");
	}

	public void setup() {}

	public void draw() {
		game.draw(this);
	}

	public void settings() {
		size(800, 800);	
		game = new GameState(40, null);
	}
}
