import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your year of birth: ");

        int n = sc.nextInt();
        System.out.println("you were born in " + n + "correct?");

        System.out.println("if yes input y if not input n");

        boolean validinput = false;
        while (!validinput) {
            String input = sc.nextLine();
            // reads the next line of input//
            input = input.toLowerCase();
            // converts the input to lowercase//
            
        boolean results = false;
        if (input.equals("y")) {
            results = true;
            validinput = true;
        } else if (input.equals("n")) {
            results = false;
            validinput = true;
        } else {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
        }

        if (results) {
            System.out.println("The preferable age of someone you should date is someone who is born later than " + (n + 7));
        }
        
        

            
        }
        
    
        sc.close();
    
    } // Close class
}
