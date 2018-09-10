import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int cnt=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        boolean found=false;
        for(int i=0;i<n-1;i++){
            if(a[i]*a[i+1]>0){
                found=true;
                break;
            }
        }
        if(found){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}