package internship;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		char[][] board = {{' ', ' ', ' '}, 
						  {' ', ' ', ' '}, 
						  {' ', ' ', ' '}};
		printBoard(board);
		
		playerTurn(board);
		
		Random rand = new Random();
		int computerMove;
		while(true) {
		computerMove = rand.nextInt(9) + 1;
		if(isValidMove(board, computerMove)) {
			break;
			}
		}
		placeMove(board, Integer.toString(computerMove), '0');
		
		
		printBoard(board);
	}
	
	private static boolean isValidMove(char[][] board, int position) {
		switch(position) {
//		case 1:
//		if(board[0][0] == ' '){
//		return true;
//		} else {
//			return false;
//		}
		case 1: 
			return (board[0][0] == ' ');
		
		case 2: 
			return (board[0][1] == ' ');
		
		case 3: 
			return (board[0][2] == ' ');
		
		case 4: 
			return (board[1][0] == ' ');
		
		case 5: 
			return (board[1][1] == ' ');
		
		case 6: 
			return (board[1][2] == ' ');
		
		case 7: 
			return (board[2][0] == ' ');
		
		case 8: 
			return (board[2][1] == ' ');
		
		case 9: 
			return (board[2][2] == ' ');
		
		default:
			return false;
		}
	}

	private static void playerTurn(char[][] board) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Where would you like to play? (1-9)");
		String userInput = scanner.nextLine();
		
		placeMove(board, userInput, 'X');
		scanner.close();
	}

	private static void placeMove(char[][] board, String position, char symbol) {
		switch(position) {
		case "1": board[0][0] = symbol;
		break;
		
		case "2": board[0][1] = symbol;
		break;
		
		case "3": board[0][2] = symbol;
		break;
		
		case "4": board[1][0] = symbol;
		break;
		
		case "5": board[1][1] = symbol;
		break;
		
		case "6": board[1][2] = symbol;
		break;
		
		case "7": board[2][0] = symbol;
		break;
		
		case "8": board[2][1] = symbol;
		break;
		
		case "9": board[2][2] = symbol;
		break;
		
		default:System.out.println(":(");
		}
	}

	private static void printBoard(char[][] board) {
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
	}

}
