package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter number in Upper case");
        String line = abc.nextLine();
        int length = line.length();
        String newLine = "";
        for (int i = 0; i < length; i++) {
            char ch = line.charAt(i);
            if (ch>='A'&& ch<='Z'){
                newLine+=(char)(ch+32);
            }else {
                newLine+=ch;
            }
        }
        System.out.println(newLine);
    }
}
