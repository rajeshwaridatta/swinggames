package rajeshwari.codes.tictactoe;

import java.io.IOException;

public class HumanPlayer implements Player {

	@Override
	public char getSymbol() {
		return '1';
	}

	@Override
	public Input askUser(Board board) {
		int x = getInputNumber("Enter x coordinate: ");
		int y = getInputNumber("Enter y coordinate: ");
		Input input = new Input(x, y);
		return input;
	}

	private int getInputNumber(String message) {
		System.out.println(message);
		int val = -1;
		try {
			val = ((int) System.in.read()) - ((int)'0');
			char c = (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;
	}
}
