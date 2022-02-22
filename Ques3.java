package jdk9assignment;

import java.util.ArrayList;
import java.util.List;

public class Ques3 {
    public static void main(String[] args) {
        List<Character> list=new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        for(Character a:list)
            System.out.print(a+" ");
        System.out.println();
        List<Character> list1=List.of('f','g','h','i','j');
        for(Character a:list1)
            System.out.print(a+" ");

    }
}
