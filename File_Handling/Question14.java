package File_Handling;

import java.io.File;
import java.io.IOException;

//Create a new directory called back up, and then create a file backup/data.txt inside it.
public class Question14 {
    public static void main(String[] args) {
        File backupDir = new File("backup");
        if (!backupDir.exists()){
            boolean dirCreated = backupDir.mkdir();
            if (dirCreated){
                System.out.println("Directory backup created");
            }
            else {
                System.out.println("Error occur");
                return;
            }
        }
        File file = new File(backupDir,"data.txt");
        try{
           if (file.createNewFile()){
               System.out.println("File created");
           }
           else {
               System.out.println("Error ");
           }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
