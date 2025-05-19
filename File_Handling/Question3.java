package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Write a Java program to write the string "Hello, Junaid!" into a file named hello.txt.
public class Question3 {
    public static void main(String[] args) {
        String fileName = "hello.txt";
        String content ="Hello! Junaid";
        File file = new File(fileName);
        if (file.exists()){
            System.out.println("File already exist "+fileName);
        }
        else {
            try{
                if (file.createNewFile()){
                    System.out.println("File created "+fileName);
                }
                else {
                    System.out.println("Error occurred");
                }
            }catch (IOException e){
                System.out.println("Error "+e.getMessage());
            }
        }
        try(FileWriter fileWriter = new FileWriter(fileName)){
            fileWriter.write(content);
            System.out.println("Written Successfully");
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
