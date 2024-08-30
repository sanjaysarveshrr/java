package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class book {

    public List<taxi> createTaxis(int n) {
        List<taxi> taxis = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            taxi x=new taxi(i);
            taxis.add(x);
        }
        return taxis;
    }

    public List<taxi> freetaxislist(char PickupPoint,int Pickuptime, List<taxi> taxis){

        List<taxi> freetaxislist = new ArrayList<>();
        for(taxi i:taxis){
            System.out.println("Booking");
            if(i.freeTime<Pickuptime && Math.abs((i.currentSpot-'0')-(PickupPoint-'0'))<=Math.abs(i.freeTime-Pickuptime)){
                freetaxislist.add(i);
            }
        }
        return freetaxislist;
    }
    public void booked(taxi booked_taxi,int Pickuptime,char dropPoint ,char pickuppoint){

        int distance=Math.abs((pickuppoint-'0')-(dropPoint-'0'))*15;
        int Earnings=100+(distance-5)*10;
        int droptime=distance*1+Pickuptime;
        booked_taxi.freeTime=droptime;
        booked_taxi.totalEarnings=booked_taxi.totalEarnings+Earnings;
        System.out.println("taxi"+booked_taxi.id+"has been booked"+"current spot :"+booked_taxi.currentSpot);
        booked_taxi.currentSpot=dropPoint;
    }
    public void printdetails(taxi i){
        System.out.println("taxi :"+i.id+" total Earning :"+i.totalEarnings+" Current location :"+i.currentSpot);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        book b=new book();
        int numberoftaxi=4;
        List<taxi> taxis =b.createTaxis(numberoftaxi);

        while(true) {
            System.out.println("TAXI BOOKING \n 1.book \n 2.taxi details");
            int option= sc.nextInt();
            switch (option) {
                case 1:

                    System.out.println("Enter the pickup point");
                    char PickupPoint = sc.next().charAt(0);
                    System.out.println("enter drop point");
                    char DropPoint = sc.next().charAt(0);
                    System.out.println("enter Pickup time");
                    int PickUpTime = sc.nextInt();

                    if (PickupPoint < 'A' || PickupPoint > 'F' || DropPoint < 'A' || DropPoint > 'F') {
                        System.out.println("Enter a valid point");
                        System.exit(0);
                    }
                    List<taxi> freetaxis = b.freetaxislist(PickupPoint, PickUpTime, taxis);
                    if (freetaxis.size() == 0) {
                        System.out.println("no taxi available");
                        System.exit(0);
                    }
                    Collections.sort(freetaxis, (m, n) -> m.totalEarnings - n.totalEarnings);
                    taxi nearesttaxi = freetaxis.get(0);
                    b.booked(nearesttaxi, PickUpTime, DropPoint, PickupPoint);
                    break;

                case 2:
                    for(taxi i:taxis){
                        b.printdetails(i);
                    }
                    break;
            }

        }
    }


}
