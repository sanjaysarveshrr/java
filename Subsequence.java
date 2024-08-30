package Practice;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        String a="anja";
        String b="sanjaysarvesh";
        int ia=0;
        List<Character> x=new ArrayList<>();
        for(int i=0;i<b.length();i++){
            if(ia<a.length() && b.charAt(i)==a.charAt(ia)){
                x.add(b.charAt(i));
                ia++;
            }
        }
        StringBuilder collectedString = new StringBuilder();
        for (char c : x) {
            collectedString.append(c);
        }

        if(x.size()==a.length() && a.equals(collectedString.toString())){
            System.out.println("same");
        }
        else {
            System.out.println("diff");
        }

    }
}
