package assignment;

import java.util.Scanner;
public class DistanceCalculator1 {
    public static void main(String[] args) {
        // Constants
        double u = 36;
        double a = 5;
        // Convert initial velocity to meters per second
        double initialVelocityMetersPerSec = u * (1000.0 / 3600.0);
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        double t1 = scanner.nextDouble();
        System.out.println();
        double t2 = scanner.nextDouble();
        scanner.close();
        // Calculate distance for the first time interval
        int d1 =(int) calculateDistance(initialVelocityMetersPerSec, a, t1);
        // Calculate distance for the second time interval
        int d2 = (int)calculateDistance(initialVelocityMetersPerSec, a, t2);
        // Display the distances
        System.out.println(d1);   
        System.out.println(d2);    }
    // Method to calculate distance using the provided formula
    private static double calculateDistance(double initialVelocity, double acceleration, double time)
    {
        return initialVelocity * time + 0.5 * acceleration * time * time;
    }
}