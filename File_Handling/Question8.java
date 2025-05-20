package File_Handling;

import java.io.*;

//Read names.txt line by line and print only lines that contain the letter "a".
public class Question8 {
    public static void main(String[] args) {
        String fileName = "names.txt";
        String content = "Junaid \n";
        String content1 = "Asad \n";
        String content2 = "Mohsin ";

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
            fileWriter.write(content2);
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line=bufferedReader.readLine())!=null){
                if (line.toLowerCase().contains("a")){
                    System.out.println(line);
                }
            }
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }

    }
}
