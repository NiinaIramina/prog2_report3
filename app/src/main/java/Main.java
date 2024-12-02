import jp.ac.uryukyu.ie.e245728.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;

        // ~A or ~B  =  ~ (A and B)

        while( warrior.isDead() == false && enemy.isDead() == false ){
            //not(warrior.isDead() &&  enemy.isDead() )
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}