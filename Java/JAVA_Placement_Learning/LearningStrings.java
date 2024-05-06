public class LearningStrings {

    public static void main(String[] args) {
        // next is input is only 1 word, nextLine if input is a sentence

        // Concatenation

        String fname = "Kartik";
        String lname = "Sharma";
        String fullName = fname + " " + lname;

        System.out.println("Concatenation : " + fullName);

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));

        }

        // String comparison
        /*
         * if s1 > s2 : + value
         * if s1 == s2 : 0
         * if s1 < s2 : - value
         * 
         * The strings with characters greater sequentilayy are greater strings : How vs
         * Wow : W > H, therefore Wow > How
         */

        String test = "Kartik";

        if (test.compareTo(fname) == 0) {

            System.out.println("test and fname are equal");

        }

        if (test.compareTo(fullName) < 0) {

            System.out.println("fullname is greater than test");

        }

        if (fullName.compareTo(test) > 0) {
            System.out.println("test is smaller than fullname");
        }

        // Substring
        String extLname = fullName.substring(7, 13);
        System.out.println("Extracted Last name using Substring : " + extLname);

    }

}
