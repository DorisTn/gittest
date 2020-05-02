package day0602;

import java.util.Random;

public class Weapon {
    String name;
    int bullets;

    public Weapon(String name){
        this.name=name;
        this.bullets=100;
    }
    public  Weapon(String name,int bullets){
        this.name=name;
        this.bullets=bullets;
    }

    public  void fire(){
        System.out.println("开火");
        int r=3+new Random().nextInt(10);
        if(r>bullets){
            r=bullets;
        }
        this.bullets-=r;
        for (int i = 0; i < r; i++) {
            System.out.println("突");
        }
        System.out.println("~~~~~~~~");
        System.out.println("剩余子弹"+bullets);
    }

    public  void  reload(){
        bullets=100;
    }
}
