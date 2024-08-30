package Practice;

import java.util.Scanner;

public class PerfectNumber {

        static int isPerfectNumber(long N) {
            if(N<2){
                return 0;
            }
            long sum=1;
            long sqrtn=(long)Math.sqrt(N);

            for(long i=2;i<=sqrtn;i++){
                if(N%i==0){
                    sum=sum+i;
                    if(sum>N){return 0; }
                    if(i!=N/i){
                        sum=sum+N/i;
                        if(sum>N){return 0;}
                    }
                }

            }
            return (sum == N) ? 1 : 0;
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N= sc.nextLong();
        System.out.println(isPerfectNumber(N));
    }
    }


