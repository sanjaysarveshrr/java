package Practice;

import java.util.Arrays;

public class PushZeros {
    public void toleft(int []ar){
        int n=ar.length;
        int c=n-1;
        for(int i=n-1;i>=0;i--){
            if(ar[i]!=0){
                ar[c]=ar[i];
                c--;
            }
        }
        while(c>=0){
            ar[c]=0;
            c--;
        }
        System.out.println("Left to right "+Arrays.toString(ar));
    }
    public void toright(int ar[]){
        int n=ar.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(ar[i]!=0){
                ar[c]=ar[i];
                c++;
            }
        }
        while (c<n){
            ar[c]=0;
            c++;
        }
        System.out.println("Right to left : "+Arrays.toString(ar));
    }
    public static void main(String[] args) {
        int [] ar1=new int[]{3,0,2,0,4,0};
        PushZeros pz=new PushZeros();
        pz.toleft(ar1);
        pz.toright(ar1);

    }
}
