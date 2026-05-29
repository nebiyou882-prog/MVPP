import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<User> userList = new ArrayList<>();
    public static void main(String[] args) {

   

        SalesManager s1 = new SalesManager("Sales Manager", "Bole", "25-43", 8, 25000, 3);
        VideoEditor v1 = new VideoEditor("Video Editor", "Remote", "22-40", 4, 18000, "Adobe Premiere");

        System.out.println("---= Welcome to Job Searching System =---");
        System.out.println();
        System.out.println("== Job Positions ==");
        System.out.println("1. Sales Manager");
        System.out.println("2. Video Editor");
        System.out.println("3. Exit");
        System.out.print("Please enter your choice: ");

        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            Signup("Sales Manager", s1);
        } else if (choice == 2) {
            Signup("Video Editor", v1);
        } else {
            System.out.println("Good bye!!!");
        }

        input.close();
    }

    public static void Signup(String jobTitle, Job job) {
        System.out.println("== Your choice is " + jobTitle + " ==");
        System.out.println();
        System.out.println("=== Job Details ===");
        System.out.println();
        job.showDetails();
        System.out.println();

        System.out.println("DO YOU FULFILL THE REQUIREMENT?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Choice: ");

        int subChoice = input.nextInt();
        input.nextLine();

        if (subChoice == 1) {
            System.out.println("--- Sign Up ---");
            signUp();
        } else {
            System.out.println("Thank you! Good bye.");
        }
    }

    public static void signUp() {
        System.out.print("Enter Full Name: ");
        String name = input.nextLine();

        System.out.print("Enter Phone Number: ");
        long phone = input.nextLong();

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        if (age < 25 || age > 43) {
            System.out.println("Reason: You must be between 25 and 43 years old to apply.");
            System.out.println("!!! REGISTRATION FAILED !!!");
            System.out.println("For more information: +251911121314");
        } else {
            User newUser = new User(name, age, phone);
            userList.add(newUser);
            System.out.println("--- Saved User Details ---");
            System.out.println();
            for (User u : userList) {
                u.displayInfo();
            }
            System.out.println();
            System.out.println("Registered !!!");
            System.out.println("Attach your CV or portfolio on Gmail.");
            System.out.println("Gmail Account: jobsearching1@gmail.com");
            System.out.println("If you pass, we will call you very soon.");
            System.out.println("For more information: +251911121314");
        }
    }
}
