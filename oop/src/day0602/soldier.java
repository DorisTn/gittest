package day0602;

import java.util.Random;

public class soldier {
    int id;
    int blood = 100;
    Weapon weapon;

    public void go() {
        System.out.println(id + "号士兵前进");
    }

    public void attack() {
        if (blood == 0) {
            System.out.println("这是" + id + "号士兵的尸体");
            return;
        }
        System.out.println("这个" + id + "号士兵进攻");
        if (weapon != null) {
            if (weapon.bullets == 0) {
                weapon.reload();
            }
            weapon.fire();
            int d = new Random().nextInt(10);
            if (d > blood) {
                d = blood;
            }
            blood-=d;
            System.out.println("血量"+blood);
            if(blood==0){
                System.out.println(id+"士兵阵亡");
            }
        }

    }
}