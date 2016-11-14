package rajeshwari.codes.shootBall;

import java.awt.Color;
import java.awt.Graphics2D;

public class Blocks {
	private int width;
	private int height;
	private int x;
	private int y;
	private Color color = Color.blue;

	public Blocks(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void draw(Graphics2D g2d){
		g2d.setColor(color);
		g2d.fillRoundRect(x, y, width, height, width/10, height/10);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
