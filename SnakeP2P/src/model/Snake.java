package model;

import java.util.List;
import java.util.ArrayList;

public class Snake extends Cell {
	public enum Orientation {
		LEFT, RIGHT, DOWN, UP
	}

	private static final int INITIAL_SIZE = 4;
	protected List<Cell> body;
	private Orientation direction;
	
	public Snake(Position pos, int size, Orientation o) {
		super(pos, size);
		this.body = new ArrayList<Cell>(4);

		Position offset = pos;
		int x = pos.getX();
		int y = pos.getY();
		for (int i = 0; i < INITIAL_SIZE; ++i) {
			if (o == Orientation.LEFT) {
				offset = new Position(x, y - i * size);
			}
			else if (o == Orientation.RIGHT) {
				offset = new Position(x, y + i * size);
			}
			else if (o == Orientation.DOWN) {
				offset = new Position(x - i * size, y);
			}
			else if (o == Orientation.UP) {
				offset = new Position(x + i * size, y);
			}
			
			body.add( new Cell(offset, size) );
		}
	}

	public Orientation getDirection() {
		return direction;
	}

	public void setDirection(Orientation direction) {
		this.direction = direction;
	}
	
	public Position headPosition() {
		return body.get(0).getPos();
	}
}