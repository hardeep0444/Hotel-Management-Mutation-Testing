package Algorithms.BackTracking;

public class Sodoku {
    private boolean solveRec(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                if(board[i][j] == '.'){
                    for(char ch='1'; ch<='9'; ch++){
                        if(isValid(board, i, j, ch)){
                            board[i][j] = ch;

                            // Backtracking Portion According to Condition
                            if(solveRec(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char ch){
        for(int i=0; i<9; i++){
            if(board[i][col] == ch){ //Checks Entire Column
                return false;
            }
            if(board[row][i] == ch){ // Checks Entire Row
                return false;
            }
            if(board[3*(row/3) + (i/3)][3*(col/3) + (i%3)] == ch){ // Checks 3*3 Matrix
                return false;
            }
        }
        return true;
    }



    public boolean solveSudoku(char[][] board) {
        return solveRec(board);
    }
}
