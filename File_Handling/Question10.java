package File_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Write a Java method that appends a new student's name to students.txt without overwriting the existing content.
public class Question10 {
    public static void append(String name){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student.txt"))){
            bufferedWriter.write(name);
            bufferedWriter.newLine();
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        String fileName = "student.txt";
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
        append("Junaid");
        append("Mohsin");
    }
}
