package jp.ac.uryukyu.ie.e245728;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{

    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        super.wounded(damage);
        if(isDead()){
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}