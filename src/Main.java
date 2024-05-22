import java.util.Scanner;
import static java.lang.System.*;
import java.util.HashMap;
public class Main {

    public static void main(String[] args){

        out.println("1.    Balance");
        out.println("2.    Withdraw");
        out.println("3.    Deposit");
        out.println("4.    Budget");
        out.println("5.    Expenses");
        out.println("6.    Quit");
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
                out.println("Goodbye");
                System. exit(0);
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

    public static void deposit(){
        out.println("Enter amount to deposit");
        double userDeposit = 0.00;
        userDeposit = scnr.nextDouble();
        balance += userDeposit;
        out.printf("Your new balance is $%.2f", balance);

    }



    public static void withdraw(){
        double userWithdraw = 0.00;
        out.println("Enter amount to withdraw");
        userWithdraw = scnr.nextDouble();
        if (balance - userWithdraw > 0.00){
            balance -= userWithdraw;
            out.printf("Your new balance is $%.2f", balance);
        }
        else if (balance - userWithdraw < 0.00){
             out.println("Negative balance, can not withdraw");
        }
        else{
            out.println("Error: withdraw()");
        }

    }

    public static void budget(){
        out.println("What is your maximum budget?");
        double maxBudget = scnr.nextDouble();
    }

    public static void expensemap(String r, Double e){
        HashMap<String, Double> expense = new HashMap<String, Double>();
        expense.put(r , e);

    }
    //TODO: HashMap ends program
    public static void expenses(){
       Double userExpense = 0.00;
       String expenseReason;
       out.println("How much is the expense?");
       userExpense = scnr.nextDouble();
       out.println("What is the reason for the expense?");
       expenseReason = scnr.nextLine();
       expensemap(expenseReason, userExpense);
    }




}
