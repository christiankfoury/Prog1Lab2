import java.util.*;
public class Name
{
    public static void main(String[] args) {
        // Creating Scanner and naming kb (KeyBoard)
        Scanner kb = new Scanner(System.in);

        // Prompt the user
        System.out.println("Enter your last name and first name in the format: lastName, first name");
        String name = kb.nextLine();
        
        // Finding location of the space to seperate the firstName and the lastName
        int spacePosition = name.indexOf(", ");
        String firstName = name.substring(spacePosition+1);
        String lastName = name.substring(0, spacePosition);

        // Capitalizing the first letter and lowercasing the rest (first name)
        String fNameFirstLetter = firstName.substring(0, 2);
        String fNameRest = firstName.substring(2);
        fNameFirstLetter = fNameFirstLetter.toUpperCase();
        fNameRest = fNameRest.toLowerCase();
        firstName = fNameFirstLetter + fNameRest;

        //Capitalizing the first letter and lowercasing the rest (last name)
        String lNameFirstLetter = lastName.substring(0,1);
        String lNameRest = lastName.substring(1);
        lNameFirstLetter = lNameFirstLetter.toUpperCase();
        lNameRest = lNameRest.toLowerCase();
        lastName = lNameFirstLetter + lNameRest;


        
        // Output
        System.out.println("Your name is:");
        System.out.print(firstName + " " + lastName);




    }
}