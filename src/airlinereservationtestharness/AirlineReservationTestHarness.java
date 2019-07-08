/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationtestharness;

import java.util.Scanner;

/**
 *
 * @author anmol
 */
public class AirlineReservationTestHarness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instantiate object
        
        AirlineReservation test = new AirlineReservation("Anmol","Sharma",10,20);
        System.out.println("seat number is"+test.getSeatNumber());
        test.passengersName();
        //taking values
        Scanner cn = new Scanner(System.in);
        //taking values
        System.out.print("first name is");
        //taking values
           String abc = cn.nextLine();
           //taking values
           System.out.print("last name is");
           //taking values
          String vc= cn.nextLine();
          //taking values
          System.out.print("Flight Number is");
          //taking values
          int jh= cn.nextInt();
          //taking values
           System.out.print("Seat Number is ");
           //taking values
          int kj= cn.nextInt();
           //instantiate object
          AirlineReservation n = new AirlineReservation(abc,vc,jh,kj);
          //taking values
        System.out.print("seat number is"+n.getSeatNumber());
        //taking values
        n.passengersName();
        System.out.print(n.seatingClass());
          
    }
    
}
