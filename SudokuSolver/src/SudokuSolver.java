//hopefully all variables are appropriately named

public class SudokuSolver {
    
    //change this to represent the sudoku grid. 0 represents blank, as the numbers in sudoku are from 1 to 9. 
    private static int[][] GRID_TO_SOLVE = {
            {8,0,0,0,0,0,0,0,0},
            {0,0,3,6,0,0,0,0,0},
            {0,7,0,0,9,0,2,0,0},
            {0,5,0,0,0,7,0,0,0},
            {0,0,0,0,4,5,7,0,0},
            {0,0,0,1,0,0,0,3,0},
            {0,0,1,0,0,0,0,6,8},
            {0,0,8,5,0,0,0,1,0},
            {0,9,0,0,0,0,4,0,0},
    };

    private int board[][];
    private static final int EMPTY_CELL = 0;
    //this is width and height of the board
    private static final int SIZE = 9;
    
    //initialize the board
    public SudokuSolver(int[][] board){
        this.board = new int[SIZE][SIZE];

        for(int i = 0; i < SIZE; i ++){
            for(int j = 0; j < SIZE; j++){
                this.board[i][j] = board[i][j];
            }
        }
    }
    
    //checks to see if there is a number in a certain row
    private boolean isInRow(int row, int numberToFind){
        for(int i = 0; i < SIZE; i++){
            if(board[row][i] == numberToFind)
                return true;
        }
        return false;
    }
    
    //checks to see if there is a number in a certain column by looping through each one
    private boolean isInColumn(int column, int numberToFind){
        for(int i = 0; i < SIZE; i++){
            if(board[i][column] == numberToFind)
                return true;
        }
        return false;
    }
    
    //loops through the 3x3 box to see if target number is in it
    private boolean isInBox(int row, int col, int number) {
        int r = row - row % 3;
        int c = col - col % 3;

        for (int i = r; i < r + 3; i++)
            for (int j = c; j < c + 3; j++)
                if (board[i][j] == number)
                    return true;

        return false;
    }
    
    //returns true when the number is not found on the board
    private boolean isValidNum(int row, int col, int number) {
        return !isInRow(row, number) && !isInColumn(col, number) && !isInBox(row, col, number);
    }
    
    
    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                //if the cell we check is empty
                if (board[row][col] == EMPTY_CELL) {
                    //we start at 1 and go to 9
                    for (int number = 1; number <= SIZE; number++) {
                        //if the number is valid (i.e., not in the box
                        if (isValidNum(row, col, number)) {
                            //assign valid number to spot on board
                            board[row][col] = number;
                            //we keep solving if there is a spot for it
                            if (solve()) {
                                return true;
                            } else {
                                //otherwise its empty 
                                board[row][col] = EMPTY_CELL;
                            }
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    //this just prints the board
    public void display(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    //driver method to solve
    public static void main(String[] args) {
        SudokuSolver sudokuSolver = new SudokuSolver(GRID_TO_SOLVE);
        System.out.println("Board to solve");
        sudokuSolver.display();

        if(sudokuSolver.solve()){
            System.out.println("Solved board");
            sudokuSolver.display();
        }
        else{
            System.out.println("Sorry, chief, this ain't it");
        }
    }

}
