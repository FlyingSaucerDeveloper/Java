import java.util.Scanner;

public class BitManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // GET BIT
        // Get the xth bit of a number n. BIT Mask : 1<<i, Operation : AND (&)
        // (position is calculated from right side starting from 0)

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Which BIT (not position) to find : ");
        int i = sc.nextInt() - 1;

        int bitMask = 1 << i;

        if ((bitMask & n) == 0) {
            System.out.println("The " + (i + 1) + " bit is : 0");
        } else {
            System.out.println("The " + (i + 1) + " bit is : 1");
        }

        // SET BIT -> if a bit is 0 convert it to 1, if the bit is 1 , keep it same
        // Set the xth bit of number n. use Bit mask 1<<i and Operation : OR (|)

        System.out.print("Enter the Bit to be changed : ");
        i = sc.nextInt() - 1;

        bitMask = 1 << i;

        int newNum = (bitMask | n);

        System.out.println("New number after set bit operation on " + (i + 1) + " bit: " + newNum);

        // CLEAR BIT -> Change the BIT to 0
        // Clear the xth bit of a number n. BIT MASK : 1<<i, Operation : AND with NOT 
        //(~(BIT MASK) & n)

        System.out.print("Enter the Bit to clear : ");
        i = sc.nextInt() - 1;

        bitMask = 1 << i;

        newNum = (~bitMask) & n;

        System.out.println("The number after clearing the " + (i + 1) + " bit: " + newNum);

        //UPDATE BIT
        // IF update the xth bit to 0 -> use clear bit operation (~BitMask & n)
        // IF update the xth bit to 1 -> use Set bit operation   ( BitMask | n)  

        //Update the xth bit of the number n.

        System.out.print("Enter the bit to update : ");
        i = sc.nextInt()-1;

        bitMask = 1<<i;

        System.out.print("To which bit you want to update (1 or 0): " );
        int bitType = sc.nextInt();

        if (bitType==1){

            newNum = bitMask | n; //set bit operation

        }
        else if(bitType ==0) {
            newNum = (~bitMask)&n;
        }

        System.out.println("The number after updating the "+(i+1)+" bit with "+bitType+" is -> "+ newNum);


    }

}
