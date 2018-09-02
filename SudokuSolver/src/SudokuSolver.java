public class SudokuSolver {

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
    private static final int SIZE = 9;

    public SudokuSolver(int[][] board){
        this.board = new int[SIZE][SIZE];

        for(int i = 0; i < SIZE; i ++){
            for(int j = 0; j < SIZE; j++){
                this.board[i][j] = board[i][j];
            }
        }
    }

    private boolean isInRow(int row, int numberToFind){
        for(int i = 0; i < SIZE; i++){
            if(board[row][i] == numberToFind)
                return true;
        }
        return false;
    }

    private boolean isInColumn(int column, int numberToFind){
        for(int i = 0; i < SIZE; i++){
            if(board[i][column] == numberToFind)
                return true;
        }
        return false;
    }

    private boolean isInBox(int row, int col, int number) {
        int r = row - row % 3;
        int c = col - col % 3;

        for (int i = r; i < r + 3; i++)
            for (int j = c; j < c + 3; j++)
                if (board[i][j] == number)
                    return true;

        return false;
    }

    private boolean isValidNum(int row, int col, int number) {
        return !isInRow(row, number) && !isInColumn(col, number) && !isInBox(row, col, number);
    }

    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY_CELL) {
                    for (int number = 1; number <= SIZE; number++) {
                        if (isValidNum(row, col, number)) {
                            board[row][col] = number;

                            if (solve()) {
                                return true;
                            } else {
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

    public void display(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

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
