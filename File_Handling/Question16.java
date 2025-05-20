package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Implement reading from a file using try-with-resources and explain why it’s better than manual closing.
public class Question16 {
    public static void main(String[] args) {
        String fileName = "important.txt";
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Already exist");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("Created");
                } else {
                    System.out.println("Error ");
                }

            } catch (IOException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
       try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
           String line;
           if ((line=bufferedReader.readLine())!=null){
               System.out.println("Line "+line);
           }
       }catch (IOException e){
           System.out.println("Error "+e.getMessage());
       }
       //By using try catch on try it open the file start reading it and at catch the file closed automatically by it is as same as using database connection
    }
}