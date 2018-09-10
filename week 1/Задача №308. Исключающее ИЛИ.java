    import java.util.Map;
    import java.util.Scanner;
    public class Main {
     
        static int f(int a,int b){
            if(a==b)
                return 0;
            else return 1;
        }
        public static void main(String[] args) {
    // write your code here
            int a,b;
            Scanner cs = new Scanner(System.in);
            a=cs.nextInt();
            b=cs.nextInt();
     
            System.out.print(f(a,b));
     
        }
    }
