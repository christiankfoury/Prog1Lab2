import java.util.*;
public class AverageCelcius
{
    public static void main(String[] args) {
        // Creating Scanner and naming kb (KeyBoard)
        Scanner kb = new Scanner(System.in);

        // Prompt the user 3 times the temperature of the last three days in celcius
        System.out.println("What was the temperature in celcius the first day?");
        double temp1 = kb.nextInt();

        System.out.println("What was the temperature in celcius the second day?");
        double temp2 = kb.nextInt();

        System.out.println("What was the temperature in celcius the third day?");
        double temp3 = kb.nextInt();

        // Apply the formula
        double averageCelcius = (temp1 + temp2 + temp3) / 3;

        // Output
        System.out.print("The average of those three days is: " + averageCelcius + " \u2103 C");
    }
}