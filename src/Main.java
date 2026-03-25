// ctrl alt L: can chinh
// ctrl X: cut, xoa dong
// ctrl /: comment

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // substring, split
        String fullten = "le dinh duong";
        System.out.println("substring(beginIndex) " + fullten.substring(6));
        System.out.println("substring(from,to) " + fullten.substring(8, 13));

        String[] _fullname = fullten.split(" ");
        System.out.println("split(regex): " + _fullname[1]);

        System.out.printf("printf %s ", fullten.substring(8, 13));
        // for
        for (int i = 1; i <= 3; i++) {
            int a = tangso(i);
            System.out.println("i = " + a);
        }

        // for-each voi mang
        int[] arr = {1, 2, 3};
        for (int num : arr) {
            System.out.print(num);
        }
        System.out.println("");
        // for-each voi list
        List<String> list = Arrays.asList("A", "B", "C");
        for (String item : list) {
            System.out.print(item);
        }

    }

    public static int tangso(int tuoi) {
        return tuoi + 1;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}