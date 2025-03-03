import java.util.Scanner;

public class AirlineReservation {
    public static void main(String[] args) {

        boolean[] seats = new boolean[10];
        
        for (int i = 0; i < 10; i = i + 1) {
            seats[i] = false;
        }
        
        Scanner input = new Scanner(System.in);
        
        int seatsTaken = 0;
        
        while (seatsTaken < 10) {

            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            
            int choice = input.nextInt();
            
            if (choice == 1) {
                int seatNumber = -1;
                for (int i = 0; i < 5; i = i + 1) {
                    if (seats[i] == false) { 
                        seats[i] = true;     
                        seatNumber = i + 1;  
                        seatsTaken = seatsTaken + 1; 
                        break;
                    }
                }
                
                if (seatNumber != -1) {
                    System.out.println("Boarding Pass: Seat " + seatNumber + " in First Class");
                } 

                else {
                    System.out.println("First Class is full. Is Economy okay? (1 for yes, 2 for no)");
                    int switchChoice = input.nextInt();
                    
                    if (switchChoice == 1) {

                        for (int i = 5; i < 10; i = i + 1) {
                            if (seats[i] == false) {
                                seats[i] = true;
                                seatNumber = i + 1;
                                seatsTaken = seatsTaken + 1;
                                break;
                            }
                        }
                        System.out.println("Boarding Pass: Seat " + seatNumber + " in Economy");
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } 

            else if (choice == 2) {
                int seatNumber = -1;
                for (int i = 5; i < 10; i = i + 1) {
                    if (seats[i] == false) {
                        seats[i] = true;
                        seatNumber = i + 1;
                        seatsTaken = seatsTaken + 1;
                        break;
                    }
                }
                
                if (seatNumber != -1) {
                    System.out.println("Boarding Pass: Seat " + seatNumber + " in Economy");
                } 
                else {
                    System.out.println("Economy is full. Is First Class okay? (1 for yes, 2 for no)");
                    int switchChoice = input.nextInt();
                    
                    if (switchChoice == 1) {
                        for (int i = 0; i < 5; i = i + 1) {
                            if (seats[i] == false) {
                                seats[i] = true;
                                seatNumber = i + 1;
                                seatsTaken = seatsTaken + 1;
                                break;
                            }
                        }
                        System.out.println("Boarding Pass: Seat " + seatNumber + " in First Class");
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } 

            else {
                System.out.println("Please type only 1 or 2.");
            }
        }
        
        System.out.println("Plane is full. No more bookings.");
    }
}
