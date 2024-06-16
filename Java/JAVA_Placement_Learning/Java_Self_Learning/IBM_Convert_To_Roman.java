package Java_Self_Learning;

import java.util.ArrayList;
import java.util.List;

/*
 * The table below contains some reference values for converting between integers (i.e., Arabic numerals) and Roman numerals:


Given an integer, convert it to its Roman numeral equivalent.

Example
numbers = [1, 49, 23]

Looking at the conversions above, 1 is represented as I (capital i), 49 is 40 + 9, so XLIX, and 23 is XXIII. The return array is [I’, ‘XLIX’, ‘XXIII’].

Function Description
Complete the function romanizer in the editor below. The function must return an array of strings that represent the integers as their Roman numeral equivalents.

romanizer has the following parameter(s):
int numbers[n]: an array of integers

Returns

Returns
string[n]: an array of strings that represent the integers as their Roman numeral equivalents.

Constraints
• 1≤ n ≤ 1000
• 1 ≤ numbers[i] < 1000

▼ Input Format for Custom Testing
Input from stdin will be processed as follows and passed to the function.
The first line contains an integer n, the size of the array numbers.
Each of the next n lines contains an integer numbers[i].
 * 
 * 
*/

@SuppressWarnings("unchecked")
public class IBM_Convert_To_Roman {

    public String romanGenerator(Integer number) {
        String romanString = "";

        System.out.println("Current string : " + romanString);
//*****************Resolve the issue with number ending with 9.
        if (number < 100) {
            if (number < 50) {

                

                int temptens = 10 * (number / 10); // Quotient
                int tempunits = number % 10; // Remainder

                System.out.println("Tens digit " + temptens);
                System.out.println("Unit digit " + tempunits);

                switch (tempunits) {
                    case 0:
                        romanString = "";
                        System.out.println("Test String for  0 units : " + romanString);
                        break;
                    case 1:
                        romanString = "I";
                        break;
                    case 2:
                        romanString = "II";
                        break;
                    case 3:
                        romanString = "III";
                        break;
                    case 4:
                        romanString = "IV";
                        break;
                    case 5:
                        romanString = "V";
                        break;
                    case 6:
                        romanString = "VI";
                        break;
                    case 7:
                        romanString = "VII";
                        break;
                    case 8:
                        romanString = "VIII";
                        break;
                    case 9:
                        romanString = "XI";
                        break;

                }

                switch (temptens) {
                    case 10:
                        romanString = "X" + romanString;
                        break;
                    case 20:
                        romanString = "XX" + romanString;
                        break;
                    case 30:
                        romanString = "XXX" + romanString;
                        System.out.println("Test String for  30 tens : " + romanString);
                        break;
                    case 40:
                        romanString = "XV" + romanString;
                        break;

                }

            } else if (number < 10) {

                switch (number) {
                    case 1:
                        romanString = "I";break;
                    case 2:
                        romanString = "II";break;
                    case 3:
                        romanString = "III";break;
                    case 4:
                        romanString = "IV";break;
                    case 5:
                        romanString = "V";
                        System.out.println("Test String for  5 units : " + romanString);break;
                    case 6:
                        romanString = "VI";break;
                    case 7:
                        romanString = "VII";break;
                    case 8:
                        romanString = "VIII";break;
                    case 9:
                        romanString = "XI";
                        break;
                }

            } else if (number > 50 && number < 99) {

            } else if (number == 99) {
                romanString = "XC";
            }

        } else if (number == 100) {

        } else if (number > 100 && number < 500) {
            if (number == 400) {
                romanString = "CD";
            }

        } else if (number == 500) {
            romanString = "D";
        } else if (number > 500 && number < 1000) {
            if (number == 900) {
                romanString = "CM";
            }

        }

        return romanString;
    }

    public void helper(List perDigits, List romanNumerals) {
        int cnst = perDigits.size() - 1;

        String tempRomanString = "";
        for (int i = 0; i < perDigits.size(); i++) {

            

            System.out.println("Sending number : " + (Integer.parseInt(perDigits.get(i).toString())));
            System.out.println("Actual value of the digit : "
                    + (Integer.parseInt(perDigits.get(i).toString()) * (Math.pow(10, (Math.abs(i - cnst))))));


            tempRomanString = tempRomanString +(romanGenerator(Integer.parseInt(perDigits.get(i).toString())
            * (int) (Math.pow(10, (Math.abs(i - cnst))))));
            
           

        }
        romanNumerals.add(tempRomanString);
    }

    public void digitSeparator(int number, List perDigits) {

        String temp = Integer.toString(number);

        if (temp.length() - 1 == 0) {
            perDigits.add(temp.charAt(0));
            return;
        }

        perDigits.add(temp.charAt(0));
        temp = temp.substring(1);
        number = Integer.parseInt(temp);
        digitSeparator(number, perDigits);

    }

    public void romanizer(int[] numbers, List romanNumerals) {

        List perDigits = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            perDigits.clear();

            digitSeparator(numbers[i], perDigits);
            helper(perDigits, romanNumerals);

        }

        System.out.println("Test Digit : " + perDigits);

        System.out.println("Test Answer : " + romanNumerals);

    }

    public static void main(String[] args) {

        int testArr[] = { 1, 49 , 23};

        List romanNumerals = new ArrayList<>();

        new IBM_Convert_To_Roman().romanizer(testArr, romanNumerals);

        System.out.println(romanNumerals);

    }

}
