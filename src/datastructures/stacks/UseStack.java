package datastructures.stacks;

import datastructures.stacks.impl.ArrayStack;

import java.util.Scanner;

public class UseStack {

    public static void implement(){
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack  = new ArrayStack<>();

        boolean running = true;
        menu();
        while(running){
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter element to be enqueued: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    System.out.println(element + " inserted in the queue");
                    break;
                case 2:
                    Integer poppedElement = stack.pop();
                    System.out.println("Popped Element : " + poppedElement);
                    break;
                case 3:
                    Integer topElement = stack.top();
                    System.out.println("Top Element : " + topElement);
                    break;
                case 4:
                    System.out.println("Size : " + stack.size());
                    break;
                case 5:
                    System.out.print("Stack : ");
                    stack.print();
                    break;
                case 6:
                    menu();
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting ...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 to 6.");
            }
        }

    }

    private static void menu() {
        System.out.println("\nStack Operations:");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Size");
        System.out.println("5. Print");
        System.out.println("6. Help");
        System.out.println("7. Exit");
    }
}
