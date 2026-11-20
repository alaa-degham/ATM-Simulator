import java.util.*;
public class ATMSimulator {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int correctPin=1234;
        int i=0;
        while(i<3){

            System.out.println("pleas enter 4-digit PIN");
            int pin= scan.nextInt();
            if(pin==correctPin) {
                System.out.println("correct Pin");
                break;

            }
            else{
                System.out.println("incorrect pin");
            }
            i++;
        }
        if(i==3){
            System.out.println("your account has been locked");
            return;
        }
        double initialBalance=2500.75;
        int successfulTransactions=0;
        int Choice;
        do{
            System.out.println("1-Check Balance");
            System.out.println("2-Deposit");
            System.out.println("3- Withdraw");
            System.out.println("4-Show Account Status");
            System.out.println("5-Exit");
            System.out.println("enter your choice");
            Choice=scan.nextInt();
            switch(Choice){
                case 1:System.out.println("your balance is"+initialBalance);
                break;
                case 2:{
                    System.out.println("enter your deposit amount");
                    double deposit= scan.nextDouble();
                    if(deposit<=0){
                        System.out.println("invalid amount");
                    }
                    else{
                        System.out.println("valid amount");
                        initialBalance+=deposit;
                        successfulTransactions++;
                        System.out.println("initial balance is "+initialBalance);
                    }
                    break;
                }
                case 3:{
                    System.out.println("enter your withdraw amount");
                    double withdraw=scan.nextDouble();
                    if(withdraw<=0){
                        System.out.println("transaction cancelled");
                    }
                    else if(withdraw>initialBalance){
                        System.out.println("insufficient balance");
                    }
                    else{
                        initialBalance-=withdraw;
                        successfulTransactions++;
                        System.out.println("your balance now is"+initialBalance);

                        if (initialBalance==0){
                            System.out.println("transactions cancelled");
                        }

                    }
                    break;

                }
                case 4:{
                    if(initialBalance>=5000){
                        System.out.println("VIP Customer");
                    }
                    else if(initialBalance>=1000){
                        System.out.println("Regular Customer");
                    }
                    else{
                        System.out.println("low balance");
                    }
                    System.out.println("Successful transactions is"+successfulTransactions);
                    break;
                }
                case 5:{
                    System.out.println("thank you for using our ATM");
                    break;
                }

                default:

             System.out.println("invalid option");

                if(Choice==5)
        break;
        }

        }while (Choice!=5);

        }

        }