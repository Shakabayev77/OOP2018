    import java.util.Scanner;
    public class Main {
     
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            for(int i=0;i<n;i++){
                double x=Math.pow(2,i);
                if(x<=n){
                    System.out.print((int)(x)+" ");
                }
            }
        }
    }
     
