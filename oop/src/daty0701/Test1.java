package daty0701;

public class Test1 {
    public static void main(String[] args) {
        Person p=new Person();
        Student s=new Student();
        Employee e=new Employee();

        s.name="宋";
        s.gender="女";
        s.age=33;
        s.school="六大学";

        e.name="sxy";
        e.gender="女";
        e.age=22;
        e.salary=9000;

        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());


        Student ss=new Student("a","s",0,"c");
        System.out.println(ss.toString());
    }
}
