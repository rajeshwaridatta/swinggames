package rajeshwari.codes.thread.codelab;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class GameJPanel extends JPanel {
	
	private Ball ball;
	private Slider slider;

	public GameJPanel() {
		super();
		ball = new Ball();
		System.out.println("In Construction width : " + getWidth());
		slider = new Slider();
		setFocusable(true);
	}

	public void handleRightArrowPressed() {
		slider.moveRight(getWidth());
	}

	public void handleLeftArrowPressed() {
		slider.moveLeft();
	}

	public boolean update() {
		return ball.moveBall(getWidth(), getHeight(), slider);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		ball.draw(g2d);
		slider.draw(g2d, getHeight() - Slider.HEIGHT);
	}
}