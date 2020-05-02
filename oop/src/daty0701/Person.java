package daty0701;

public class Person {
    String name;
    String gender;
    int age;
    public  Person(){
        this("无名","不明",19);
    }
    public Person(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    @Override
    public String toString() {
        return name+","+gender+","+age;
    }
}
