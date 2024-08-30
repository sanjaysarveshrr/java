package Practice;

public class prime2 {
    public static boolean isprime(int n){
        if( n==0 ||(n%2==0) || (n%3==0)){

            return false;
        }
        else if(n==2 || n==3){
            return true;
        }
        for(int i=5;i*i<=n;i+=5){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static int revnum(int n){
        int t,rev=0;
       while (n>0){
           t=n%10;
           rev=(rev*10)+t;
           n=n/10;
       }
       return rev;
    }
    public static void main(String[] args) {
        int n=97;
        if(!isprime(n)){
            System.out.println("not a prime");
        } else {
            int re=revnum(n);
            if(isprime(re)){
                System.out.println("prime");
            }
            else {
                System.out.println("false");
            }
        }

    }
}
