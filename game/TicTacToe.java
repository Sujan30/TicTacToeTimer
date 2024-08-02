package game;
import java.io.*;
public class TicTacToe{

    String[][] board = new String[3][3];

    public final String ANSI_RED_BACKGROUND = "\\u001B[41m\"";
    public final String ANSI_RESET = "\u001B[0m"; 

    public void resetGame(){
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[i].length; j++)
                board[i][j] = "_";
        displayBoard();
    }

    public void displayBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++)
                System.out.print( board[i][j] + "\t" + ANSI_RESET);
            System.out.println();
        }
    }

    public boolean spaceAvailable(int row, int col){
        if(board[row][col].equals("_"))
            return true;
        return false;
    }
}

