package Practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int n= sc.nextInt();
        palindrome pal=new palindrome();
        System.out.println(pal.pali(n));

    }

    public String pali(int n) {
        int on=n;
        String x=String.valueOf(n);
        int l=x.length();
        int sum=0;

        while(n>0){
            int digit=n%10;
            sum=sum*10+digit;
            n=n/10;
        }
        if(on==sum){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}

