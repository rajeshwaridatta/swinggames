package rajeshwari.codes.shootBall;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UserClickListener implements MouseListener {

	public boolean started = false;
	public Point clickPoint = null;

	@Override
	public void mouseReleased(MouseEvent arg0) {}
	
	@Override
	public void mousePressed(MouseEvent arg0) {}
	
	@Override
	public void mouseExited(MouseEvent arg0) {}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		started = true;
		clickPoint = arg0.getPoint();
	}
}