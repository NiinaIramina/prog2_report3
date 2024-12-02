package jp.ac.uryukyu.ie.e245728;

public class Warrior extends LivingThing {

    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if(isDead()){
            //int damage = 0;
            //hero.wounded(damage);
            System.out.printf("%sは死亡している！%sに攻撃ができなかった！！\n", this.getName(), opponent.getName());
        }
        else {
            int damage = (int)(getAttack() * 1.5);
            opponent.wounded(damage);//対象にダメージを与える
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", this.getName(), opponent.getName(), damage);
        }
    }

}