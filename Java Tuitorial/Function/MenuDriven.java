
// public class MenuDriven {
//    public static void main(String args[]) 
//    {
//        Scanner sc = new Scanner(System.in);
//        int  input = 0;
//        do {

//         System.out.println("Want to continue ? (yes(1) or no(0))");
//         input = sc.nextInt();
//         System.out.println("Please enter the marks out of 100:");
//            int marks = sc.nextInt();
//            if(marks >= 90 && marks <= 100) {
//                System.out.println("This is Good");
//            } else if(marks >= 60 && marks <= 89) {
//                System.out.println("This is also Good");
//            } else if(marks >= 0 && marks <= 59) {
//                System.out.println("This is Good as well");
//            } else {
//                System.out.println("Invalid");
//            }
      
//        } while(input == 1);

//             // while(input == 1)
//             // {
//             //     int marks = sc.nextInt();
//             //     if(marks >= 90 && marks <= 100) {
//             //         System.out.println("This is Good");
//             //     } else if(marks >= 60 && marks <= 89) {
//             //         System.out.println("This is also Good");
//             //     } else if(marks >= 0 && marks <= 59) {
//             //         System.out.println("This is Good as well");
//             //     } else {
//             //         System.out.println("Invalid");
//             //     }
//             //     System.out.println("Want to continue ? (yes(1) or no(0))");
//             //     input = sc.nextInt();
//             // } 
//     }   
// }


import java.util.Scanner;

public class MenuDriven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            // Ask the user if they want to continue
            System.out.println("Do you want to enter marks? (yes(1) or no(0))");
            input = sc.nextInt();

            // If user chooses to continue, ask for marks
            if(input == 1) {
                System.out.println("Please enter the marks out of 100:");
                int marks = sc.nextInt();

                if(marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if(marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if(marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid");
                }
            }

            // If input is 0, the loop will exit without asking for marks
        } while(input == 1);

        System.out.println("Program exited.");
    }
}
