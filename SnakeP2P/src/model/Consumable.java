package model;

public class Consumable extends Cell {

	private int value;
	
	public Consumable(Position pos, int size, int value) {
		super(pos, size);
		setValue(value);

	}
	
	

	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
