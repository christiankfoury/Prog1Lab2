import java.util.*;
public class Time{
public static void main(String[] args) {
// Scanner called kb (keyboard)
Scanner kb = new Scanner(System.in);

// Prompt the user
System.out.println("Enter an amount of seconds");
// Getting the input of the user
int seconds = kb.nextInt();

/* The input of the seconds changed to make the conversion in seconds
  by making the maximal amount of seconds, minutes and hours BY 60 */

  // Taking the time output to another level by adding an hoursTime variable
int hoursTime = seconds / 3600;
int minutesTime = seconds % 3600 / 60;
int secondsTime = seconds % 60;





// Output
System.out.print("The format of " + seconds + " seconds in hour:minute:second is\n" + hoursTime + ":" + minutesTime + ":" + secondsTime);


}
}