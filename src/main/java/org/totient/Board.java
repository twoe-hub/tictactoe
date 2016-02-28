package org.totient;

import static org.totient.Denotation.EMPTY;

public class Board {

  private Denotation[][] grid = null;
  private int elapsedTurns = -1;

  public Board(int n) {
    grid = new Denotation[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        grid[i][j] = EMPTY;
      }
    }
  }

  public Denotation cell(int i, int j) {
    return grid[i][j];
  }

  public int size() {
    return grid.length;
  }

  boolean isCellEmpty(int i, int j) {
    return grid[i][j] == EMPTY;
  }

  void updateCell(int[] pick, Denotation denot) {
    grid[pick[0]][pick[1]] = denot;
  }

  int getElapsedTurns() {
    return elapsedTurns;
  }
  
  @Override
  public String toString() {
    return String.format("\n%s | %s | %s \n\n"
            + "%s | %s | %s \n\n"
            + "%s | %s | %s \n\n",
            grid[0][0], grid[0][1], grid[0][2],
            grid[1][0], grid[1][1], grid[1][2],
            grid[2][0], grid[2][1], grid[2][2]);
  }

}