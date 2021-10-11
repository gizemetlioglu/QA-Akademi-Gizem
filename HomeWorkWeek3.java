package week3;

public class HomeWorkWeek3 {

}

class Person {
    public String name;
    public String surName;
    public int age;
    public String gender;

    public Person(String name, String surName, int age, String gender){
        this.name=name;
        this.surName=surName;
        this.age=age;
        this.gender=gender;
    }
}

class Student extends Person{
    public int year;
    public int creditCount=0;

    public Student(String name, String surName, int age, String gender, int year) {
        super(name, surName, age, gender);
        this.year=year;
    }
}

class Teacher extends Person{
    public int courseCount=0;

    public Teacher(String name, String surName, int age, String gender) {
        super(name, surName, age, gender);
    }
}

class Course {
    String name;
    int credit;
    int studentCount=0;

    public Course(String name, int credit){
        this.name=name;
        this.credit=credit;
    }
}
