package day_7;

public class Student {
    public String name;
    public int age;

    // default constructor
    public Student() {
        name = "john";
        age = 20;
    }

    // parameterised constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
//        System.out.println(this);
    }

    public boolean equals(Object obj) {
        Student student = (Student) obj;

        boolean nameFlag = this.name.equals(student.name);
        boolean ageFlag = (this.age == student.age);

        return nameFlag && ageFlag;
    }

    public int hashCode() {
        return this.name.length() * this.age;
    }



}
