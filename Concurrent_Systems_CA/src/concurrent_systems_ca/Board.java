/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrent_systems_ca;

/**
 *
 * @author rae10
 */
import java.io.PrintStream;

class Board {
    Monster[][] grid = new Monster[10][10];

    Board() {
    }

    boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < 10 && y >= 0 && y < 10;
    }

    boolean isOccupied(int x, int y) {
        return this.grid[x][y] != null;
    }

    void placeMonster(Monster monster) {
        this.grid[monster.x][monster.y] = monster;
    }

    void removeMonster(int x, int y) {
        this.grid[x][y] = null;
    }

    void moveMonster(Monster monster, int newX, int newY) {
        this.removeMonster(monster.x, monster.y);
        monster.x = newX;
        monster.y = newY;
        this.placeMonster(monster);
    }

    void printBoard() {
        System.out.println("   0 1 2 3 4 5 6 7 8 9");
        System.out.println("  ---------------------");

        for(int i = 0; i < 10; ++i) {
            System.out.print("" + i + "|");

            for(int j = 0; j < 10; ++j) {
                if (this.grid[i][j] == null) {
                    System.out.print(" .");
                } else {
                    PrintStream var10000 = System.out;
                    char var10001 = this.grid[i][j].getSymbol();
                    var10000.print(" " + var10001);
                }
            }

            System.out.println(" |");
        }

        System.out.println("  ---------------------");
    }
}
