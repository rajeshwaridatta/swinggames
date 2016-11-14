package rajeshwari.codes.shootBall;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tankershooter {
	public int Width=100;
	public int Height=120;
	public int x= 0;
	public int y=480;

	public void draw(Graphics2D g2d, GameJPanel panel) throws IOException{
		BufferedImage image =
				ImageIO.read(
						new File("/home/rajeshwari/Pictures/thrower.png"));
		g2d.drawImage(image, 50, panel.getHeight() - 100, 70, 100, panel);
	}
}
