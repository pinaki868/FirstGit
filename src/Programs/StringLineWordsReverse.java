package Programs;

import java.util.Locale;

public class StringLineWordsReverse {

    public static void main(String args[]) {
        String line = "India wonderful country pinaki";
        String arr[] = line.split(" ");
        int length = arr.length;
        StringBuilder sbl = new StringBuilder();
        StringBuilder sbl2 = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i % 2 ==0){
                sbl.append(arr[i]);
            }
            else {
                String p2 = arr[i];
                for (int j = 0; j < p2.length(); j++) {
                String str1 = p2.substring(0, 1).toUpperCase();
                String str2 = p2.substring(1, p2.length() - 1);
                String str3 = p2.substring(p2.length() - 1, p2.length()).toUpperCase();
                String p = str1 + str2 + str3;
                sbl.append(" ");
                sbl.append(p);
                sbl.append(" ");
                break;
            }

            }
        }
        System.out.println(sbl.toString());
    }

}
