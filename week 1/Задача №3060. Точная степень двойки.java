    import java.util.Scanner;
    public class Main {
     
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            int k=0;
            for(int i=0;i<n;i++){
                double x=Math.pow(2,i);
                if((int)(x)==n){
                    System.out.print("YES");
                    k=k+1;
                    break;
                }
            }
            if(k==0){
                System.out.print("NO");
            }
        }
    }
     
