package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double number = 0;
        double number1 = 1.0;

        System.out.print("Number "+counter+": ");
        number = scanner.nextDouble();
        counter += 1;

        if (number <= 0) {
            System.out.println("No number entered.");
        } else {
            for (; number1 > 0; counter++) {
                System.out.print("Number " + counter + ": ");
                number1 = scanner.nextDouble();
                if (number1 > number) {
                    number = number1;
                }
            }
        }
        if (number > 0){
            System.out.print("The largest number is ");
            System.out.printf("%.2f", number);
            System.out.println();
        }

    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        int rows;
        int counter = 0;
        int printedNumber = 0;

        System.out.print("n: ");
        rows = scanner.nextInt();
        if (rows <= 0) {
            System.out.println("Invalid number!");
        } else {
            for (int rowCounter = 0; rowCounter < rows; rowCounter++) {
                counter++;
                for (int j = counter; j > 0 ; j--) {
                    printedNumber++;
                    System.out.print(printedNumber+" ");
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        final int rows = 6;
        int inner = 1;
        int outer = 5;

        for (int rowCounter = 0; rowCounter < rows; rowCounter++) {
            for (int a = 0; a < outer; a++) {
                System.out.print(" ");
            }
            for (int b = 0; b < inner; b++) {
                System.out.print("*");
            }
            inner += 2;
            outer -= 1;
            System.out.println();
            }

        }


    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h % 2 == 1) {
            for (int rowCounter = 0; rowCounter <= h/2; rowCounter++) {
                for (int spaces = rowCounter; spaces < h/2; spaces++) {
                    System.out.print(" ");
                }
                for (int chars = 0 - rowCounter; chars <= rowCounter ; chars++) {
                    System.out.print((char)(c - Math.abs(chars)));
                }
                System.out.println();
            }
            for (int rowCounter = h/2; rowCounter > 0; rowCounter--) {
                for (int spaces = rowCounter; spaces <= h/2; spaces++) {
                    System.out.print(" ");
                }
                for (int chars = 0 - rowCounter + 1; chars < rowCounter; chars++) {
                    System.out.print((char)(c - Math.abs(chars)));
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }


    }

    //todo Task 5
    public void marks() {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int negative = 0;
        int sum = 0;
        int mark = 1;
        int mark1 = 1;

        System.out.print("Mark " + counter + ": ");
        mark = scanner.nextInt();
        while ((mark > 5) ^ (mark < 0)) {
            System.out.println("Invalid mark!");
            System.out.print("Mark " + counter + ": ");
            mark = scanner.nextInt();
            }
        if (mark == 5){
            negative += 1;
        }

        counter += 1;
        sum += mark;

        while (mark1 != 0) {
            System.out.print("Mark " + counter + ": ");
            mark1 = scanner.nextInt();
            while ((mark1 > 5) ^ (mark1 < -1)) {
                System.out.println("Invalid mark!");
                System.out.print("Mark "+counter+": ");
                mark1 = scanner.nextInt();
            }
            if (mark1 == 0) {
                ;
            } else {
                sum += mark1;
                counter += 1;
                if (mark1 == 5) {
                    negative += 1;
                }
            }
        }
        counter -= 1;
        double average = (double) sum/counter;
        System.out.printf("Average: "+"%.2f",average);
        System.out.println();
        System.out.println("Negative marks: "+negative);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}