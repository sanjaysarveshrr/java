package Practice;

import java.util.Scanner;

/* 1      5
*   2   4
*     3
*  2    4
* 1      5
*
*  */
public class Diagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();

        int left=0;
        int right=s.length()-1;
        boolean flag= false;

        for(int i=0;i<s.length();i++){
            for(int leftspace = 0; leftspace <left;leftspace++){
                System.out.print(" ");
            }
            System.out.print(s.charAt(left));
            for(int middlespace = 1; middlespace <=right-left; middlespace++){
                System.out.print(" ");
            }
            if(left!=right)
                System.out.println(s.charAt(right));
            if(left==right){
                System.out.println();
                flag=true;
            }
           if(!flag){
            left++;
            right--;}

           if(flag){
               left--;
               right++;
           }


        }
    }
}
