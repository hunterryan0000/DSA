package Algorithms.RecursiveAlgorithms;

public class TowerOfHanoi {
    // Comment Block: Recursive function to solve Tower of Hanoi problem
    // This function will recursively move 'n' disks from the 'from' rod to the 'to' rod,
    // using the 'aux' rod as the auxiliary rod.
    // Parameters:
    // n - The number of disks to move
    // from - The rod from which to move disks
    // to - The rod to which to move disks
    // aux - The auxiliary rod used for temporary storage
    public static void hanoi(int n, char from, char to, char aux) {
        // Base case: If there is only one disk, directly move it from 'from' rod to 'to' rod
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Move (n-1) disks from 'from' rod to 'aux' rod using 'to' as the auxiliary rod
        hanoi(n - 1, from, aux, to);

        // Move the remaining nth disk from 'from' rod to 'to' rod
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Finally, move the (n-1) disks from 'aux' rod to 'to' rod using 'from' as the auxiliary rod
        hanoi(n - 1, aux, to, from);
    }
}


