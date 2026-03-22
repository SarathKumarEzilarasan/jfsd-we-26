package day_8.oops.inheritance;

public class Demo {
    public static void main(String[] args) {
        Tata tata = new Tata("punch", 1000000, "car");
        tata.breaks();
        System.out.println(tata.model);
        System.out.println(tata.type);


//        Bmw bmw = new Bmw();
//        bmw.breaks();
//
//
//        TataSedan tataSedan = new TataSedan();
//        tataSedan.breaks();
//        tataSedan.feature();
    }
}
