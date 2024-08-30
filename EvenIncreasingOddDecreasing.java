package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvenIncreasingOddDecreasing {
    public static void main(String[] args) {
        int [] ar=new int []{11,31,4,3,9};
        List<Integer> odd= new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            if(i%2==0){
                odd.add(ar[i]);
            }
            else {
                even.add(ar[i]);
            }
        }
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);
         int []output=new int[ar.length];
         int evenindex=0;
         int oddindex=0;
         for(int i=0;i<output.length;i++){
             if(i%2==0){
                 output[i]=odd.get(oddindex);
                 oddindex++;
             }
             else{
                 output[i]=even.get(evenindex);
                 evenindex++;
             }

             }
         System.out.println(Arrays.toString(output));

         }

    }

