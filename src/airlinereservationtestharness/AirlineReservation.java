/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationtestharness;

import java.lang.reflect.Array;

/**
 *
 * @author anmol
 */
public class AirlineReservation {
       //creating new variables
    private String firstName,lastName,classDesigination;
    //creating new variables
    private int flightNumber,seatNumber;
    public int groupNumber;
    private String capitalName;
    //creating constructor
    
    public AirlineReservation(){}
    //creating constructor
    public AirlineReservation(String first_Name,String last_Name,int flight_Number,int seat_Number ){
    //making fields equal to private fields
        firstName=first_Name;
        //making fields equal to private fields
        lastName=last_Name;
        //making fields equal to private fields
        flightNumber=flight_Number;
        //making fields equal to private fields
        seatNumber=seat_Number;
   
    }
    //creating setters
    public void setFirstName(String first_Name){
            this.firstName = first_Name;
            }
    //creating setters
                public void setLASTtName(String Last_Name){
                this.lastName = Last_Name;
                }
                //creating setters
                    public void setFlightNumber(int flight_Number){
                    flightNumber=flight_Number;
                    }
                    //creating setters
                    public void setSeatNumber(int seat_Number){
                    seat_Number=seatNumber;
                    }
                    
                    //creating getters
                     public String getFirstName(){
                        return firstName;
                        }
                           
                    //creating getters
                     public String getLastName(){
                         return lastName;
                            }
                    //creating getters
                     public int getFlightNumber(){
                            return flightNumber;
                                }
                    //creating getters
                    public int getSeatNumber(){
                            return seatNumber;
                                }
                   
                                
                                //creating method
                        public String seatingClass(){
                            
                           //making if else statements     
                        if (seatNumber>1&&seatNumber<10)
                        {
                        groupNumber=1;
                        //making if else statements
                        }
                         else if (seatNumber>11&&seatNumber<20)
                        {
                        groupNumber=2;
                        
                        }//making if else statements
                         else if (seatNumber>21&&seatNumber<30)
                        {
                        groupNumber=3;
                        
                        }//making if else statements
                        else if (seatNumber>31&&seatNumber<40)
                        {
                        groupNumber=4;
                        
                        }//making if else statements
                        groupNumber=1;
                        //making switch
                        switch(groupNumber){
                        case  1:
                            classDesigination  = "First Class";
                            break;
                        case  2:
                           classDesigination = "Second Class";
                            break;
                        case  3:
                           classDesigination = "Third Class";
                            break;
                        case  4:
                            classDesigination= "Fourth Class";
                            break;
                        }
                       
                        return classDesigination;
                        }
                        
                     
                       //making method
                        public void passengersName(){
                            //making for loop
                        for(int i =0;i<this.firstName.length();i++){
                            capitalName=firstName.toUpperCase();
                        System.out.println(capitalName.charAt(i));
                            }
                        }
                        
}
