package rajeshwari.codes.SudokuGame;

import java.util.Scanner;

public class Main {
	public static void main(String[] s) {
		SudokuBoard sudokuBoard = new SudokuBoard();
		sudokuBoard.generate();
		Scanner reader = new Scanner(System.in); 

		while(sudokuBoard.isEmpty()) {
			sudokuBoard.showBoard();
			while(true) {
				System.out.println("Choose any of the numbers from 1 to 9: " );
				int choosenNumber = reader.nextInt();
				System.out.println("Enter the X-coordinate: ");
				int xcord= reader.nextInt();
				System.out.println("Enter the Y-coordinate: ");
				int ycord= reader.nextInt();
				
				if (sudokuBoard.ifInputValid(choosenNumber, xcord,ycord)){
					sudokuBoard.setChoosenScore(xcord, ycord, choosenNumber);
					break;
				}
				System.out.println("Invalid Input");
		    }	
		}
		reader.close();
	}
}
