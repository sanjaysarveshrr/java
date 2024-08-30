package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CurrencyNotes {
    public void notes(int a){
        int []nots=new int[]{2000,500,200,100,50,20,10,5,2,1};
        ArrayList<Integer> ns=new ArrayList<>();
        for(int i=0;i< nots.length;i++){
            if(a>=nots[i]){
                ns.add(a/nots[i]);
                a=a%nots[i];
            }
            else {
                ns.add(0);
            }
        }
        for(int i=0;i<ns.size();i++) {
            if (ns.get(i) > 0) {
                System.out.println("currency count--> " + nots[i] + " " + ns.get(i));
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CurrencyNotes c=new CurrencyNotes();
        System.out.println("Enter the Amount");
        int amount=sc.nextInt();
        c.notes(amount);
    }
}
