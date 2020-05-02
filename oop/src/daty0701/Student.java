package daty0701;

public class Student extends Person {
    String school;

    public  Student(){

    }
    public Student(String name,String gender,int age,String school){
        super(name, gender, age);
        this.school=school;
    }

    @Override
    public String toString() {
        return super.toString()+","+school;
    }
}
