/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author rae10
 */
class Ghost extends Monster {
    Ghost(int x, int y, Player owner) {
        super(x, y, owner);
    }

    @Override
    char getSymbol() {
        return 'G';
    }

//    @Override
//    boolean canMove(int newX, int newY) {
//        return (x == newX || y == newY || Math.abs(x - newX) == Math.abs(y - newY)) && Math.abs(x - newX) <= 2 && Math.abs(y - newY) <= 2;
//    }
}
