package Programs;

public class TestPassByReference {

    int x;
    public TestPassByReference(){
     x= 0;
    }
    public TestPassByReference(int i){
        x = i;
    }

    public static void main(String args[]){
        TestPassByReference test = new TestPassByReference(12);
        change(test);
        System.out.println("hii "+test.x);

    }

    public static void change(TestPassByReference test){
       // test = new TestPassByReference();
        test.x = 10;
        System.out.println("New Object "+test.x);
    }

}
