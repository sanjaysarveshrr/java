package Practice;

import java.util.Scanner;

class lastDigit {
    public static void main(String args[])  {
        Scanner sc= new Scanner(System.in);
       String a=sc.next();
       String b=sc.next();

       lastDigit ob = new lastDigit();
       System.out.println(ob.solution(a, b));
        }



    public int solution(String a, String b) {
        if (b.equals("0")) {
            return 1;
        }
        int lastDigit = a.charAt(a.length() - 1) - '0';

        int effectiveb = 0;

        for (int i = 0; i < b.length(); i++) {
            effectiveb = (effectiveb * 10 + (b.charAt(i) - '0')) % 4;
        }
        if (effectiveb == 0) {
            effectiveb = 4;
        }

        int result = (int) Math.pow(lastDigit, effectiveb);
        return result % 10;

    }
}