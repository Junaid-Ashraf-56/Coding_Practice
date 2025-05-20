package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

//Read a file named important.txt and handle FileNotFoundException and IOException properly.
public class Question15 {
    public static void main(String[] args) {
        String fileName = "important.txt";
        File file = new File(fileName);
        if (file.exists()){
            System.out.println("Already exist");
        }
        else {
            try {
                if (file.createNewFile()){
                    System.out.println("Created");
                }
                else {
                    System.out.println("Error ");
                }

            }catch (IOException e){
                System.out.println("Error "+e.getMessage());
            }
        }
    }
}
