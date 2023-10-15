package EdwarActivities.Services;

import java.util.Scanner;
import EdwarActivities.Entities.Account;

public class AccountingService {

    Scanner reader = new Scanner(System.in);
    Account account = new Account();

    public AccountingService(){}

    public Account createAccount(){

        System.out.println("CREACION DE CUANTA BANCARIA");
        System.out.print("Ingrese el numero de la cuanta: ");
        account.setAccountNumber(reader.nextInt());
        System.out.print("Ingrese el DNI del cliente: ");
        account.setClientDni(reader.nextInt());
        account.setCurrentBalance(0);

        return null;

    }

    public void enterMoney(double value){
        account.setCurrentBalance(account.getCurrentBalance() + value);
        System.out.println("Monto ingresado con exito!");
    }
    
    public void withdrawMoney(double value){
        if (value > account.getCurrentBalance()) {
            System.out.println("Saldo insuficiente :(");
        } else {
            account.setCurrentBalance(account.getCurrentBalance() - value);
            System.out.println("Monto retirado con exito!");
        }
    }

    public void withdrawRapid(){
        System.out.print("Monto a retirar: ");
        double amount = reader.nextDouble();
        
        if (amount > (account.getCurrentBalance() * 0.2)){
            System.out.println("No se puede realizar operacion rapida, saldo supera el 20% del saldo total.");
        } else {
            this.withdrawMoney(amount);
        }
    }

    public void queryBalance(){
        System.out.println("Saldo actual: $" + account.getCurrentBalance());
    }

    public void queryAccountData(){
        System.out.println("Numero de cuenta: " + account.getAccountNumber());
        System.out.println("DNI del Cliente: " + account.getClientDni());
        System.out.println("Balance de cuenta: $" + account.getCurrentBalance());
    }

    public void run(){
        System.out.println("\n\nBienvenido que desea hacer: ");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Hacer una extraccion rapida");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar datos de la cuenta");
        System.out.println("6. salir");
        System.out.print("Ingrese opcion: ");
        int option = reader.nextInt();

        switch (option) {
            case 1:
                System.out.print("Monto a ingresar: ");
                this.enterMoney(reader.nextDouble());
                break;
            case 2:
                System.out.print("Monto a retirar: ");
                this.withdrawMoney(reader.nextDouble());
                break;
            case 3:
                this.withdrawRapid();
                break;
            case 4:
                this.queryBalance();
                break;
            case 5:
                this.queryAccountData();
                break;
            case 6:
                return;
            default:
                System.out.println("Te dejaron caer de pequeño verdad? -_-");
        }

        this.run();

    }
}
