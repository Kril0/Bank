import java.util.Scanner;
import static java.lang.System.*;
import java.util.HashMap;
public class Main {

    public static void main(String[] args){

        menu();

        }


static Scanner scnr = new Scanner(in);
    static double balance = 0.00;
    static HashMap<String, Double> expenses = new HashMap<String, Double>();


    public static void menu(){
        System.out.println("1.    Balance");
        System.out.println("2.    Withdraw");
        System.out.println("3.    Deposit");
        System.out.println("4.    Budget");
        System.out.println("5.    Expenses");
        System.out.println("6.    See expenses");
        System.out.println("7.    Quit");
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
        else if (userInput == 4){
            budget();
        }
        else if (userInput == 5){
            expenses();
        }
        else if (userInput == 6){
            getExpenses();
        }
        else if (userInput == 7){
            System.out.println("Goodbye");
            System. exit(0);
        }
        else{
            System.out.println("Error: Invalid input");
        }
    }

    public static double getBalance(){
        return balance;
    }

    public static void deposit(){
        System.out.println("Enter amount to deposit");
        double userDeposit = 0.00;
        userDeposit = scnr.nextDouble();
        balance += userDeposit;
        System.out.printf("Your new balance is $%.2f", balance);

    }



    public static void withdraw(){
        double userWithdraw = 0.00;
        System.out.println("Enter amount to withdraw");
        userWithdraw = scnr.nextDouble();
        if (balance - userWithdraw > 0.00){
            balance -= userWithdraw;
            System.out.printf("Your new balance is $%.2f", balance);
        }
        else if (balance - userWithdraw < 0.00){
            System.out.println("Negative balance, can not withdraw");
        }
        else{
            System.out.println("Error: withdraw()");
        }

    }

    public static void budget(){
        System.out.println("What is your maximum budget?");
        double maxBudget = scnr.nextDouble();
    }

    public static void expensemap(String reason, Double expense){
        expenses.put(reason , expense);
        System.out.println(expense);
    }

    //TODO: get expenses and output them
    public static void getExpenses(){
        for (int i = 0; i < expenses.size(); ++i){
            System.out.print();
        }
    }

    //FIXME: adding 2 word string in expenseReason crashes program
    public static void expenses(){
       Double userExpense = 0.00;
       String expenseReason;
        System.out.println("Type a negative number to go back to menu");
        do{
            System.out.println("\nHow much is the expense?");
            userExpense = scnr.nextDouble();
            if (userExpense < 0){
                System.out.println("Going back to menu");
                menu();
            }
            System.out.println("What is the reason for the expense?");
            expenseReason = scnr.next();
            System.out.println(expenseReason);
            expensemap(expenseReason, userExpense);
        }while(true);



    }



    }





