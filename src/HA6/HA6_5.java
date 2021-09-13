package HA6;

import java.util.LinkedList;
import java.util.List;

public class HA6_5 {
    public static void main(String[] args) {
        java.util.Map<String,Integer> m = new java.util.HashMap<String,Integer>();
        String s = "Hallo";
        int x = 10;
        m.put(s,x);
        m.put(s + s, x + x);
        m.put(s, m.get(s+s));
        int y = m.get(s);
        x = m.size();
        System.out.println(y);
    }

//    public static void main(String[] args) {
//        List<Integer> list = new java.util.LinkedList<Integer>();
//        int a = 10;
//        Integer b = 20;
//        String c = "10";
//        list.add(a);
//        list.add(b);
//        list.add(c);
//        list.add(a + b);
//        list.add(b + c);
//        a = list.remove(0);
//        b = list.remove(0);
//        c = list.remove(0);
//    }



}
