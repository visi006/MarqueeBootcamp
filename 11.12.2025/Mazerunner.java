public class mazeRunner {
    static int counter;
    //checks whether a move is valid or not
    private static boolean safeMove(int[][] maze, boolean[][] visited, int row, int col){
        return row >= 0 && row < 10 && col >= 0 && col < 10 && maze[row][col] == 1 && !visited[row][col];
    }
    //filling the visited matrix with recursion
    private static void mazeHelper(int[][] maze, boolean[][] visited, int row, int col){
        //base case
        if(row==9 && col==9){
            counter++;
            return;
        }
        visited[row][col] = true;
        //right: {0, row+1}
        if(safeMove(maze, visited, row+1, col)){
            mazeHelper(maze, visited, row+1, col);
        }
        //left: {0, row-1}
        if(safeMove(maze, visited, row-1, col)){
            mazeHelper(maze, visited, row-1, col);
        }
        //down: {col+1, 0}
        if(safeMove(maze, visited, row, col+1)){
            mazeHelper(maze, visited, row, col+1);
        }
        //up: {col-1, 0}
        if(safeMove(maze, visited, row, col-1)){
            mazeHelper(maze, visited, row, col-1);
        }
        visited[row][col] = false;
    }
    public static void mazePath(int[][] maze){
        //no arm length

        //environment setup
        boolean[][] visited = new boolean[10][10];
        counter = 0;
        //call helper
        mazeHelper(maze, visited, 0, 0);
    }
    public static void main(String args[]){
        int [][] maze = { 
        { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
        { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 }, 
        { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, 
        { 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, 
        { 1, 1, 1, 0, 1, 1, 1, 1, 1, 0 }, 
        { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }, 
        { 1, 0, 0, 0, 0, 1, 1, 1, 0, 1 }, 
        { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 }, 
        { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 },
        { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
        };
        mazePath(maze);
        System.out.print(counter);
    }
}
