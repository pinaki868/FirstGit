package Programs;

public class RemoveSpecialandNumbers {

    public static void main(String args[]){
        String  str = "abg123@#$%ASDE";
        char[] c1 = str.toCharArray();
         StringBuffer sbl = new StringBuffer();
        for (Character c2: c1
             ) {
            if (Character.isAlphabetic(c2)){
                sbl.append(c2);
            }
        }
        System.out.println(sbl.toString());

    }
}
