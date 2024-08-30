package Practice;

import java.util.Scanner;

public class Star {

    /*
     *  *
     *  * *
     *  * * *
     *  * * * *
     *
     * */

    public void right(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("decreasing");

        for(int i=0;i<n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     *        *
     *      * *
     *    * * *
     *  * * * *
     *
     * */
    public void left(int n){
        for(int i=1;i<=n;i++){
            for( int j=1;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
*     *
*    * *
*   * * *
*  * * * *
*
* */
    public void middle(int n){
        for(int i=0;i<n;i++){
            int sp=n-i+1;
            for(int s=0;s<sp;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }

    }
    public void square(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Star st= new Star();
         Scanner sc=new Scanner(System.in);
         System.out.print("number of rows");
         int n=sc.nextInt();
         System.out.println("1.right \n2.left \n3.middle \n4.square");
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
                 st.square(n);
             default:
                 break;
         }

    }


}
