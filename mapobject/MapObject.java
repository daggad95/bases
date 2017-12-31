package bases.mapobject;
import processing.core.PApplet;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class MapObject {
	protected PApplet pApp;
	protected int x;
	protected int y;

	public MapObject(){}
	public MapObject(PApplet pApplet) {
		this.pApp = pApplet;
	}

	public void draw(){
		throw new NotImplementedException();
	}
}
