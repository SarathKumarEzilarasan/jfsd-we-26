package day_12.collections.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

//        Set<String> set = new HashSet<>(); // hashing
//        Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>(); // (N*logN)
        set.add("john");
        set.add("peter");
        set.add("adam");
        set.add("zack");

        System.out.println(set);
    }

    public static void setMethods() {
        //        List<Integer> list = Arrays.asList(10000, 2000, 3000, 4000, 10000);
//        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(10000);
        set.add(2000);
        set.add(3000);
        set.add(4000);
        set.add(10000);

        set.remove(10000);
        set.contains(10000);
        set.size();


        for (int i : set) {
            System.out.println(i);
        }

        List<Integer> list = new ArrayList<>(set);

        System.out.println(list.get(0));

    }
}

// [john,peter,adam,zack] -> o(n)


// j*10(3) + o*10(2) + h*10(1) + n*10(0) ---> 1010
// [adam, peter, zack, john] -> o(1)