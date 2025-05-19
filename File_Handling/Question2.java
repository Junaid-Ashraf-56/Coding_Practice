package File_Handling;
//Write a program to create a file named report.txt only if it doesn’t already exist. Print appropriate messages.
import java.io.File;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {
        String fileName = "report.txt";
        File file = new File(fileName);
        if (file.exists()){
            System.out.println("File already exist "+fileName);
        }
        else{
            try {
                if (file.createNewFile()){
                    System.out.println("File created "+fileName);
                }
                else {
                    System.out.println("Error occurred "+fileName);
                }
            }catch (IOException e){
                System.out.println("Error "+e.getMessage());
            }
        }
    }
}
