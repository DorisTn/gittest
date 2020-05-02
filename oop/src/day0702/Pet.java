package day0702;

public class Pet {
    String name;
    int full;
    int happy;

    public Pet(String name) {
        this(name, 80, 80);
    }

    public Pet(String name, int full, int happy) {
        name = name;
        full = full;
        happy = happy;
    }

    public void feed() {
        System.out.println("屎");
    }

    public void play() {
        System.out.println("吃屎");
    }

    public void punish() {
        System.out.println("明一帆吃屎");
    }

    public String cry() {
return "此处有哭声";
    }
}