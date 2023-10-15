package EdwarActivities.Services;

import java.util.Scanner;
import EdwarActivities.Entities.Operation;

public class OperationService {

    public OperationService(){}

    Scanner reader = new Scanner(System.in);
    Operation operation = new Operation();

    public Operation createOperation(){

        System.out.println("Este programa hace operaciones de dos numeros");
        System.out.print("Numero 1: ");
        operation.setNumber1(reader.nextFloat());
        System.out.print("Numero 2: ");
        operation.setNumber2(reader.nextFloat());

        return null;

    }

    public void add(){
        float add = operation.getNumber1() + operation.getNumber2();
        System.out.println("La suma es: " + add );
    }

    public void subtract(){
        float subtract = operation.getNumber1() - operation.getNumber2();
        System.out.println("La suma es: " + subtract );
    }
    
}
