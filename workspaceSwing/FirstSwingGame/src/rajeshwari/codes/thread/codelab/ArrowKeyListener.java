
package rajeshwari.codes.thread.codelab;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeyListener implements KeyListener {

	private final GameJPanel panel;
	public ArrowKeyListener(GameJPanel panel) {
		this.panel = panel;
	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {
		if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.panel.handleRightArrowPressed();
		} else if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
			this.panel.handleLeftArrowPressed();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}
