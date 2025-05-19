package File_Handling;

import java.io.*;

//Read all contents from a file named readme.txt and print them to the console.
public class Question5 {
    public static void main(String[] args) {
        String fileName = "readme.txt";
        String content = "Hi my name is Junaid";
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Already exist " + fileName);
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created " + fileName);
                } else {
                    System.out.println("Error " + fileName);
                }
            } catch (IOException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(content);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
