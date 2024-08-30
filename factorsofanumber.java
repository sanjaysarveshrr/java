package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class factorsofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> s=new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                s.add(i);
                if (n / i != i) {
                    s.add(n / i);
                }
            }
        }
        Collections.sort(s);
        System.out.println(s);
    }
}
