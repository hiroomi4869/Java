package mooc.week4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

interface School{
    List<String> subject=new ArrayList<>();
    void addSub(String temp);
}

class MySchool implements School{

    @Override
    public void addSub(String temp) {
        subject.add(temp);
    }
}

class Subject{

    int student_Number;
    List<String> Student_Number=new ArrayList<>();
    List<String> Student_Name=new ArrayList<>();
    String Subject_Name;
    String Teacher_Name;

    public Subject(String subject_Name,String teacher_Name) {
        Subject_Name = subject_Name;
        Teacher_Name =teacher_Name;
    }

    void addStudent(String name, String number){
        Student_Name.add(name);
        Student_Number.add(number);
        student_Number++;
    }

}

interface People{
    void login(String passWorld);
}


class Teacher implements People {
    String myClass;
    String passWorld ;
    @Override
    public void login (String passWorld) {
        this.passWorld=passWorld;
    }
}


class Student implements People {
    String myClass;
    String passWorld ;
    String num;

    public void Student(String num,String passWorld){
        this.num=num;
        this.passWorld=passWorld;
    }

    @Override
    public void login(String passWorld) {
        this.passWorld=passWorld;
    }
}

