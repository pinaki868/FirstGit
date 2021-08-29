package Programs;

import java.util.Locale;

public class CountAllVowels {

    public static void main(String args[]){
        String str = "aeaoo";
        String vow = "aeiou";

        char[] strChar = str.toLowerCase().toCharArray();
        char[] vowChar = vow.toLowerCase().toCharArray();
        int counter = 0;

        for (Character P1:  vowChar
             ) {
            for (Character P2: strChar
                 ) {
                if (P2.equals(P1)){
                    counter++;
                }
            }
            System.out.println("count of repeated is "+P1+" "+counter);
            counter=0;
        }


    }
}
