import datastructures.queues.UseQueue;
import datastructures.stacks.UseStack;

import java.util.Scanner;

public class DataStructures {

    public static void main(String[] args) {
        System.out.println("Starting Data Structures ...");
        System.out.println("Please select a data structures or algorithms to use among the options available below");
        System.out.println("1 :  Stacks");
        System.out.println("2 :  Queues");
        System.out.println("3 :  LinkedLists");
        System.out.println("4 :  Vectors");
        System.out.println("Enter your choice : ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                UseStack.implement();
                break;
            case 2:
                UseQueue.implement();
                break;
            default:
                System.out.println("Not Yet Implemented");
        }

    }

}
