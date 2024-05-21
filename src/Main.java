import java.util.Scanner;
public class Main {
    public static void main(String[] args){

    }
static Scanner scnr = new Scanner(System.in);
    static double balance = 0.00;
    public static void bank(){
        double totalExpenses = 0.00;
        double balance = 0.00;
    }

    public static double getBalance(double balance){
        return balance;
    }

    public static void deposit(){
        System.out.println("Enter amount to deposit");
        double userDeposit = 0.00;
        userDeposit = scnr.nextDouble();
        balance += userDeposit;
    }

    public static void withdraw(){
        System.out.println("Enter amount to withdraw");
        double userWithdraw = 0.00;
        userWithdraw = scnr.nextDouble();
        balance -= userWithdraw;

    }




}
