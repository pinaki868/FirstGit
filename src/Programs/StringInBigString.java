package Programs;

public class StringInBigString {

    public static void main(String args[]){
     String str = "abcyabctyuabc";
     String str2 = "abc";
     int n = str2.length();
     int counter = 0;
        System.out.println(str.substring(0,2));
        for (int i = 0; i < str.length()-n+1; i++) {
            if (str2.equals(str.substring(i,i+n))){
                counter++;
            }
        }
        System.out.println("counter value is "+counter);

    }
}
