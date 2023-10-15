package EdwarActivities.Services;

import java.util.Scanner;
import EdwarActivities.Entities.Circle;

public class CircleService {

    public CircleService(){}

    Scanner reader = new Scanner(System.in);
    Circle circle = new Circle();

    public Circle createCircle(){

        System.out.println("Este programa crea un circulo");
        System.out.print("Ingrese el radio del circulo: ");
        circle.setRadio(reader.nextDouble());

        return null;

    }
    
    public void calculateCircleArea(){
        String result = "El area del circulo es: " + Math.PI * Math.pow(circle.getRadio(), 2);
        System.out.println(result);
    }

    public void calculateCirclePerimeter(){
        String result = "El perimetro del circulo es: " +  2*Math.PI*(circle.getRadio());
        System.out.println(result);
    }

}
