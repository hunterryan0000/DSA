package Algorithms.RandomizedAlgorithms;

import java.util.Random;

public class MonteCarloPiEstimation {

    /**
     * Comment Block: Estimate Pi using Monte Carlo method
     *
     * This method estimates the value of Pi using a Monte Carlo simulation.
     * Points are randomly placed inside a unit square, and the ratio of
     * points falling inside the unit circle to the total number of points
     * is used to estimate Pi.
     *
     * @param totalPoints The total number of random points to be generated.
     * @return The estimated value of Pi.
     */
    public static double estimatePi(long totalPoints) {
        // Initialize Random object for generating random numbers
        Random rand = new Random();

        // Initialize counter for points that fall within the unit circle
        long pointsInsideCircle = 0;

        // Generate random points and check if they fall inside the unit circle
        for (long i = 0; i < totalPoints; i++) {
            double x = rand.nextDouble(); // Random x-coordinate
            double y = rand.nextDouble(); // Random y-coordinate

            // Check if point is inside unit circle
            if (x * x + y * y <= 1) {
                pointsInsideCircle++;
            }
        }

        // Use the ratio of points inside circle to total points to estimate Pi
        return 4 * (double) pointsInsideCircle / totalPoints;
    }

    public static void main(String[] args) {
        // Example usage: Estimate Pi with 1,000,000 points
        double estimatedPi = estimatePi(1000000);
        System.out.println("Estimated Pi: " + estimatedPi);
    }
}

