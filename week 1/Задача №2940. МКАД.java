import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int v=S.nextInt();
        int t=S.nextInt();
        int s=v*t;
        if(s<0){
            if((109+(s%109))==109)
                System.out.println(0);
            else
                System.out.print(109+(s%109));
        }else{
            System.out.print(s%109);
        }
    }
}