/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrent_systems_ca;

/**
 *
 * @author rae10
 */
abstract class Monster {
    int x;
    int y;
    Player owner;

    Monster(int x, int y, Player owner) {
        this.x = x;
        this.y = y;
        this.owner = owner;
    }

    abstract char getSymbol();

    boolean canMove(int newX, int newY) {
        int dx = Math.abs(newX - this.x);
        int dy = Math.abs(newY - this.y);
        return dx == 0 || dy == 0 || dx <= 2 && dy <= 2 && dx == dy;
    }
}
