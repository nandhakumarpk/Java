/*
 * reverse a number
 */
import java.util.*;
class Palindrome
{
    public static void main()
    {
        Scanner imprefcet = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int number = imprefcet.nextInt();
        int duplicate=number;
        int reversed=0;
        while(duplicate>0)
        {
            reversed*=10;
            int remainder=duplicate%10;
            reversed+=remainder;
            duplicate/=10;
        }
        System.out.println("Reversed number: "+reversed);
        if(number==reversed)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}
