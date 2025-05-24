package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter Words");
        String line = abc.nextLine();
        int length = line.length();
            String newLine = "";
            for (int i = 0;i<length;i++){
                char ch = line.charAt(i);
                if (ch>='a'&&ch<='z'){
                    newLine+=(char)(ch-32);
                }
                else {
                    newLine+=ch;
                }
            }
        System.out.println(newLine);
    }
}
