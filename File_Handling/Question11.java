package File_Handling;

import java.io.File;
import java.io.IOException;

//Delete a file named temp.txt and print whether it was successful.
public class Question11 {
    public static void main(String[] args) {
        String fileName = "temp.txt";
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
        if (file.exists()){
            file.delete();
            System.out.println("File deleted ");
        }
    }
}
