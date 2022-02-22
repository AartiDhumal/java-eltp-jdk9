package jdk9assignment;

import java.util.ArrayList;
import java.util.List;


public class Ques2 {

    @SafeVarargs
    private void safeVarargs(List<Integer>... list){
        for(List<Integer> num:list){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {

       Ques2 obj_s=new Ques2();
       List<Integer> list=new ArrayList<>();
       list.add(23);
       list.add(34);
       obj_s.safeVarargs(list);
    }
}
