package model;

import java.util.ArrayList;
import java.util.List;

public class Snake extends Cell {
	public enum Orientation {
		LEFT, RIGHT, DOWN, UP
	}

	private static final int INITIAL_SIZE = 4;
	private List<Cell> body;
	private Orientation direction;
	
	public Snake(int x, int y, int size, Orientation o) {
		super(x, y, size);
		this.body = new ArrayList<Cell>(4);
		
		if (o == Orientation.LEFT) {
			for(int i = 0; i < INITIAL_SIZE; ++i) {
				body.add( new Cell(x, y - i * size, size) );
			}
		}
		else if (o == Orientation.RIGHT) {
			for(int i = 0; i < INITIAL_SIZE; ++i) {
				body.add( new Cell(x, y + i * size, size) );
			}
		}
		else if (o == Orientation.DOWN) {
			for(int i = 0; i < INITIAL_SIZE; ++i) {
				body.add( new Cell(x - i * size, y, size) );
			}
		}
		else if (o == Orientation.UP) {
			for(int i = 0; i < INITIAL_SIZE; ++i) {
				body.add( new Cell(x + i * size, y, size) );
			}
		}
	}

	public Orientation getDirection() {
		return direction;
	}

	public void setDirection(Orientation direction) {
		this.direction = direction;
	}
	
	public int headPosition() {
		return body.get(0);
	}
}