package exercises.InitialConcepts;

import java.util.Scanner;

public class Exercise_29 {
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write a number corresponding to a month: (1 - 12): ");
        int mouthSelected = scan.nextInt();

        switch (mouthSelected) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("Octuber");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("Dezember");
                break;

            default:
                System.out.println("Invalid number");
                break;
        }

        scan.close();
    }
}
