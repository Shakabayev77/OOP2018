import java.util.Scanner;
public class Main {
    static void minim(int a,int b,int c,int d){
        System.out.print( Math.min(a,Math.min(b,Math.min(c,d))));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        minim(a, b, c, d);
    }
}