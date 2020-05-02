package day0602;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("欢迎进入吃鸡战场");
        soldier[] a=new soldier[100];
        for (int i = 0; i < a.length; i++) {
            soldier s=new soldier();
            s.id=i+1;
            s.weapon=new Weapon("AKM"+(i+1));
            a[i]=s;
        }
        System.out.println("按回车执行");
        while(true){
            new Scanner(System.in).nextLine();
            for (int i = 0; i < a.length; i++) {
                if(a[i].blood!=0){
                    a[i].attack();
                }
            }
        }
    }
}
