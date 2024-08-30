package Practice;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        for(int i=0;i<n;i++){

            int sp= (n-i)+1;
            for(int m=1;m<=sp;m++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
