package File_Handling;

import java.io.File;

//List all files and folders in the current working directory.
public class Question13 {
    public static void main(String[] args) {
        File directory = new File(".");
        String[] files = directory.list();
        if (files!=null) {
            for (String file : files) {
                System.out.println(file);
            }
        }
        else {
            System.out.println("Error ");
        }
    }
}
