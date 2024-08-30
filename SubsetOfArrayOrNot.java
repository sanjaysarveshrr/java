package Practice;

import java.util.HashSet;
import java.util.Set;

public class SubsetOfArrayOrNot {
    public static void main(String[] args) {
        int []ar1=new int []{11,3,7,53,89};
        int []ar2=new int[]{3,7,11};
        boolean t=true;
        Set<Integer> hs=new HashSet<>();
        for(int i: ar1){
            hs.add(i);
        }
        for(int i:ar2){
            if(!hs.contains(i)){
                t=false;
                break;
            }
        }
        if (t) {
            System.out.println("subset");
        }
        else {
            System.out.println("not a subset");
        }
    }
}
