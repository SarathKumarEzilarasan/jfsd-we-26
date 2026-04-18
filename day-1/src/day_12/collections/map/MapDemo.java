package day_12.collections.map;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        String str = "wwwaacccdw"; // w3a2c3d1w1
//                    0123456789

        char prev = str.charAt(0);
        int counter = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (prev == curr) {
                counter++;
            } else {
                System.out.print(prev + "" + counter);
                prev = curr;
                counter = 1;
            }
        }

        System.out.print(prev + "" + counter);

    }

//    public static void main(String[] args) {
//        String str = "wwwaacccd"; // w3a2c3d1
//
//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (map.containsKey(ch)) {
//                int oldValue = map.get(ch);
//                map.put(ch, oldValue + 1);
//            } else {
//                map.put(ch, 1);
//            }
//        }
//
//        System.out.println(map);
//    }


//    public static void main(String[] args) {
////        Map<String, Integer> map = new HashMap<>();
////        Map<String, Integer> map = new LinkedHashMap<>();
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("john", 11);
//        map.put("peter", 2);
//        map.put("adam", 3);
//        map.put("zack", 4);
//        map.put("john", 4);
//
//        System.out.println(map);
//    }

    public static void mapMethods() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "john");
        map.put(2, "peter");
        map.put(3, "adam");
        map.put(4, "peter");
        map.put(1, "anand");

//        System.out.println(map.get(1));
//        System.out.println(map.remove(1));
//        System.out.println(map.containsKey(1));
//        System.out.println(map.containsValue("anand"));

        Set<Integer> keys = map.keySet();
//        for (int key : keys) {
//            System.out.print(key + " ");
//        }

        Collection<String> values = map.values();
//        for (String value : values) {
//            System.out.print(value + " ");
//        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.print(entry.getKey() + " ");
//            System.out.println(entry.getValue());
//        }

        System.out.println(map.size());


    }
}
