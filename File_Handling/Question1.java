package File_Handling;

//Create a Java program that checks whether data.txt exists in the current directory. If not, create the file.
import java.io.File;
import java.io.IOException;

public class Question1 {
    public static void main(String[] args) {
        String fileName = "data.txt";
        File file = new File(fileName);
        if (file.exists()){
            System.out.println("File already exist "+fileName);
        }
        else {
            try {
                if (file.createNewFile()){
                    System.out.println("New file created "+fileName);
                }
                else {
                    System.out.println("Failed to create "+fileName);
                }
            } catch (IOException e) {
                System.out.println("An Error occurred"+e.getMessage());
            }
        }
    }
}
