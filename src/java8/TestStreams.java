package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams {
    public static void main(String args[]){
        String[] str = {"A","B","Pinaki","CN"};
        Integer number[] = {1,4,2,3,7,6};
        List<Integer> list = Arrays.asList(number);
        //int number2 = list.stream().filter(x->x>4).reduce(0,(ans,i)->ans+i);
        list.stream().map(d->d*2).filter(e->e>2).reduce(0,(ans,i)->ans+i);
        //System.out.println(number2);
        String[] array1 = {"ab","","c","jk"};
        List<String> list1 = new ArrayList<>();
        list1 = Arrays.asList(array1);
        list1.stream().filter(e->!e.equals("")).forEach(r-> System.out.println(r));
        System.out.println(list1.stream().filter(e->e.length()==2).collect(Collectors.toList()));
    }
}