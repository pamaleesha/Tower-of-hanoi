// Tower Of Hanoi
public class TowerOfHanoi {

// Recursive function to solve Tower of Hanoi puzzle
public static void solveHanoi(int n, char source, char auxiliary, char destination) {
    // Base case: Only one disk to move
    if (n == 1) {
        System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
        return;
    }

    // Recursive case:
    // 1. Move n-1 disks from source to auxiliary, using destination as a buffer
    solveHanoi(n - 1, source, destination, auxiliary);

    // 2. Move the nth disk from source to destination
    System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);

    // 3. Move the n-1 disks from auxiliary to destination, using source as a buffer
    solveHanoi(n - 1, auxiliary, source, destination);
}

public static void main(String[] args) {
    int n = 3; // Number of disks
    solveHanoi(n, 'A', 'B', 'C'); // A, B and C are names of rods
}
}
