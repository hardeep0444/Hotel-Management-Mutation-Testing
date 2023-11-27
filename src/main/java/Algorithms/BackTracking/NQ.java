package Algorithms.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQ {
    private boolean isSafe(char[][] board, int row, int col){
        // Horizontal
        for(int j=0; j<board[0].length; j++){
            if(board[row][j]=='Q') return false;
        }

        //Vertical
        for(int i=0; i<board.length; i++){
            if(board[i][col]=='Q') return false;
        }

        //upperLeft
        for(int r=row, c=col; r>=0 && c>=0; r--, c--){
            if(board[r][c]=='Q') return false;
        }

        //UpperRight
        for(int r=row, c=col; r>=0 && c<board[0].length; r--, c++){
            if(board[r][c]=='Q') return false;
        }

        //ButtomLeft
        for(int r=row, c=col; r<board.length && c>=0; c--, r++){
            if(board[r][c]=='Q') return false;
        }

        //ButtomRight
        for(int r=row, c=col; r<board.length && c<board[0].length; r++,c++){
            if(board[r][c]=='Q') return false;
        }

        return true;
    }

    private void saveBoard(List<List<String>> res, char [][]board){
        List<String> l = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            String str="";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='Q'){
                    str+="Q";
                } else{
                    str +=".";
                }
            }
            l.add(str);
        }
        res.add(l);
    }

    private void solveRecBacktracking(List<List<String>> res, char[][]board, int col){
        //Edge or Base Case
        if(col==board[0].length){
            saveBoard(res, board);
            return;
        }

        //Backtracking + Recursion
        for(int row=0; row<board.length; row++){
            if(isSafe(board, row, col)){
                board[row][col]='Q';
                solveRecBacktracking(res, board, col+1);
                board[row][col]='.';
            }
        }
    }



    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char [][]board = new char[n][n];
        solveRecBacktracking(res, board, 0);

        return res;
    }
}
