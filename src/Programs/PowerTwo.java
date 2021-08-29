package Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PowerTwo {
   int p;
    public static void main(String args[]){
        PowerTwo pow = new PowerTwo();
        pow.m2();
        int n = 100;
        List list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.pow(2, i));
        }

        Iterator itr = list.iterator();
        while (itr.hasNext()){

            System.out.println("iterator value is "+itr.next());
        }
            //int powers[] = (int)Math.pow(2,i);
            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j));
                if (n<(int)list.get(j)){
                   // System.out.println("the power is "+j);
                    break;
                }

            }
        }

        public void m2(){
           // System.out.println("returns");
        }


        public static void m3(){
            PowerTwo pow = new PowerTwo();
            pow.m2();
            int q = pow.p;
        }


    }



