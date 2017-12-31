package bases;
import java.util.LinkedList;
import processing.core.PApplet;
import bases.mapobject.MapObject;
import bases.Team;

public class GameState {
	private int mapSize;
	private MapObject[][] map;
	private LinkedList<Team> teams;
	
	public GameState(int mapSize, LinkedList<Team> teams) {
		this.mapSize = mapSize;
		this.teams = teams;

		map = new MapObject[mapSize][mapSize];
	}

	public void update() {
	}

	public void draw(PApplet papp) {}
}
