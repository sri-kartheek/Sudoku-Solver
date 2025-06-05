package Recursion;
import java.util.Scanner;
public class SudokuSolver{
    public static boolean solver(int[][] board,int r,int c){
        if(r==9){
            return true;
        }
        if(board[r][c]!=0){
            if(c==8){
                return solver(board,r+1,0);
            }
            else{
                return solver(board,r,c+1);
            }
        }
        for (int num = 1; num <= 9; num++) {
            if (canFit(board, r, c, num)) {
                board[r][c] = num;
                if (c == 8) {
                    if (solver(board, r + 1, 0)) return true;
                } else {
                    if (solver(board, r, c + 1)) return true;
                }
                board[r][c] = 0;
            }
        }
        return false;
    }
    public static boolean canFit(int[][] board,int r,int c,int n){
        for(int i=0;i<9;i++){
            if(board[r][i]==n || board[i][c]==n) return false;
            int nr=3*(r/3)+i/3;
            int nc=3*(c/3)+i%3;
            if(board[nr][nc]==n) return false;
            
        }
        return true;
    }
    public static void printer(int[][] board){
        for(int i=0;i<9;i++){
            if(i%3==0){
                System.out.println(" ---------------------------");
            }
            for(int j=0;j<9;j++){
                if(j%3==0){
                    System.out.print(" | ");
                }
                if(board[i][j]==0){
                    System.out.print("  ");
                }
                else{
                    System.out.print(board[i][j]+" ");
                }
            }
            System.out.println("|");
        }
        System.out.println(" ---------------------------");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[9][9];

        System.out.println("Enter the 9x9 Sudoku board (use 0 for empty cells):");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int n=sc.nextInt();
                if(n>=1 && n<=9){
                    board[i][j] =n;
                }
                else{
                    System.out.println("Please enter numbers that are between 1-9 only!!!");
                    break;
                }
                
            }
        }
        System.out.println("Your sudoku board:");
        printer(board);
        if(solver(board,0,0)){
            System.out.println("Solution for your sudoku board:");
            printer(board);
        }
        else{
            System.out.println("No valid solution found for your board,something is wrong with the input.");
        }
    }
}
