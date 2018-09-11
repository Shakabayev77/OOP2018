import java.util.Scanner;

public class NumberInWords {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String res = "";
        for (int i = n.length()-1; i > -1; i--){
            String num = "";
            if(n.charAt(i) == '1')
                num = "one";
            if(n.charAt(i) == '2')
                num = "two";
            if(n.charAt(i) == '3')
                num = "three";
            if(n.charAt(i) == '4')
                num = "four";
            if(n.charAt(i) == '5')
                num = "five";
            if(n.charAt(i) == '6')
                num = "six";
            if(n.charAt(i) == '7')
                num = "seven";
            if(n.charAt(i) == '8')
                num = "eight";
            if(n.charAt(i) == '9')
                num = "nine";

            if((0-i)%3==1 && n.charAt(i) != 0) {
                if(n.charAt(i-1) != '1') {
                    res = num + res;
                    break;
                }
                else if(n.charAt(i-1) )
            }
            }
        }
    }
}
