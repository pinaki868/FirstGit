package java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String args[]){
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("Demo");
        sj.add("P");
        sj.add("Amity");
        System.out.println(sj);
    }
}
