package Java_Self_Learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Question 1

Given a binary number as a string, x (a binary string), return the binary string of the same length, y, that will produce the maximum value when XORed with x. There is a number of bits that may be set in y called maxSet.

Example
bits = 3
maxSet = 1
x = 101

The binary strings will always have bits digits, and keading zeros are fine.
1. First, determine all possible bits = 3 binary strings with only maxBits =1 or fewer bits set: 000, 001, 010, 100. These are the potential y values.
2. Now, XOR each of the y values with x = 101
2.1 000 xor 101 = 101
2.2 001 xor 101 = 100
2.3 010 xor 101 = 111
2.4 100 xor 101 = 001

The third value produces the maximal result, where y = 010. Return the string ‘010’.

Function Description
Complete the function findYValue in the editor below.

findYValue has the following parameter(s):

int bits: the length of the binary strings x and y
int maxSet: the number of bits that may be set in y string 
x: a binary string

Returns
string: the best y value as a binary string

Constraints
• 1 ≤ maxSet < bits ≤ 10⁵
• string x contains only 0s and 1s.

▾ Input Format For Custom Testing
The first line contains an integer bits.
The second line contains an integer maxSet.
The third line contains a string of length bits, the binary representation of x. */

public class IBM_BIT_Manipulation {

    // **** First Approach, only works with maxSet = 1 ****
    @SuppressWarnings("unchecked")
    public void helper(int bits, int maxSet, int x, int y, List answer, int i, int maxY, int count,
            int maxResult) {
        int XorResult = 0;

        if (i >= bits) {
            // System.out.println(Integer.toBinaryString(maxY));
            answer.add(0, maxY);
            return;
        }

        if (count == 0) {

            XorResult = 0 ^ x;
            count = count + 1;
            System.out.println(Integer.toBinaryString(0) + " XOR " + Integer.toBinaryString(x) + " = "
                    + Integer.toBinaryString(XorResult));
            System.out.println(" ");

        }
        y = 1 << i;
        XorResult = y ^ x;
        System.out.println(Integer.toBinaryString(y) + " XOR " + Integer.toBinaryString(x) + " = "
                + Integer.toBinaryString(XorResult));

        if (XorResult > maxResult) {
            maxResult = XorResult;
            maxY = y;
        }

        System.out.println();

        helper(bits, maxSet, x, y, answer, i + 1, maxY, count, maxResult);

    }

    @SuppressWarnings("rawtypes")
    public String findYValueFirstApproach(int bits, int maxSet, String x) {
        int y = 0;
        int xo = Integer.parseInt(x, 2);
        System.out.println("Value of X : " + xo);
        System.out.println();
        List answer = new ArrayList<Integer>();
        helper(bits, maxSet, xo, y, answer, 0, 0, 0, 0);
        return Integer.toBinaryString((int) answer.get(0));
    }

    
    @SuppressWarnings("rawtypes")
    public String findYValueSecondApproach(int bits, int maxSet, String x) {
        int y = 0;
        int xo = Integer.parseInt(x, 2);
        System.out.println("Value of X : " + xo);
        System.out.println();
        List answer = new ArrayList<Integer>();
        //helper(bits, maxSet, xo, y, answer, 0, 0, 0, 0);
        return Integer.toBinaryString((int) answer.get(0));
    }



    public static void main(String[] args) {

        System.out.println("The y value which resulted in maximal XOR Result is : "
                + new IBM_BIT_Manipulation().findYValueFirstApproach(4, 1, "1011"));
        System.out.println();

    }

}
