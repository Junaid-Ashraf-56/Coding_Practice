package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question18 {
    public static void main(String[] args) {
    String fileName = "products.csv";
        File file = new File(fileName);
    if (file.exists()){
        System.out.println("Already exist");
    }
    else {
        try {
            if (file.createNewFile()){
                System.out.println("File created ");
            }
            else {
                System.out.println("Error");
            }
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String line;
        System.out.printf("%-20s %-10s%n", "Product", "Price");
        System.out.println("----------------------------");

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String productName = data[0];
            double price = Double.parseDouble(data[1]);

            if (price > 1000) {
                System.out.printf("%-20s %-10.2f%n", productName, price);
            }
        }
    } catch (IOException | NumberFormatException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }
}
}
