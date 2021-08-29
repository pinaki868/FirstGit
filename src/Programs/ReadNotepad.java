package Programs;

import java.io.*;

public class ReadNotepad extends Exception {

    public ReadNotepad() {

    }

    public ReadNotepad(String e) {
        super(e);

    }

    public static void main(String args[]) throws IOException {

        String notepad = "C:\\Users\\91750\\Documents\\Padhai\\attachments\\accenture.txt";
        System.out.println("file is present" + (new File(notepad).exists()));
        BufferedReader bfr = null;

        bfr = new BufferedReader(new InputStreamReader(new FileInputStream(new File(notepad))));


        int paragraph = 1;
        String line;
        while ((line = bfr.readLine()) != null) {
            if (line.equals("")) {
                paragraph++;
            }
            else {
               // String arr[] = new String[l];

            }

        }
        System.out.println("value of paragraph is " + paragraph);

        String str2 = null;
        System.out.println(""+str2.length());
    }
}
