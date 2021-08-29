package Programs;

import java.util.*;

public class DuplicateElementsArrayNumber {

    public static void main(String args[]){
        int p[] = {4,0,1,2,4,0};
        Set set = new LinkedHashSet();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < p.length-1; i++) {
            for (int j = i+1; j < p.length; j++) {
                if (p[i]==p[j]){
                    System.out.println(p[j]);
                }
            }
        }
    }
}