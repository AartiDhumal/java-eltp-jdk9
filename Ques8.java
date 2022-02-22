package jdk9assignment;
abstract class concat<T>{
    abstract T join2(T str,T str1);
}
public class Ques8 {
    public static void main(String[] args) {
        concat<String> obj_c=new concat<>() {
            @Override
            String join2(String str, String str1) {
                return str.concat(str1);
            }
        };
        System.out.println(obj_c.join2("Anshuman ","Kumar"));

    }
}
