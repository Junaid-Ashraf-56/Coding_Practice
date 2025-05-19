package File_Handling;

import java.io.*;

//Read the contents of log.txt and count how many lines it has.
public class Question6 {
    public static void main(String[] args) {
        String fileName = "log.txt";
        String content = "Hi my name is Junaid";
        String content1 = "Programmer";
        int count = 0;
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
            System.out.println();
            fileWriter.write(content1);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while ((bufferedReader.readLine()) != null) {
                count++;
            }
            System.out.println("Number of lines are "+count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
