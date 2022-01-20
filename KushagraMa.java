import java.util.Scanner;
// Getting Started with Array      Date -18/01/2021
// Array Declaration
// Array initialize
//
//1)You are given an ATM of a bank,Write a program in interface to show your password which you are enter in valid as a ...

public class KushagraMa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int setPassword = 81266;
        System.out.println("Enter Your First Name :");
        String firstName = scanner.nextLine();
        System.out.println("Enter last Name");
        String lastName = scanner.nextLine();
        System.out.println("Hi," + firstName +" " + lastName + " nice to meet you!. Today,I am allow you to enter the password for getting the renault information :");

        for (int i = 0; i < 3; i++) {


        System.out.println("Enter Your Password :");
        int password = scanner.nextInt();
        if(password==setPassword){
            System.out.println("Dear Kushagra Gupta , Your all emails are as:\n kushagraguptafzd02@gmail.com\n password-kushagratechnicals2003");
            System.out.println("If you want to set new password --\n enter 1 for change password \n 0 to not change password and make as usual");
            int modification= scanner.nextInt();
            if(modification==1){
                System.out.println("Enter Your New Password to work :");
                int newPassword = scanner.nextInt();
                setPassword = newPassword;
                System.out.println("Congratulations , Your Password is changed and new password is -" + setPassword + "Kindly check");
                break;
            }
            else{
                System.out.println("Thank You!");
                break;
            }

        }
        else{
            System.out.println("Again Thank You!");
        }}


    }
}