
public class Unit1Hw2 {

    public static void main(String[] args) {
        // TODO 
        // Make two String variables for your first and last name
        String firstName = "Justin";
        String lastName = "Bex";
        // TODO 
        // Make five integer variable for your grades (from a previous year, marking period, semester, etc.)
        int grade1 = 98;
        int grade2 = 89;
        int grade3 = 96;
        int grade4 = 93;
        int grade5 = 96;

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
}