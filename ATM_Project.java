package Core_Java_Projects;
import java.util.Scanner;
public class ATM_Project {
    float balance;
    int pin;
    void menu(){
        Scanner sc=new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("Please select the transaction");
        System.out.println("FUND TRANSFER :1                              DEPOSIT MONEY :2");
        System.out.println("PIN CHANGE :3                                 WITHDRAWL :4");
        System.out.println("EXIT :5                                      BALANCE ENQUIRY :6");

        //switch using
        System.out.println("Enter here :");
        int transaction_button = sc.nextInt();

        switch(transaction_button){
            case 1:
                fund_transfer();
                break;
            case 2:
                deposit_money();
                break;
            case 3:
                pin_change();
                break;
            case 4:
                withdrawl();
                break;
            case 5:
                exits();
                break;
            case 6:
                balance_enquiry();
                break;
            default:
                System.out.println("Please choose only visible button");
                break;
        }
    }

    void heading(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To :)");
        System.out.println("Union Bank of India");
        System.out.println("------------------------");
        System.out.println("Enter your pin no :");
        pin = sc.nextInt();

        // Body Part
        System.out.println("Please Select your Language");
        System.out.println("ENGLISH :- Press 1\n");
        System.out.println("HINDI :- Press 2\n");
        System.out.println("SET ATM PIN : GREEN PIN :- Press 3\n");
        int body = sc.nextInt();
        if(body == 1){
            english();
        }
        else if(body == 2){
            hindi();
        }
        else if(body == 3){
            green_pin();
        }
    }

    void english(){
        menu();
    }
    void hindi(){
        menu();
    }
    void green_pin(){
       // green();
    }

    void fund_transfer(){
        System.out.println("server down");
        menu_exit();
    }

    void deposit_money(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you money deposit :");
        float current_deposit = sc.nextInt();
        balance = balance + current_deposit;
        System.out.println("Your money deposit successfully "+balance+"/-");
        menu_exit();
    }

    void pin_change(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your old pin no :");
        int old_pin = sc.nextInt();
        if(old_pin == pin){
            System.out.println("Enter your set new pin :");
            int set_pin = sc.nextInt();
            pin = set_pin;
            System.out.println("Your pin set successfully");
        }
        else{
            System.out.println("Please type here correct pin no");
        }
        menu_exit();
    }

    void withdrawl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the transaction");
        System.out.println("SAVING ACCOUNT          Press 1");
        System.out.println("CURRENT ACCOUNT         Press 2");
        int wsc = sc.nextInt();
        if (wsc == 1){
            System.out.println("Enter your money (How Much you taken?)");
            float amount = sc.nextFloat();
            if (amount > balance) {
                System.out.println("Insufficient Balance");
            } else {
                balance = balance - amount;
                System.out.println("Money Withdraw Successful");
                System.out.println("-------------");
                System.out.println("Available Balance :"+balance+"/-");
            }
            menu_exit();
        }else if(wsc == 2){
            System.out.println("Enter your money (How Much you taken?)");
            float amount = sc.nextFloat();
            if (amount > balance) {
                System.out.println("Insufficient Balance");
            } else {
                balance = balance - amount;
                System.out.println("Money Withdraw Successful");
            }
            menu_exit();
        }else{
            System.out.println("Choose only 1 and 2");
        }
    }

    void exits(){
        System.out.println("-------------* * *-------------");
        System.out.println("        Thank you       ");
    }

    void balance_enquiry(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin :");
        int enquiry = sc.nextInt();
        if(pin == enquiry){
            System.out.println("Your total balance is "+balance+"/-");
        }
        else{
            System.out.println("Please type here correct pin no");
        }
        menu_exit();
    }

    void menu_exit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Continues Using [Y/N]");
        char ch = sc.next().charAt(0);
        if(ch == 'Y' || ch == 'y'){
            menu();
        }else if(ch == 'N' || ch == 'n'){
            exits();
        }
    }


    // main body
    public static void main(String[] args) {
        ATM_Project ap = new ATM_Project();
        ap.heading();
    }
}
