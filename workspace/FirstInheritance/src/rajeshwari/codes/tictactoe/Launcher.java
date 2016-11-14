package rajeshwari.codes.tictactoe;

public class Launcher {

	public static void main() {
		Board board = new Board();
		Player p1 = new HumanPlayer();
		Player p2 = new BotPlayer();

		board.showBoard();
		Player playerToPlay = p1;
		while (!board.isComplete()) {
			Input input = playerToPlay.askUser(board);
			if (board.updateBoard(input, playerToPlay)) {
				board.showBoard();
				if (board.ifUserWins(playerToPlay)) {
					System.out.println("Player Won");
					return;
				}
				// playerToPlay = (playerToPlay == p1? p2 : p1);
				if (playerToPlay == p1) {
					playerToPlay = p2;
				} else {
					playerToPlay = p1;
				}
			} else {
				continue;
			}
		}
		System.out.println("There is a Tie!");
		/*board.updateBoard(0, 0, p1);
		board.updateBoard(0, 1, p2);
		board.updateBoard(0, 2, p1);
		board.updateBoard(2, 1, p2);
		board.showBoard();*/
	}
}
