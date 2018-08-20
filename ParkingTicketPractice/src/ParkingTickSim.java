/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class ParkingTickSim {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minpark;
        int paid;
        System.out.println("Enter the amount of minutes the car has been pa"
                + "rked.");
        minpark = in.nextInt();
        System.out.println("Enter the minutes paid for.");
        paid = in.nextInt();
        ParkedCar c = new ParkedCar("1998","civic","red",12345, minpark);
        ParkingMeter m = new ParkingMeter(paid);
        PoliceOfficer p = new PoliceOfficer("John Doe", 1234567);
        
        if(p.timeExp(c, m)){
            ParkingTicket t = new ParkingTicket(c, m, p);
            p.getTicket(t);   
        }
        else System.out.println("Car is not over paid time.");

    }
    
}
