package jp.ac.uryukyu.ie.e245728;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 名
     * @param maximumHP HP
     * @param attack 攻撃力
     */

    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public String getName(){
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public boolean isDead(){
        return dead;
    }

    
    /**
     * 対象へ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if(dead){
            //int damage = 0;
            //hero.wounded(damage);
            System.out.printf("%sは死亡している！%sに攻撃ができなかった！！\n", name, opponent.getName());
        }
        else {
            int damage = (int)(Math.random() * attack);
            opponent.wounded(damage);//対象にダメージを与える
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        System.out.printf("ダメージ: %d, 残りHP: %d\n", damage, hitPoint);
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}
