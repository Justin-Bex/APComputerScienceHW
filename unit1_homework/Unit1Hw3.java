import java.util.*;

public class Unit1Hw3 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        // TODO 
        // Make two String variables for your first and last name
      System.out.println("Enter first name");
        String firstName = scan.nextLine();
      System.out.println("Enter last name");
        String lastName = scan.nextLine();
        // TODO 
        // Make five integer variable for your grades (from a previous year, marking period, semester, etc.)
      System.out.println("Enter grade 1");
        int grade1 = scan.nextInt();
      System.out.println("Enter grade 2");
        int grade2 = scan.nextInt();
      System.out.println("Enter grade 3");
        int grade3 = scan.nextInt();
      System.out.println("Enter grade 4");
        int grade4 = scan.nextInt();
      System.out.println("Enter grade 5");
        int grade5 = scan.nextInt();
        // TODO 
        // Make a variable to store the average of your grades
        // Hint: average = (grade1 + grade2 + ...) / total
        // Think about what type the variable should be - it should have a decimal point!
        double avgGrade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
        // TODO 
        // Add some print statements to output the following to the user
        // STUDENT:     LAST_NAME, FIRST_NAME
        // GRADES:      GRADE_1, GRADE_2, GRADE_3, GRADE_4, GRADE_5
        // AVERAGE:     CALCULATED_AVERAGE
        // 
        // Your print statements should be on three separate lines with 
        // LAST_NAME, FIRST_NAME, GRADE_1, GRADE_2, GRADE_3, GRADE_4, GRADE_5, CALCULATED_AVERAGE
        // replaced with whatever values you stored in the variables above
        System.out.println("STUDENT:\t" +lastName +", " +firstName +"\nGRADES:\t" +grade1 +", " +grade2 +", " +grade3 +", " +grade4 +", " +grade5 +"\nAVERAGE:\t" +avgGrade);

        // TODO Make sure this average makes sense!
        // There isn't any code to write here BUT
        // don't just trust your code, always verify!!

    }
} // This one was fun!
