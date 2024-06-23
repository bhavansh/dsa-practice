package datastructures.queues;

import datastructures.queues.impl.ArrayQueue;
import datastructures.stacks.Stack;
import datastructures.stacks.impl.ArrayStack;

import java.util.Scanner;

public class UseQueue {

    public static void implement(){
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue  = new ArrayQueue<>();

        boolean running = true;
        menu();
        while(running){
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter element to be pushed: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    System.out.println(element + " pushed to queue");
                    break;
                case 2:
                    Integer removedElement = queue.dequeue();
                    System.out.println("Removed Element : " + removedElement);
                    break;
                case 3:
                    Integer topElement = queue.front();
                    System.out.println("Front Element : " + topElement);
                    break;
                case 4:
                    System.out.println("Size : " + queue.size());
                    break;
                case 5:
                    System.out.print("Queue : ");
                    queue.print();
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
        System.out.println("\nQueue Operations:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Front");
        System.out.println("4. Size");
        System.out.println("5. Print");
        System.out.println("6. Help");
        System.out.println("7. Exit");
    }
}
