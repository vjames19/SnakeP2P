package model;

public interface Movable {
	
	public void moveAbsolute(Position pos);
	public void moveRelative(Position pos);
	public Position getPosition();
	

}
