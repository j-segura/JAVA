package figuras;

/* import figuras.Figura;
import figuras.Circulo;
import figuras.Rectangulo; */

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Circulo
        Circulo circulo = new Circulo(5.0);

        // Calcular y mostrar el área del círculo
        double areaCirculo = circulo.calcularArea();
        System.out.println("Área del círculo: " + areaCirculo);

        // Crear un objeto de tipo Rectangulo
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        // Calcular y mostrar el área del rectángulo
        double areaRectangulo = rectangulo.calcularArea();
        System.out.println("Área del rectángulo: " + areaRectangulo);
    }
}
