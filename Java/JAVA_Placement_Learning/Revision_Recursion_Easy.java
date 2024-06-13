import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Revision_Recursion_Easy {

    public String mergeAlternately(String word1, String word2) {

        String ns = "";

        ns = doMerge(ns, word1, word2, 0, 0, word1.length(), word2.length());

        return ns;

    }

    public String doMerge(String ns, String w1, String w2, int i, int j, int w1L1, int w2L2) {

        if (ns.length() == (w1L1 + w2L2)) {
            return ns;

        }

        if (w1.length() != 0) {
            ns = ns + w1.charAt(0);
            // i = 0;
            w1 = w1.substring(1);

        }

        if (w2.length() != 0) {
            ns = ns + w2.charAt(0);
            j = 0;

            w2 = w2.substring(1);

        }

        System.out.println("i : " + i + " j : " + j);
        System.out.println("ns:" + ns + ", w1 :" + w1 + ", w2 :" + w2);

        return doMerge(ns, w1, w2, i + 1, j + 1, w1L1, w2L2);

    }

    public String divisorFinder(String s1, String s2) {

        int s1Len = s1.length();
        int s2Len = s2.length();

        if (!(s1+s2) .equals(s2+s1)){
            return "";
        }

        

      
        return divisor;

    }

   
   

    public static void main(String[] args) {

        // Alternate merge the Strings
        System.out.println("Easy Recursion Problem 1 (Alternate merge the strings (ab+def = adbef)): ");
        System.out.println("Answer : " + new Revision_Recursion_Easy().mergeAlternately("ab", "def"));
        System.out.println();

        // Greatest Common Divisor of Strings
        /*
         * For two strings s and t, we say "t divides s" if and only if s = t + t + t +
         * ... + t + t (i.e., t is concatenated with itself one or more times).
         * 
         * Given two strings str1 and str2, return the largest string x such that x
         * divides both str1 and str2.
         */
        String s1 = "ABCABC";
        String s2 = "ABC";
        System.out.print("Greatest Common Divisor of String " + s1 + " and " + s2 + " is:");
        System.out.println(new Revision_Recursion_Easy().divisorFinder(s1, s2));

    }

}
