package jdk9assignment;

import java.util.HashSet;
import java.util.Set;

public class Ques3a {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        for(Integer a:set)
            System.out.print(a+" ");
        System.out.println();
        Set<Integer> set1=Set.of(6,7,8,9,10);
        for(Integer a:set1)
            System.out.print(a+" ");
    }
}
