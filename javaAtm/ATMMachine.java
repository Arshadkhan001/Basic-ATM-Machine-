import java.util.*;
class Atm {

    float Balance;
    int Pin = 8707;

    public void checkPin(){
        System.out.println("Enter Your Pin: ");
        Scanner sc = new Scanner(System.in);

        int enterpin = sc.nextInt();
        if(enterpin == Pin){
            menu();
        }else{
            System.out.println("Entered Invalid Pin");
        }

        sc.close();
    }
    @SuppressWarnings("resource")
    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withrawMoney();

        }
        else if(opt == 3){
            depositMoney();
        }
        else if(opt == 4){
            return;
        }
        else {
            System.out.println("Enter a valide choice");
        }
        sc.close();
        
    }

    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }
    public void withrawMoney(){
        System.out.println("Enter amount to withraw:");
        Scanner sc = new Scanner(System.in);

        float amount = sc.nextFloat();
        if(amount > Balance){
            System.out.println("Insuffcient Balance");

        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withraw Successfully:");
        }
        menu();
        sc.close();
    }
    public void depositMoney(){
        System.out.println("Enter The Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposite Successfully:");
        menu();
        sc.close();
       
    }
    
}




public class ATMMachine {

    public static void main(String[] args) {
        
        Atm obj = new Atm();
        obj.checkPin();
    }
}