package model;

public class Cell {
	private Position pos;
	public Position getPos() {
		return pos;
	}
	public void setPos(Position pos) {
		this.pos = pos;
	}
	private int size;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Cell(Position pos, int size) {
		setPos(pos);
		setSize(size);
	}
	public int getX() {
		return pos.getX();
	}
	public void setX(int x) {
		pos.setX(x);
	}
	public int getY() {
		return pos.getY();
	}
	public void setY(int y) {
		pos.setY(y);
	}
}