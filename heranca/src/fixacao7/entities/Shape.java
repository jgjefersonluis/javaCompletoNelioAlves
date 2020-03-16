package fixacao7.entities;

import fixacao7.entities.enums.Color;

public class Shape {

	private Color color;

	public Shape() {

	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double area() {
		return 0;
	}

}
