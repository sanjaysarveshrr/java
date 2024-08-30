package Practice;

import java.util.Scanner;

public class InverseStar {

    public void right(int n){
        int v=1;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(v++ +" ");
            }
            System.out.println();
        }
    }
    public void left(int n){
        for(int i=0;i<n;i++){

            for(int s=0;s<=i;s++){
                System.out.print("  ");
            }
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void middle(int n){
        for(int i=0;i<n;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void middle2(int n){
        for(int i=1;i<=n;i++){
            for(int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        InverseStar st= new InverseStar();
        Scanner sc=new Scanner(System.in);
        System.out.print("number of rows");
        int n=sc.nextInt();
        System.out.println("1.right \n2.left \n3.middle\n4.middle2");
        int option=sc.nextInt();
        switch (option){
            case 1:
                st.right(n);
                break;
            case 2:
                st.left(n);
                break;
            case 3:
                st.middle(n);
                break;
            case 4:
                st.middle2(n);
                break;
            default:
                break;

        }





    }
}
