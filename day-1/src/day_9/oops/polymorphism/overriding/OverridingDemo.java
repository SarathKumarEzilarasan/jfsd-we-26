package day_9.oops.polymorphism.overriding;

public class OverridingDemo {
    public static void main(String[] args) {
//        Child child = new Child();
//        child.add();

//        Parent parent;
//        Child child;
//
//        int i = 0;
//
//        // tight coupling
//        if (i == 0) {
//            parent = new Parent();
//            parent.add();
//            // fund transfer
//            // taking loan
//            // payment of loan
//        } else {
//            child = new Child();
//            child.add();
//            // fund transfer
//            // taking loan
//            // payment of loan
//        }

        // loosely coupled
//        Parent parent;
//        int i = 0;
//
//        if (i == 0) {
//            parent = new Parent();
//        } else {
//            parent = new Child();
//        }
//
//        parent.add();
//        // fund transfer
//        // taking loan
//        // payment of loan

        Child child = new Child();
        child.add();
        child.sub();

        Parent parent = new Child();
        parent.add();
//        parent.sub();
    }
}

class Parent {
    public void add() {
        System.out.println("from parent");
    }
}

class Child extends Parent {
    public void add() {
        System.out.println("from child");
    }

    public void sub() {
        System.out.println("sub method");
    }
}
