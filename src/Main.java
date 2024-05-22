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
                out.println(getBalance());
            }
            else if (userInput == 2){
                System.out.println(());
            }
            else if (userInput == 3){

            }
            else{
                out.println("Error");
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

    public static void deposit(){
        out.println("Enter amount to deposit");
        double userDeposit = 0.00;
        userDeposit = scnr.nextDouble();
        balance += userDeposit;
    }

    public static double getWithdraw(){
        double userWithdraw = 0.00;
        out.println("Enter amount to withdraw");
        userWithdraw = scnr.nextDouble();


    }

    public static void withdraw(){
        double userWithdraw = getWithdraw();
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
