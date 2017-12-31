package bases;
import bases.mapobject.MapObject;

public class GameState {
	private int mapSize;
	private MapObject[][] map;
	
	public GameState(int mapSize) {
		this.mapSize = mapSize;

		map = new MapObject[mapSize][mapSize];
	}
}
