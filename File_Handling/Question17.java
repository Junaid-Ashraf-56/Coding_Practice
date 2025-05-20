package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Read a file named students.csv where each line is like: Name, Age,Grade and print it in a table.
public class Question17 {
    public static void main(String[] args) {
        String fileName = "students.csv";
        File file = new File(fileName);
        if (file.exists()){
            System.out.println("Already exist");
        }
        else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created");
                } else {
                    System.out.println("File not found");
                }
            }catch (IOException e){
                e.getMessage();
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.printf("%-15s %-5s %-10s%n", "Name", "Age", "Grade");
            System.out.println("--------------------------------");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.printf("%-15s %-5s %-10s%n", data[0], data[1], data[2]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    }
