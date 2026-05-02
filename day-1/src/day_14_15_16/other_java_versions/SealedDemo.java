package day_14_15_16.other_java_versions;

public class SealedDemo {
    public static void main(String[] args) {
        final double pi = 3.14;
//        pi = 200.001;


    }
}


sealed class Parent permits Child1 {
    public final void print() {

    }
}

non-sealed class Child1 extends Parent {
//    public void print() {
//
//    }
}

//class Child2 extends Parent {
//
//}

