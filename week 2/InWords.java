package qq;

import java.util.Scanner;

public class Array {
    public static String inWords(int a){
        switch (a){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
            default:
                return "";
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            System.out.println(inWords(n) + " " + "");
    }
}
