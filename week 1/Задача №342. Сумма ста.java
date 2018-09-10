    import java.util.Scanner;
    public class Main {
     
        public static void main(String[] args) {
            Scanner S=new Scanner(System.in);
            long cnt=0;
            for(int i=0;i<100;i++){
                int a=S.nextInt();
                cnt=cnt+a;
            }
            System.out.print(cnt);
        }
    }
     
