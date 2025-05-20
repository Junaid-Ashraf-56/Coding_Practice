package File_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Append "Logged in at <timestamp>" to a file log.txt.
public class Question9 {
    public static void main(String[] args) {
        String fileName = "log.txt";
        String login = "Logged in "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
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
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,true))){
            bufferedWriter.write(login);
            bufferedWriter.newLine();
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
