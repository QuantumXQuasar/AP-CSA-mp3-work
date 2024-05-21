public class Grid{
  private int[][] grid;

  public Grid(int[][] grid){
    this.grid = grid;
  }
  
  public Location getNextLoc(int row, int col){
    int curLoc = grid[row][col];
    Location below = new Location(row-1, col);
    Location right = new Location(row, col-1);
    if(grid[below.getRow()][below.getCol()] > grid[right.getRow()][right.getCol()]){
      return right;
    }
    return below;
  }

  public int sumPath(int row, int col){
    int sum = 0;
    int curRow = row;
    int curCol = col;
    while(curRow != grid.length - 1 || curRow != grid[0].length - 1){
      sum += grid[curRow][curCol];
      getNextLoc(curRow, curCol);
    }
    return sum;
  }
    
}
