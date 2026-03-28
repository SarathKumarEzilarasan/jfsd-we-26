package day_9.oops.abstraction.interfaceDemo;

public class MultipleDemo {
}


interface Parent1 {
    void add();
}

interface Parent2 {
    void add();
}

class Child implements Parent1, Parent2 {
    public void add() {
        System.out.println("from add");
    }
}
