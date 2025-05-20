package File_Handling;

import java.io.*;

//Read data.txt line by line and print each line with a line number (e.g., Line 1: content).
public class Question7 {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String content = "Hello World \n";
        String content1 = "Hello  Juanid";

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
        try(FileWriter fileWriter = new FileWriter(fileName)){
            fileWriter.write(content);
            fileWriter.write(content1);
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            int lineNumber = 1;
            String line ;
            while ((line=bufferedReader.readLine())!= null){
                System.out.println("Line "+lineNumber+" "+line);
                lineNumber++;
            }

        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
