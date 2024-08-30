package Practice;

import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray {
    public void find(int []a){
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:a){
            map.put(n,map.getOrDefault(n,0)+1);
            }

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
    public static void main(String[] args) {
        int []ar=new int[]{1,1,2,3,3,4,4,5,5,6};
        SingleElementInSortedArray ma=new SingleElementInSortedArray();
        ma.find(ar);
    }
}
