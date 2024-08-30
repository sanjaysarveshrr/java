package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingElementsofanArraybyFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of test case");
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("lenth of "+ (i+1) +" array");
            int n=sc.nextInt();
            int []ar=new int[n];
            System.out.println("enter the elements");
            for(int j=0;j<n;j++)
            {
                ar[j]=sc.nextInt();
            }
            Map<Integer,Integer>sort=new HashMap<>();
            for(int nums:ar){
                sort.put(nums,sort.getOrDefault(nums,0)+1);
            }
        }
    }
}
