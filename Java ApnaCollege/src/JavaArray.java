import java.util.Scanner; // Importing Scanner class
import java.util.Arrays; // Importing Array class
public class JavaArray {
    public static void main(String[] args) {
        // Declaring Array
        int[] marks = new int[3];
        System.out.print("Enter Mark (Physics, Chemistry and Math): ");
        for(int i = 0; i < 3; i++) {
            // Creating Scanner object mark and new creates an instance in memory
            Scanner mark = new Scanner(System.in);
            marks[i] = mark.nextInt(); // Read user input and saving in marks[i]
        }
        for(int i = 0; i < 3; i++) {
            int j = i + 1;
            System.out.println("Mark " + j +"th subject: "+ marks[i]);
        }
        // Array length
        System.out.println("Array length: " + marks.length);
        // Array sort
        Arrays.sort(marks);
        System.out.println("After Sorting: ");
        for(int i = 0; i < 3; i++) {
            int j = i + 1;
            System.out.println("Mark " + j +"th subject: "+ marks[i]);
        }
        // Array input defined:
        int[] marksAgain = {97, 98, 89};
        for(int i = 0; i < 3; i++) {
            int j = i + 1;
            System.out.println("Mark " + j +"th subject: "+ marksAgain[i]);
        }
    }
}
