import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int cnt=0;
        int b=-100000;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
            if(a[i]>b){
                cnt++;
            }
            b=a[i];
 
        }
        System.out.print(cnt-1);
    }
}