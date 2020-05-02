package day0601;

import java.util.Random;

public class Test1 {
    public static void main(String[] args){

        士兵 s2=new 士兵();

        s2.id=4321;

        s2.go();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();

    }
}

class 士兵{
    int id;
    int blood=100;
    public void go(){
        System.out.println(id+"号士兵前进");
    }
    public void attack(){
        if(blood==0){
            System.out.println("这是"+id+"号士兵的尸体");
            return;
        }
        System.out.println("这个"+id+"号士兵进攻");
        int d= new Random().nextInt(10);
        if(d>blood){
            d=blood;
        }
        blood=blood-d;
        System.out.println("血量"+blood);
        if(blood==0){
            System.out.println(id+"号士兵阵亡");
        }
    }
}

