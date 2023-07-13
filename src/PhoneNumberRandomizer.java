//**********************************************************************************************************************
// PhoneNumberRandomizer.java
//
// An application that creates and prints a random phone number in the form of XXX-XXX-XXXX. Include dashes
// in output. First 3 digits cannot contain 8 or 9, and second set must not be greater than 742.
//**********************************************************************************************************************

import java.util.Random;

public class PhoneNumberRandomizer
{
    public static void main(String[] args)
    {
        Random randomizer = new Random();
        int first1 = randomizer.nextInt(1, 7);
        int first2 = randomizer.nextInt(0, 7);
        int first3 = randomizer.nextInt(0, 7);
        int second1 = randomizer.nextInt(0, 7);
        int second2 = randomizer.nextInt(0, 4);
        int second3 = randomizer.nextInt(0, 2);
        int third1 = randomizer.nextInt(0, 9);
        int third2 = randomizer.nextInt(0, 9);
        int third3 = randomizer.nextInt(0, 9);

        System.out.print("New randomized phone number: " + first1);
        System.out.print(first2);
        System.out.print(first3 + "-" + second1);
        System.out.print(second2);
        System.out.print(second3 + "-" + third1);
        System.out.print(third2);
        System.out.print(third3);
    }
}