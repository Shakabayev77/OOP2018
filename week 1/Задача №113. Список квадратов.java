import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            double x=Math.sqrt(i*1.0);
            if((int)(x)*(int)(x)==i){
                System.out.println(i);
            }
        }
    }
}