import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=0;
        for(int i=0;i<n;i++){
            double x=Math.pow(2,i);
            if((int)(x)>=n){
                k=i;
                break;
            }
        }
        System.out.print(k);
    }
}