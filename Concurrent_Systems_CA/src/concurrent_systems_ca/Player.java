/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrent_systems_ca;

/**
 *
 * @author rae10
 */
import java.util.ArrayList;
import java.util.List;

class Player {
    String name;
    List<Monster> monsters;
    int eliminatedMonsters;
    int side;

    Player(String name, int side) {
        this.name = name;
        this.monsters = new ArrayList();
        this.eliminatedMonsters = 0;
        this.side = side;
    }

    boolean isEliminated() {
        return this.eliminatedMonsters >= 11;
    }
}
