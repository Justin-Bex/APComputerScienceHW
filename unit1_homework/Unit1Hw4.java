
public class Unit1Hw4 {

    public static void main(String[] args) {
        // LENGTH
        // returns the length of the String
        System.out.println("\n--- LENGTH ---");
        String s1 = "The struggle is real.";
        System.out.println(s1 + " >>>> has a length of " + s1.length());
        s1 = "computer";
        System.out.println(s1 + " >>>> has a length of " + s1.length());

        System.out.println("\n\n");

        // TODO: INDEXOF - takes String as parameter
        System.out.println(s1.indexOf("o")); //Returns the index of the of the first instance of the character or substring
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.indexOf("c"));
        System.out.println(s1.indexOf("r"));
        // TODO: SUBSTRING - with one parameter //Returns the string but only the part after the value (value is the index of the characters)
        System.out.println(s1.substring(4));
        System.out.println(s1.substring(1));
        // TODO: SUBSTRING - with two parameters
        System.out.println(s1.substring(0, 4)); //Returns the string but only the characters between the 2 values (value is the index of the characters)
        System.out.println(s1.substring(4, 7));
        // TODO: EQUALS
        String s2 = "Peanut";
        String s3 = "computer";
        System.out.println(s1.equals(s2)); //Checks if the strings are equal (outputs boolean)
        System.out.println(s1.equals(s3));
        // TODO: COMPARETO
        System.out.println(s1.compareTo(s2)); //Compares the strings lexicographically
        System.out.println(s1.compareTo(s3));
    }

}
