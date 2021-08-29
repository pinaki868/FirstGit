package java8;

public class RefactorFunctional {

    public static void main(String args[]){
        Functional functional = (city,temp,test) ->
            System.out.println("city name is "+city+" and its temp is "+temp[0]+" "+test.split(":")[1]);

        String[] str = {"t1","t2"};
        functional.method1("Nainital",str,"Pinaki:123");
    }

}
