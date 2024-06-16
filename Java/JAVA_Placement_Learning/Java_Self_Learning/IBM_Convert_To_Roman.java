package Java_Self_Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

    public String unitsRomanGenerator(int number) {
        String resp = "";

        switch (number) {
            case 1:
                resp = "I";
                break;
            case 2:
                resp = "II";
                break;
            case 3:
                resp = "III";
                break;

            case 4:
                resp = "IV";
                break;

            case 5:
                resp = "V";
                break;
            case 6:
                resp = "VI";
                break;
            case 7:
                resp = "VII";
                break;
            case 8:
                resp = "VIII";
                break;

            case 9:
                resp = "IX";
                break;
            case 10:
                resp = "X";
                break;
        }

        return resp;

    }

    public String tensRomanGenerator(int number) {
        String resp = "";

        if (number < 40) {
            for (int i = 0; i < (number / 10); i++) {
                resp = resp + "X";
            }
        } else if (number == 40)
            resp = "XL";
        else if (number == 50)
            resp = "L";
        else if (number > 50 && number != 90) {
            String temp = "";
            for (int i = 0; i < ((number - 50) / 10); i++) {
                temp = temp + "X";
            }
            resp = "L" + temp;
        } else if (number == 90) {
            resp = "XC";
        }

        return resp;
    }

    public String hundredsRomanGenerator(int number) {

        String resp = "";

        if (number == 100) {
            resp = "C";
        }

        else if (number < 400) {

            for (int i = 0; i < (number / 100); i++) {
                resp = resp + 'C';
            }

        } else if (number == 400)
            resp = "CD";
        else if (number == 500)
            resp = "D";
        else if (number > 500 && number != 900) {
            String temp = "";

            for (int i = 0; i < (((number - 500) / 100)); i++) {
                temp = temp + "C";
            }
            resp = "D" + temp;
        } else if (number == 900) {
            resp = "CM";
        }

        return resp;

    }

    public String thousandsGenerator(int number){
        String resp = "";

        if (number==1000) resp = "M";
        else if (number > 1000 && number<5000){
            for (int i = 0; i<(number/1000); i++){
                resp = resp+"M";
            }

        }

        return resp;
    }

    public String romanGenerator(Integer number) {

        String romanString = "";

        if (number >= 100 && number<1000) {
            romanString = hundredsRomanGenerator(number);
        }

        if (number > 10 && number < 100) {
            romanString = tensRomanGenerator(number);
        }

        if (number <= 10) {
            romanString = unitsRomanGenerator(number);
        }
        if (number>=1000){
            romanString = thousandsGenerator(number);
        }

        return romanString;
    }

    public void helper(List perDigits, List romanNumerals) {
        int cnst = perDigits.size() - 1;

        String tempRomanString = "";
        for (int i = 0; i < perDigits.size(); i++) {

            tempRomanString = tempRomanString + (romanGenerator(Integer.parseInt(perDigits.get(i).toString())
                    * (int) (Math.pow(10, (Math.abs(i - cnst))))));

        }
        romanNumerals.add(tempRomanString);
    }

    public void digitSeparator(String number, List perDigits) throws numberNotEligibleException {

        String temp = number;

        if (Integer.parseInt(number)>=4000){
            throw new numberNotEligibleException(number);
        }

        if (temp.length() - 1 == 0) {
            perDigits.add(temp.charAt(0));
            return;
        }

        
        perDigits.add(temp.charAt(0));
        temp = temp.substring(1);
        number = temp;
        digitSeparator(number, perDigits);

    }

    public String[] romanizer(int[] numbers) throws numberNotEligibleException {
        ArrayList romanNumerals = new ArrayList<>();
        List perDigits = new ArrayList<>();
        String[] answer = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            perDigits.clear();

            digitSeparator(Integer.toString(numbers[i]), perDigits);
            helper(perDigits, romanNumerals);

        }

       answer = (String[]) romanNumerals.stream().toArray(String[]::new); // Converting arraylist to String array

        return answer;

    }

    @SuppressWarnings("unused")
    public static void main(String[] args) throws numberNotEligibleException {

        numberNotEligibleException notEligibleException = new numberNotEligibleException();

        int testArr[] = { 3749, 149, 2255 };

        System.out.print("Given Numbers: ");

        for (int i : testArr) {
            System.out.print(i);
            System.out.print( " ");
        }
        System.out.println();
        String [] answer = new IBM_Convert_To_Roman().romanizer(testArr);

        System.out.println();
        System.out.print("Converted to Roman Numerals: ");
        for (String string : answer) {
        
            System.out.print(string);
            System.out.print(" ");    
        }
        

    }

}
