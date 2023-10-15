package EdwarActivities.Services;

import java.util.Scanner;
import EdwarActivities.Entities.Rectangle;

public class RectangleService {
    
    Scanner reader = new Scanner(System.in);
    Rectangle rectangle = new Rectangle();

    public RectangleService(){}

    public Rectangle createRectangle(){

        System.out.println("Este programa crea un rectangulo");
        System.out.print("Ingrese la base del rectangulo: ");
        rectangle.setBase(reader.nextFloat());
        System.out.print("Ingrese la altura del rectangulo: ");
        rectangle.setHeight(reader.nextFloat());
        return null;

    }

    public void calculateRectanglePerimeter(){

        float perimeter = (rectangle.getBase() * 2) + (rectangle.getHeight() * 2);
        System.out.printf("\nEl perímetro del rectángulo es %.2f",perimeter);

    }

    public void calculateRectangleArea(){

        double area = rectangle.getBase() * rectangle.getHeight();
        System.out.printf("\nLa superfiica del rectángulo es %.2f",area);

    }

    public void showRectangle(){

        System.out.println("\nImagen: ");

        for(int i=0 ;i<rectangle.getHeight();i++){

            if (i == 0 || i == rectangle.getHeight() - 1) {

                for (int j = 0; j < rectangle.getBase(); j++) {
                    System.out.print("*");
                }

            } else {

                System.out.print("*");
                for (int j = 1; j < rectangle.getBase() - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

            }

            System.out.println();

        }
    }

}
