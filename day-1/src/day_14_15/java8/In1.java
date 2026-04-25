package day_14_15.java8;

public interface In1 {
    void add();

    default void sub() {
        System.out.println("sub from in1");
        div();
    }

    static void mul() {
        System.out.println("mul from in1");
    }

    private void div() {
        System.out.println("div from in1");
    }
}

interface In2 {
    void add();

    default void sub() {
        System.out.println("sub from in2");
    }
}


class Child1 implements In1 {

    @Override
    public void add() {

    }

    public void sub() {
        System.out.println("from child 2");
    }
}

class Child2 implements In1, In2 {

    @Override
    public void add() {

    }

    @Override
    public void sub() {
//        In1.super.sub();
    }


}


class Class {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.sub();

        In1.mul();
    }
}