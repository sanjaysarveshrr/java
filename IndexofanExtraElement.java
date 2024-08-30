package Practice;

import java.util.HashSet;
import java.util.Set;
import static java.lang.Math.max;

public class IndexofanExtraElement {
    public static void main(String[] args) {
        int []ar1=new int[]{2,3,4,6,7,9,10};
        int []ar2=new int[]{2,3,4,6,7,8};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        for(int i:ar1){
            set1.add(i);
        }
        for(int i:ar2){
            set2.add(i);
        }

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of distinct elements: " + union);

        // Find common elements (intersection)
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of elements: " + intersection);

        // Find distinct elements in arr1 only
        Set<Integer> distinctInArr1 = new HashSet<>(set1);
        distinctInArr1.removeAll(set2);
        System.out.println("Elements only in arr1: " + distinctInArr1);

        // Find distinct elements in arr2 only
        Set<Integer> distinctInArr2 = new HashSet<>(set2);
        distinctInArr2.removeAll(set1);
        System.out.println("Elements only in arr2: " + distinctInArr2);

    }
}
