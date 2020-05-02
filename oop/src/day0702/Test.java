package day0702;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("1.猫");
        System.out.println("2.狗");
        System.out.print("选择》");
        int c=new Scanner(System.in).nextInt();

        System.out.println("给宠物起个名字");
        String n=new Scanner(System.in).nextLine();

        Cat cat=null;
        Dog dog=null;

        if(c==1){
            cat =new Cat(n);
            f(cat);
        }else{
            dog=new Dog(n);
            f(dog);
        }

    }

    private static void f(Pet pet){
        System.out.println("按回车执行");
        while (true){
            new Scanner(System.in).nextLine();
            int r=new Random().nextInt(9);
            switch (r){
                case 0:pet.feed();break;
                case 1:pet.play();break;
                default:pet.punish();
            }
        }
    }
}
