package jp.ac.uryukyu.ie.e245728;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {

    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        super.wounded(damage);
        if(isDead()){
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }

}