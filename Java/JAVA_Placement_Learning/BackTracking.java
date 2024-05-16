import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    public  List<List<String>> solvedNQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helperFunction(board, allBoards, 0);
        return allBoards;

    }

    public void helperFunction(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        // Place the Queens
        for (int row = 0; row < board.length; row++) {
            // check if the queen is safe
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helperFunction(board, allBoards, col + 1);
                // While back tracking when it was found that the queen was impposible to keep
                // safe
                board[row][col] = '.';
            }

        }

    }

    private void saveBoard(char[][] board, List<List<String>> allBoards) {
       
        String row ="";
        List<String> chessBoard = new ArrayList<>();

        for (int i = 0 ; i< board.length; i++){
            row = "";
            for (int j = 0 ; j<board[0].length; j++){

                if (board[i][j]=='Q'){
                    row = row + 'Q'; 
                }
                else
                row = row + '.';

            }
            chessBoard.add(row);
        }

        allBoards.add(chessBoard);

    }

    private boolean isSafe(int row, int col, char[][] board) {

        // check horizontal line
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // check Vertical line
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal (r-1, c-1)
        int r = row;
        for (int j = col; j >= 0 && r >= 0; j--, r--) {

            if (board[r][j] == 'Q') {
                return false;
            }

        }

        // Check upper right diagonal (r-1, c+1)
        r = row;
        for (int j = col; j < board.length && r >= 0; r--, j++) {

            if (board[r][j] == 'Q') {
                return false;
            }

        }

        // Check lower left diagonal (r+1, c-1)
        r = row;
        for (int j = col; j >= 0 && r < board.length; r++, j--) {

            if (board[r][j] == 'Q') {
                return false;
            }

        }

        // Check lower right diagonal (r+1, c+1)
        r = row;
        for (int j = col; j < board.length && r < board.length; r++, j++) {

            if (board[r][j] == 'Q') {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
            
            for (List<String> boards:  new BackTracking().solvedNQueens(4) ) {

                System.out.println(boards);
                
            }   

    }

}
