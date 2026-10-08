import java.util.Scanner;

public class apointment {

    static String [][] myseat = new String[5][4];
    static String [][] pessengerName = new String[5][4];
    static String [][] prssengerNic = new String[5][4];
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[]args){
        
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                myseat[i][j] = "O";
            }
        }
        while(true){

            System.out.println("===============================");
            System.out.println("AIRLINE RESEVERTION SYSTEME");
            System.out.println("===============================");

            System.out.println("1 . Display Seat Arrangement");
            System.out.println("2 . Book a seat");
            System.out.println("3 . Cancel Seat Booking");
            System.out.println("4 . Search Reservation");
            System.out.println("5 . Display All booking");
            System.out.println("6 . Calculate total income");
            System.out.println("7 . Exits");

            System.out.print("Enter your Choice : ");
            int number = input.nextInt();

            switch(number){
                case 1:
                    arrangement();
                    break;
                case 2:
                    bookSeat();
                    break;
                case 3:
                    cancelBooking();
                    break;
                case 4:
                    searchReservation();
                    break;
                case 5:
                    displayBookings();
                    break;
                case 6:
                    calculateIncome();
                    break;
                case 7:
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void arrangement(){
        System.out.println("==================================");
        System.out.println("     AIRLINE SEAT ARANGEMENT");
        System.out.println("==================================");
        System.out.println("          A   B   C   D");
        for (int i = 0; i < 5; i++){
            System.out.print("Row " + (i+1) + " : ");
            
            for (int j = 0; j < 4; j++){
                System.out.print("  " + myseat[i][j] + " ");


                }
                System.out.println();
            }
            System.out.println("==================================");
            System.out.println("O = Available seat");
            System.out.println("X = Reserved Seat");
            System.out.println("==================================");
        }
    
    
    public static void bookSeat(){
        boolean flag = true;
        while (flag){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.next();

        System.out.print("Enter your NIC : ");
        String nic = input.next();
        
        System.out.println ("Seat selection ");

        System.out.print("Enter seat row (1-5) : ");
        int row = input.nextInt();

        System.out.print("Enter seat column (A-D) : ");
        char column = input.next().charAt(0);

        if (row < 1 || row <= 5 && ( column == 'A' || column == 'B' || column == 'C' || column == 'D' ) ) {
            switch (column){
                case 'A':{
                    if (myseat[row-1][0] == "O"){
                        myseat[row-1][0] = "X";
                        System.out.println("**********************************");
                        System.out.println("ARILINE TICKET RECEIPT");
                        System.out.println("**********************************");
                        System.out.println("Passenger Name : " + name);
                        pessengerName[row-1][0] = name;
                        System.out.println("NIC number : "+nic);
                        System.out.println("Seat number : "+row+ " - "+column);
                        System.out.println("\nBooking Status : CONFIRMED");
                        System.out.println("**********************************");
                        System.out.println("Thank you for choosing your Airline");
                        System.out.println("***********************************");
                        prssengerNic[row-1][0] = nic;
                        flag = false;
                    }else{
                        System.out.println("\nSorry ! This seat is a already booked. ");
                        System.out.println("Please select another seat.\n");
                        
                    }
                    break;
                }
                case 'B':{
                    if (myseat[row-1][1] == "O"){
                        myseat[row-1][1] = "X";
                        System.out.println("**********************************");
                        System.out.println("ARILINE TICKET RECEIPT");
                        System.out.println("**********************************");
                        System.out.println("Passenger Name : " + name);  
                        pessengerName[row-1][1] = name;  
                        System.out.println("NIC number : "+nic);
                        System.out.println("Seat number : "+row+ " - "+column);
                        System.out.println("\nBooking Status : CONFIRMED");
                        System.out.println("**********************************");
                        System.out.println("Thank you for choosing your Airline");
                        System.out.println("***********************************");
                        prssengerNic[row-1][1] = nic;
                        flag = false;
                        
                    }else{
                        System.out.println("\nSorry ! This seat is a already booked. ");
                        System.out.println("Please select another seat.\n");
                        
                    }
                    break;}
                    case 'C':{
                        if (myseat[row-1][2] == "O"){
                            myseat[row-1][2] = "X";
                            System.out.println("**********************************");
                            System.out.println("ARILINE TICKET RECEIPT");
                            System.out.println("**********************************");
                            System.out.println("Passenger Name : " + name);
                            pessengerName[row-1][2] = name;
                            System.out.println("NIC number : "+nic);
                            System.out.println("Seat number : "+row+ " - "+column);
                            System.out.println("\nBooking Status : CONFIRMED");
                            System.out.println("**********************************");
                            System.out.println("Thank you for choosing your Airline");
                            System.out.println("***********************************");
                            prssengerNic[row-1][2] = nic;
                            flag = false;
                        }else{
                            System.out.println("\nSorry ! This seat is a already booked. ");
                            System.out.println("Please select another seat.\n");
                            

                        }
                        break;
                    }
                    case 'D':{

                        if (myseat[row-1][3] == "O"){
                            myseat[row-1][3] = "X";
                            System.out.println("**********************************");
                            System.out.println("ARILINE TICKET RECEIPT");
                            System.out.println("**********************************");
                            System.out.println("Passenger Name : " + name);
                            pessengerName[row-1][3] = name;
                            System.out.println("NIC number : "+nic);
                            System.out.println("Seat number : "+row+ " - "+column);
                            System.out.println("\nBooking Status : CONFIRMED\n");
                            System.out.println("**********************************");
                            System.out.println("Thank you for choosing your Airline");
                            System.out.println("***********************************");
                            prssengerNic[row-1][3] = nic;
                            flag = false;
                        }else{
                            System.out.println("\nSorry ! This seat is a already booked. ");
                            System.out.println("Please select another seat\n.");
                            
                        }
                        break;
                    }
                    
            }
           
        } else {
                System.out.println ("\nInvalid seat number!");
                System.out.println("Please select row 1-5 and column A-D\n");
                
            }

    }
 }
 public static void cancelBooking(){
    System.out.println("===================================");
    System.out.println("      CANCEL RESERVATION ");
    System.out.println("===================================");


    System.out.print("Enter Passenger NIC Number : ");
    String NIC = input.next();

    boolean found = false;
    for (int i = 0; i < prssengerNic.length ; i++){
        for (int j = 0; j < prssengerNic[i].length; j++){
    
            if (NIC.equals(prssengerNic[i][j])){

                System.out.println("passenger name  :" + pessengerName[i][j]);
                System.out.println("Seat            : "+" Row  "+(i+1)+" Column "+(j+1));
                System.out.println("--------------------------------------\n");
                System.out.println("Cancellation Successful");
                System.out.println("Seat is now available");
                System.out.println("======================================");
                prssengerNic[i][j] = null;
                pessengerName[i][j] = null;
                myseat[i][j] = "O";

                found = true;
                break;
                
            }
           
           
            } if (found){
                break;
            }

        
        }  if (!found) {
            System.out.println("--------------------------------------\n");
            System.out.println("No reservation found!");
            System.out.println("Please check the NIC number.");
            System.out.println("--------------------------------------\n");

                }
        
    }
    public static void searchReservation(){
        System.out.println("==========================================");
        System.out.println("      RESERVATION DETAILS");
        System.out.println("==========================================");
        System.out.print("Enatre passenge NIC number : ");
        String NIC = input.next();

        boolean found = false;
        for (int i = 0; i < prssengerNic.length ; i++){
            for (int j = 0; j < prssengerNic[i].length; j++){

                if (NIC.equals(prssengerNic[i][j])){
                    System.out.println("=========================================");
                    System.out.println("       RESERVATION DETAILS");
                    System.out.println("=========================================");
                    System.out.println("Passenger Name  :" + pessengerName[i][j]);
                    System.out.println("NIC number      : " + prssengerNic[i][j]);
                    System.out.println("Seat            : "+" Row  "+(i+1)+" Column "+(j+1));
                    System.out.println("Ticket price  :  Rs. 5000");
                    System.out.println("Status          : confirmed");
                    System.out.println("==========================================\n");
                    found = true;
                    break;
                }
            }
            if (found){
                break;
            }
        }
        if (!found) {
            System.out.println("--------------------------------------\n");
            System.out.println("No reservation found!");
            System.out.println("Please check the NIC number.");
            System.out.println("--------------------------------------\n");
        }
    }

    public static void displayBookings(){
        System.out.println("==========================================");
        System.out.println("          ALL BOOKING DETAILS");
        System.out.println("==========================================");
        
        
        int count = 0;
        for (int i = 0 ; i < myseat.length ; i++){
            for (int j = 0 ; j < myseat[i].length ; j++){
                if (myseat[i][j] == "X"){

                    count++;
                }

            }
        }
        if (count == 0 ){
            System.out.println("No booking Available");
            System.out.println("==========================================");
        }else{
            System.out.println("passenger name\tNIC number\tSeat number");
            for (int i = 0 ; i < myseat.length ; i++){
                for (int j = 0 ; j < myseat[i].length ; j++){
                    if (myseat[i][j] == "X"){
                        System.out.println(pessengerName[i][j] + "\t\t" + prssengerNic[i][j] + "\t\tRow " + (i+1)+" - "+"column "+(j+1));

                    }
                }

            }
            System.out.println("------------------------------------------");
            System.out.println("Total Booking : "+count);
            System.out.println("==========================================");

        }
        

    }
    public static void calculateIncome() {
        System.out.println("===========================================");
        System.out.println("AIRLINE SALES REPORT");
        System.out.println("===========================================");
        int count = 0;
        for (int i = 0; i < myseat.length; i++) {
            for (int j = 0; j < myseat[i].length; j++) {
                if (myseat[i][j] == "X") {
                    count++;
                }
            } 
            
        }
        if (count == 0 ){
            
            System.out.println("No booking Available !");
            System.out.println("Total Incaome : Rs .0");
            System.out.println("===========================================");
        }else{
            System.out.println("Ticket Price : Rs. 5000");
            System.out.println("Total Tickets sold : "+count);
            System.out.println("-------------------------------------------");
            System.out.println("Total Income : Rs. "+(count*5000));
            System.out.println("===========================================");

        }
    }
  
}
