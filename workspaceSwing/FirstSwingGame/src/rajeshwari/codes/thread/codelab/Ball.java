package rajeshwari.codes.thread.codelab;

import java.awt.Graphics2D;

public class Ball {
	private int velStep = 1;
	// fields to maintain left top corner of the moving ball.
	private int x;
	private int y;
	private int vx;
	private int vy;

	public Ball() {
		x = 0;
		y = 0;
		vx = 1;
		vy = 1;
	}

	public void draw(Graphics2D g2d) {
		g2d.fillOval(x, y, 30, 30);
	}

	public boolean moveBall(int panelWidth, int panelHeight, Slider slider) {
		int newX = x + vx;
		int newY = y + vy;
		boolean hasLost = false;
		// Right Side Collision
		if (newX + 30 > panelWidth) {
			vx = -1 * velStep;
		}
		// left side
		if (newX < 0) {
			vx = velStep;
		}
		// up side
		if (newY < 0) {
			vy = velStep;
		}

		int lowerY = newY + 30;
		int lowerX = newX + 15;
		int sliderUpperY = panelHeight - Slider.HEIGHT;
		int sliderLeftX = slider.getLeftXCordinate();
		int sliderRightX = slider.getLeftXCordinate() + Slider.WIDTH;
		if (lowerY > sliderUpperY && isBetween(lowerX, sliderLeftX, sliderRightX)) {
			vy = -1 * vy;
		} else if (newY + 30 > panelHeight) { // down Collision
			System.out.println(panelHeight);
			vy = -1 * velStep;
			hasLost = true;
		}
		x = x + vx;
		y = y + vy;
		return hasLost;
	}
	
	private boolean isBetween(int x, int left, int right) {
		if (x >= left && x <=right) {
			return true;
		}
		return false;
	}
}
