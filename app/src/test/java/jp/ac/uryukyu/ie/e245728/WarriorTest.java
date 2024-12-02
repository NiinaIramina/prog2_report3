package jp.ac.uryukyu.ie.e245728;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;

class WarriorTest {

    @RepeatedTest(3)
    void attackWithWeponSkillTest() {
        int defaultSlimeHp = 10;
        Warrior demoWarrior = new Warrior("デモ勇者", 100, 100);
        Enemy slime = new Enemy("スライムもどき", defaultSlimeHp, 100);
        demoWarrior.attackWithWeponSkill(slime);
        //slime.attack(demoWarrior);今回はスライムが攻撃できるかは関係ない
        assertEquals(demoWarrior.getAttack() * 1.5 , defaultSlimeHp - slime.getHitPoint());
    }
}
