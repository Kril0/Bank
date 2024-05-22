import java.util.Scanner;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args){

        out.println("1.    Balance");
        out.println("2.    Withdraw");
        out.println("3.    Deposit");
        out.println("4.    Quit");
        int userInput = scnr.nextInt();

            if (userInput == 1){
                getBalance();
            }
            else if (userInput == 2){
                withdraw();
            }
            else if (userInput == 3){
                deposit();
            }
            else{
                out.println("Error: Invalid input");
            }
        }


static Scanner scnr = new Scanner(in);
    static double balance = 0.00;
    public static void bank(){
        double totalExpenses = 0.00;
        double balance = 0.00;
    }

    public static double getBalance(){
        return balance;
    }

    //TODO: Make value have $ and 2 decimal
    public static void deposit(){
        out.println("Enter amount to deposit");
        double userDeposit = 0.00;
        userDeposit = scnr.nextDouble();
        balance += userDeposit;
        out.println("Your new balance is " + balance);

    }



    public static void withdraw(){
        double userWithdraw = 0.00;
        out.println("Enter amount to withdraw");
        userWithdraw = scnr.nextDouble();
        if (balance - userWithdraw > 0.00){
            balance -= userWithdraw;
            out.println("Your new balance is " + balance);
        }
        else if (balance - userWithdraw < 0.00){
             out.println("Negative balance, can not withdraw");
        }
        else{
            out.println("Error: withdraw()");
        }

    }




}
