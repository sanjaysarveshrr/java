package Practice;
/*
      *          i=0-j=4-k
     * *         i=1-j=3-k=0,3
    *   *        i=2-j=2-k=0,4
   *     *       i=3-j=1-k=0,5
  *       *      i=4-j=0-k=0,7
   *     *
    *   *
     * *
      *

 * */
public class DiamondOutline {
    public static void main(String[] args) {
        int n=5;
        // upper half
        for(int i=1;i<=n;i++){
            //outside space
            for(int op=i;op<=n-1;op++){
                System.out.print(" ");
            }
            for(int k=1;k<n*2;k++){
                if(k==1||k==(i*2)-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //lower half
        for(int i=n-1;i>0;i--){
            //outsidespace
            for(int op=i;op<=n-1;op++){
                System.out.print(" ");
            }
            for(int k=1;k<n*2;k++){
                if(k==1||k==(i*2)-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        }






}
