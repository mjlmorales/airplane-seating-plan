import java.util.Scanner;
public class AirplaneSeatingPlan {
      //this is a comment
   
      // multidimentional array for airplane seating plan
      static String [][] airplane = new String [13][6];
   
   
      // declare initialization for airplane seating plan
      public static void Airseat() {
         for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 6; j++) {
               if (j == 2) {
                  airplane [i][j] = "* ";
               }
               else {
                  airplane [i][j] = "*";
               }
            }    
         }  
      }
   
    
    
       // for displaying first class seat only
       public static void Firstclass() {
         System.out.println();
         System.out.println();
         System.out.println("\t=======================");
         System.out.println("\t F I R S T   C L A S S");
         System.out.println("\t=======================");
         System.out.println();
         System.out.println("\t\t\tA B C  D E F");
         for (int i = 0; i < 2; i++) {
            System.out.print("\nRow " + (i+1) + "\t\t");
         for (int j = 0; j < 6; j++) 
            System.out.print(airplane[i][j] + " ");
            System.out.print(" ");
          }
      }
   
       // for displaying business class seat only
       public static void Businessclass() {
         System.out.println();
         System.out.println();
         System.out.println("\t============================");
         System.out.println("\t B U S I N E S S  C L A S S");
         System.out.println("\t============================");
         System.out.println();

         System.out.println("\t\t\tA B C  D E F");
         for (int i = 0; i < 5; i++) {
            System.out.print("\nRow " + (i+3) + "\t\t");
         for (int j = 0; j < 6; j++) 
            System.out.print(airplane[i][j] + " ");
            System.out.print(" ");
          }
      }
     
       // for displaying economy class seat only
       public static void Economyclass() {
         System.out.println();
         System.out.println();
         System.out.println("\t===========================");
         System.out.println("\t E C O N O M Y   C L A S S");
         System.out.println("\t===========================");
         System.out.println();

         System.out.println("\t\t\tA B C  D E F");
            for (int i = 0; i < 6; i++) {
              if (i < 2){
              System.out.print("\nRow " + (i+8) + "\t\t");
              }
              else {
              System.out.print("\nRow " + (i+8) + "\t");
              }
            for (int j = 0; j < 6; j++) 
              System.out.print(airplane[i][j] + " ");
              System.out.print(" ");
            }
         }


   
         // display array airplane
         public static void Displayseat() {
            System.out.println();
            System.out.println();
            System.out.println("\t-----------------------------");
            System.out.println("\t\t\t A I R P L A N E \n"
                               + "\t\t A R R A N G E M E N T");
            System.out.println("\t-----------------------------");
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t\tA B C  D E F");
            System.out.println();
            for (int i = 0; i < 13; i++) {
               if(i < 9){
                  System.out.print("\t" + "Row " + (i+1) + "\t\t");
               }else{
                  System.out.print("\t" + "Row " + (i+1) + "\t");
               }
               for (int j = 0; j < 6; j++) {
                  System.out.print(airplane[i][j] + " ");
               }
               System.out.println();
            }
               System.out.println();
         }
   
   
   
         // main method for airplane seat plan
         public static void main (String [] args) {
   
   
         // declacre scanner library
         Scanner key = new Scanner (System.in);
       
       
         // variable for class seat
         int cseat;
         char book;
      
         // call Airseat() method
         Airseat();
         
         
         System.out.println("|======================================|",
+ "\n             .------, ",
+ "\n              =\      \ ",
+ "\n .---.         =\      \ ",
+ "\n | C~ \         =\      \ ",
+ "\n |     `----------'------'----------, ",
+ "\n.'     LI.-.LI LI LI LI LI LI LI.-.LI`-. ",
+ "\n\ _/.____|_|______.------,______|_|_____) ",
+ "\n                 /      / ",
+ "\n               =/      / ",
+ "\n              =/      / " ,
+ "\n             =/      / ",
+ "\n             /_____,'   ");      
                
         
         
   
       do { 
         
            do {
            
               // ask input from user for preffered class seat
               System.out.println( "|=========================|"
                               + "\n|   C L A S S  S E A T    |"  
                               + "\n|=========================|"
                               + "\n|                         |"
                               + "\n|    [1] First class      |"
                               + "\n|    [2] Business class   |"
                               + "\n|    [3] Economy class    |"
                               + "\n|    [0] Exit             |"
                               + "\n|                         |"
                               + "\n|=========================|");
                     
                     System.out.print(" _________________________");
                     System.out.print("\n Choose your class seat: ");
                     cseat = key.nextInt();
                        
         
            //conditional statement for class seat       
               if (cseat == 1){
                  System.out.println(" ---------++++++---------");
                  System.out.println("        First Class");
                  System.out.println(" ---------++++++---------"); 
                  Firstclass();
               }
               else if (cseat == 2){
                  System.out.print("> Business Class\n"); 
                  Businessclass();
               }
               else if (cseat == 3){
                  System.out.print("> Economy Class\n");
                  Economyclass();
               }
               else if (cseat == 0){
                  System.out.print("Thank you for visiting our airline!");
                  System.exit(0);
               }
               else {
                  System.out.print("You inputted wrong class seat!\n");
               }
            
            
         
            // if user inputted wrong input for class seat
            } while (cseat != 1 && cseat != 2 && cseat != 3);       
      
      
            // if user chose first class
            if (cseat == 1) {
               System.out.println();
               System.out.print("\nRow  [1-2]: ");
               int row = key.nextInt();
               System.out.print("Seat [1-6]: ");
               int seat = key.nextInt();
                
                if (airplane[row - 1][seat - 1] == "*" ) {
                    airplane[row - 1][seat - 1] = "X";
                    System.out.println("Seat reserved successfully!");
                } 
                else if (airplane[row - 1][seat - 1] == "* " ) {
                    airplane[row - 1][seat - 1] = "X ";   
                    System.out.println("Seat reserved successfully!");
                }
                else {
                     System.out.println("=================================");
                     System.out.println("Sorry, this is not available!");
                     System.out.println("=================================");
                }
            }
            
            // if user chose business class
            else if (cseat == 2) {
               System.out.println();
               System.out.print("\nRow  [3-7]: ");
               int row = key.nextInt();
               System.out.print("Seat [1-6]: ");
               int seat = key.nextInt();
               
                if (airplane[row - 3][seat - 1] == "*" ) {
                    airplane[row - 3][seat - 1] = "X";
                    System.out.println("Seat reserved successfully!");
                } 
                else if (airplane[row - 3][seat - 1] == "* " ) {
                    airplane[row - 3][seat - 1] = "X ";   
                    System.out.println("Seat reserved successfully!");
                }
                else {
                     System.out.println("=================================");
                     System.out.println("Sorry, this is not available!");
                     System.out.println("=================================");
                }
            }
            
            
            // if user chose economic class   
            else if (cseat == 3) {
               System.out.println();
               System.out.print("\nRow  [8-13]: ");
               int row = key.nextInt();
               System.out.print("Seat [1-6]: ");
               int seat = key.nextInt();
               
                if (airplane[row - 8][seat - 1] == "*" ) {
                    airplane[row - 8][seat - 1] = "X";
                    System.out.println("Seat reserved successfully!");
                } 
                else if (airplane[row - 8][seat - 1] == "* " ) {
                    airplane[row - 8][seat - 1] = "X ";   
                    System.out.println("Seat reserved successfully!");
                }
                else {
                     System.out.println("=================================");
                     System.out.println("Sorry, this is not available!");
                     System.out.println("=================================");
                }


            }
      
            // call displayseat() method  
            Displayseat();
      
      
         System.out.print("\nDo you want to book again? [Y/N]: ");                          
         book = key.next().charAt(0);
         System.out.println();
         System.out.println();
         
         
         } while (book == 'y' || book == 'Y');
      
      
         System.out.println();
         System.out.print( "      ---------++++++---------"
                       + "\nThank you for choosing this airline"
                       + "\n        Have a nice day!"
                       + "\n      ---------++++++---------");   
      
   }
   
}