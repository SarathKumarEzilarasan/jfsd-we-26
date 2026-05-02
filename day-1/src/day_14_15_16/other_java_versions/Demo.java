package day_14_15_16.other_java_versions;

public class Demo {
    int i = 100;
//    var j = 100;

    public static void main(String[] args) {
//        List.of(1, 2, 3, 4, 5);
//        Set.of(1, 2, 3, 4, 5);
//        Map.of(1, "v", 2, "v1");

//        System.out.println('\u265A'); // unicode


//        String s = """
//                hello world
//                       from java
//                """;
//
//        System.out.println(s);

//        int day = 4;
//
//        String s = switch (day) {
//            case 1 -> "mon";
//            case 2 -> "mon";
//            case 3 -> "mon";
//            case 4 -> "thurs";
//            default -> "invalid";
//        };
//
//        System.out.println(s);

//        Employee employee1 = new Employee("john", 20, 20000);
//        Employee employee2 = new Employee("john", 20, 20000);
//
//        System.out.println(employee1.equals(employee2));
//        System.out.println(employee1.hashCode());
//        System.out.println(employee2.hashCode());
//        System.out.println(employee1.getAge());


        _Employee _employee1 = new _Employee("john", 20, 20000);
        _Employee _employee2 = new _Employee("john", 20, 20000);

        System.out.println(_employee1.equals(_employee2));
        System.out.println(_employee1.hashCode());
        System.out.println(_employee2.hashCode());
        System.out.println(_employee1.age());
        System.out.println(_employee1);

    }


    public static void var() {
        var i = 100;
        var l = 100l;


        int z;
        z = 100;

//        var k;
//        k = 100;
    }
}
