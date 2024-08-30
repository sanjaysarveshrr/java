package Practice;
import java.util.List;
import java.util.*;

public class PrintAllDivisorOfANumber {

        public static List< Integer > printDivisors(int n) {
            // Write your code here
            List<Integer> divisor=new ArrayList<>();
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    divisor.add(i);
                    if(i!=n/i){
                        divisor.add(n/i);
                    }
                }
            }
            Collections.sort(divisor);
            return divisor;
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            List<Integer> divisors =printDivisors(n);
            for(int x: divisors){
                System.out.println(x);
            }
        }



    }

