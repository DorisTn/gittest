package day0901;

public abstract class Shape {
    volatile int age6;
    public abstract void draw();
    public void clear(){
        System.out.println("/n/n/n/n/nnnnnn");
        System.out.println("图形被擦除");
        System.out.println("...............");
    }
}
