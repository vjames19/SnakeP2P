package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Cell;
import model.Movable;
import model.Position;
import model.Snake;

public class SnakeMovable extends Snake implements Movable, KeyListener {

	public SnakeMovable(Position pos, int size, Orientation o) {
		super(pos, size, o);

	}

	@Override
	public void moveAbsolute(Position pos) {

	}

	@Override
	public void moveRelative(Position pos) {
		
		for(int i=0; i< body.size() -1; i++)
		{
			Cell temp = body.get(i);
			Cell change = body.get(i+1);
			change.setPos(temp.getPos());
		}
		
		body.get(0).setPos(pos);
		
	}
	
	private up()
	{
		
	}

	@Override
	public Position getPosition() {

		return headPosition();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		e.
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
