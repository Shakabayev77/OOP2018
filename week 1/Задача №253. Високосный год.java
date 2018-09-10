

    import java.util.Scanner;
    public class Main {
     
        public static void main(String[] args) {
            Scanner S= new Scanner(System.in);
            int v=S.nextInt();
            if((v%4==0 && v%100!=0 || v%400==0)){
                System.out.print("YES");
            }else{
                System.out.print("NO");
            }
        }
    }