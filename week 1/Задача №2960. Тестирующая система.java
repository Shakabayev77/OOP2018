    import java.util.Scanner;
    public class Main {
     
        public static void main(String[] args) {
            Scanner S= new Scanner(System.in);
            int v=S.nextInt();
            int t=S.nextInt();
            if((v!=1 && t!=1)||(v==1 && t==1)){
                System.out.print("YES");
            }else{
                System.out.print("NO");
            }
        }
    }
     
