import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the numbers here (separated by spaces): ");
        String inputNumbers = scanner.nextLine();

        String [] nums = inputNumbers.split(" ");
        int denominator = (nums.length);

        int sum = 0;
        for (int i= 0; i < nums.length; i++)
        {
            sum += Integer.parseInt (nums[i]);
        }
        System.out.println("The sum of all the numbers is " + sum + ".");
        System.out.println("The average of all the numbers is " + sum/denominator);
    }
}
