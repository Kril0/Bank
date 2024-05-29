import java.sql.Connection;
import java.sql.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.HashMap;
import java.io.FileWriter;

public class Main{

    public static void main(String[] args)throws IOException {
        DB_connect();
        menu();

    }


    static Scanner scnr = new Scanner(in);
    static double balance = 0.00;
    static HashMap<String, Double> expense = new HashMap<String, Double>();


public static void DB_connect() {
    try {


        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "livelogan4");
        Statement statement = connection.createStatement();

        ResultSet resultset = statement.executeQuery("select * from bank_info");

        while (resultset.next()) {
            System.out.println(resultset.getString("bank_balance"));
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}


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

    public static void getBalance(){
        System.out.println("\nYour balance is " + balance + "\n");
        menu();
    }

    public static void deposit(){
        System.out.println("Enter negative to go to menu");
        do {
            System.out.println("Enter amount to deposit");
            double userDeposit = 0.00;
            userDeposit = scnr.nextDouble();
            if (userDeposit < 0){
                menu();
                break;
            }
            else {
                balance += userDeposit;
                System.out.printf("Your new balance is $%.2f ", balance);
                System.out.println();
            }
        }while(true);
    }



    public static void withdraw(){
        double userWithdraw = 0.00;
        System.out.println("Enter negative to go to menu");
        do {
            System.out.println("Enter amount to withdraw");
            userWithdraw = scnr.nextDouble();
            if (userWithdraw < 0){
                menu();
                break;
            }
            else if (userWithdraw < 0){
                menu();
                break;
            }
            else if (balance - userWithdraw > 0.00) {
                balance -= userWithdraw;
                System.out.printf("Your new balance is $%.2f", balance);
            } else if (balance - userWithdraw < 0.00) {
                System.out.println("Negative balance, can not withdraw");
            }

            else {
                System.out.println("Error: withdraw()");
            }
        }while(true);

    }

    public static void budget(){
        System.out.println("What is your maximum budget?");
        double maxBudget = scnr.nextDouble();
        menu();
    }

//    TODO: connect budget to expenses, deposit, and withdraw


    public static void putExpense(String reason, Double e){
        expense.put(reason , e);
    }

    public static void getExpenses(){
        for (String i : expense.keySet()){
            System.out.print(i + "\t");
            System.out.printf("$%.2f", expense.get(i));
            System.out.println("");
            menu();
        }
    }


    public static void expenses(){
        Double userExpense = 0.00;
        String expenseReason;
        System.out.println("Enter negative to go to menu");
        do{
            System.out.println("\nHow much is the expense?");
            userExpense = scnr.nextDouble();
            if (userExpense < 0){
                System.out.println("Going back to menu");
                menu();
                break;
            }


            scnr.nextLine();

            System.out.println("\nWhat is the reason for the expense?");
            expenseReason = scnr.nextLine();
            putExpense(expenseReason, userExpense);
        }while(true);



    }





}




