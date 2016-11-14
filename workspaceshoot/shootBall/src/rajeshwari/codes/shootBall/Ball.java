package rajeshwari.codes.shootBall;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ball {

	private static final int RADIUS = 5;
	public static final int HEIGHT = 2*RADIUS;
	public static final int WIDTH = 2*RADIUS;

	private final double GRAVITY = 90.8;
	private final double INTERVAL = 0.01;
	private double x;
	private double y;
	private double vx;
	private double vy;

	public Ball() {
		x = Constants.BALL_START_X;
		y = Constants.BALL_START_Y;
	}

	public void setVelocity(double velocityMagnitude, double angleInRadian) {
		vx = velocityMagnitude * Math.cos(angleInRadian);
		vy = velocityMagnitude * Math.sin(angleInRadian);
	}

	public boolean moveBall(int panelHeight, int panelWidth) {
		double predictedX = x + (vx*INTERVAL);
		if (predictedX + WIDTH > panelWidth || predictedX < 0) {
			vx = -0.8 * vx;
		}
		x = x + (vx * INTERVAL);
		
		double predictedY = y + (INTERVAL*vy+ 0.5*GRAVITY*INTERVAL*INTERVAL);
		if (predictedY + HEIGHT > panelHeight) {
			vy = -0.8 * vy;
		}
		y = y + (INTERVAL*vy+ 0.5*GRAVITY*INTERVAL*INTERVAL);
		vy = vy + GRAVITY*INTERVAL;
		return false;
	}

	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.MAGENTA);
		g2d.fillOval(convertToInt(x), convertToInt(y), WIDTH, HEIGHT);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	private int convertToInt(double d) {
		Double dob = new Double(d);
		return dob.intValue();
	}
}
