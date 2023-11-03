package EV_3_Ejercicios_POO.Servicios;

import EV_3_Ejercicios_POO.Entidades.Triangulo;

public class TrianguloServicio {

    public double calcularArea(Triangulo triangulo) {
        // Área de un triángulo isósceles: (base * altura) / 2
        double altura = Math
                .sqrt((triangulo.getLado() * triangulo.getLado()) - ((triangulo.getBase() * triangulo.getBase()) / 4));
        return (triangulo.getBase() * altura) / 2;
    }

    public double calcularPerimetro(Triangulo triangulo) {
        // Perímetro de un triángulo isósceles: 2 * lado + base
        return 2 * triangulo.getLado() + triangulo.getBase();
    }

    public Triangulo encontrarTrianguloConMayorArea(Triangulo[] triangulos) {
        if (triangulos.length == 0) {
            return null;
        }

        Triangulo trianguloMayorArea = triangulos[0];
        double areaMayor = calcularArea(triangulos[0]);

        for (int i = 1; i < triangulos.length; i++) {
            double areaActual = calcularArea(triangulos[i]);
            if (areaActual > areaMayor) {
                areaMayor = areaActual;
                trianguloMayorArea = triangulos[i];
            }
        }

        return trianguloMayorArea;
    }

}
