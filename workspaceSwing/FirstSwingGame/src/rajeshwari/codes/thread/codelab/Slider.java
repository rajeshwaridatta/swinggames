package rajeshwari.codes.thread.codelab;

import java.awt.Graphics2D;

public class Slider {

	public static final int WIDTH = 150;
	public static final int HEIGHT = 25;

	private int x;

	public Slider() {
		x = 0;
	}

	public void draw(Graphics2D g2d, int y) {
		g2d.fillRoundRect(x, y, WIDTH, HEIGHT, 25, 25);
	}

	public int getLeftXCordinate() {
		return x;
	}

	public void moveRight(int frameWidth) {
		int newX = x + 5;
		if (newX + WIDTH < frameWidth) {
			x = newX;
		}
	}

	public void moveLeft() {
		int newX = x - 5;
		if (newX > 0) {
			x = newX;
		}
	}
}
