import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your age");
        
        try {
            int age = sc.nextInt();
            System.out.println("you should read at least " + (100 - age) + " pages");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }finally { 
            System.out.println("Thank you for using this program and read more books.");

        }
        sc.close();
        
    }
    
}
