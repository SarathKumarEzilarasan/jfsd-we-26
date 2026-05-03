package day_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        Student john = new Student("john", 20, "ece");
        Student peter = new Student("peter", 21, "cs");

        System.out.println(john.compareTo(peter));

        AgeComparator ageComparator = new AgeComparator();
        System.out.println(ageComparator.compare(john, peter));

        List<Student> list = Arrays.asList(john, peter);
        list.sort(new DepartmentComparator());

        System.out.println(list);
    }
}


class Student implements Comparable<Student> {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.length() - o.name.length();
    }
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}

class DepartmentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


// Map -> sort it based on the values