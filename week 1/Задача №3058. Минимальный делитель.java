import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double sqrt_n=Math.sqrt(n*1.0);
        int i=2,min_den=1;
        while(i<=sqrt_n){
            if(n%i==0){
                min_den=i;
                break;
            }
            i++;
        }
        if(min_den==1){
            System.out.print(n);
        }else{
            System.out.print(min_den);
        }
    }
}