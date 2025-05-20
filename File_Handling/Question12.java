package File_Handling;

import java.io.File;
import java.io.IOException;

//Rename a file from old.txt to new.txt and confirm the change.
public class Question12 {
    public static void main(String[] args) {
        String fileName = "old.txt";
        File file = new File(fileName);
        if (file.exists()){
            System.out.println("File exist "+fileName);
        }
        else {
            try {
                if (file.createNewFile()){
                    System.out.println("New file created "+fileName);
                }else {
                    System.out.println("Error while creating file");
                }
            }catch (IOException e){
                System.out.println("Error "+e.getMessage());
            }
        }
         String newFileName = "new.txt";
        if (file.exists()){
            file.renameTo(new File(newFileName));
        }
        else {
            System.out.println("File not exist");
        }
    }
}
