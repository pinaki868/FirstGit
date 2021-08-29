package Inheritence;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisedArrayList {

    void collectionMethod(){
        List<Integer> syncArray = Collections.synchronizedList(new ArrayList<>(Arrays.asList(1,2,3,4,5)));
        System.out.println(syncArray);

    }

    void copyOnWriteArrayList(){

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(copyOnWriteArrayList);

    }

}
