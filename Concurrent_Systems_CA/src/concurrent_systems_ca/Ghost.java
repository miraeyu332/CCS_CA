/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrent_systems_ca;

/**
 *
 * @author rae10
 */
class Ghost extends Monster {
    Ghost(int x, int y, Player owner) {
        super(x, y, owner);
    }

    char getSymbol() {
        return 'G';
    }
}
