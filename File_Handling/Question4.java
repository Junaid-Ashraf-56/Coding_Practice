package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Accept a string from the user and write it into a file called user_input.txt.
public class Question4 {
    public static void main(String[] args) {
        String fileName = "user_input.txt";
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter input");
        String content = abc.nextLine();

        File file = new File(fileName);
        if (file.exists()){
            System.out.println("Already exist "+fileName);
        }
        else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created " + fileName);
                } else {
                    System.out.println("Error occurred " + fileName);
                }
            } catch (IOException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        try(FileWriter fileWriter =  new FileWriter(fileName)){
            fileWriter.write(content);
            System.out.println("Successfully written "+fileName);
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
