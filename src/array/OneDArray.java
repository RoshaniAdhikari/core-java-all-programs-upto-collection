package array;
import java.util.*;
import java.util.Scanner;

public class FriendListProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of friends from the user
        System.out.print("Enter the number of friends: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Create an array to store friends
        String[] friendList = new String[n];

        // Populate the array with friend names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of friend " + (i + 1) + ": ");
            friendList[i] = sc.nextLine();
        }

        // Print the friend list
        System.out.println("\nYour Friend List:");
        for (String friend : friendList) {
            System.out.println(friend);
        }

        // Close the scanner
        sc.close();
    }
}
