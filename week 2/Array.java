package qq;

import java.util.Scanner;

public class Array {
    String res="";
    public String Repeat(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-48<=9 && s.charAt(i)-48>=0) {
                for (int j=0;j<2;j++){
                    res=res+s.charAt(i)+",";
                }
            }else {
                res = res + s.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Array obj=new Array();
        String s=sc.next();
        System.out.println(obj.Repeat(s));

    }
}
