package day0602;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Weapon w=new Weapon("AKM");
        Weapon ww=new Weapon("M416",80);

        System.out.println("回车发射,输入r'装置子弹");
        while(true){
            String s=new Scanner(System.in).nextLine();
            if (s.equals("r")){
                w.reload();
                ww.reload();
                System.out.println("弹夹已装满");
                continue;
            }
            w.fire();
            ww.fire();
        }
    }



}
