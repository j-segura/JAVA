package EV_3_Ejercicios_POO.Servicios;

import EV_3_Ejercicios_POO.Entidades.Auto;

public class AutoServicio {
    
    public void cargarFichaAuto(Auto auto, String color, String modelo, int kmMotor, String dueño) {
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setKmMotor(kmMotor);
        auto.setNombreDueño(dueño);
    }

    public void modificarTitularidad(Auto auto, String nuevoDueño) {
        auto.setNombreDueño(nuevoDueño);
    }

    public void indicarTrayectoRecorrido(Auto auto, int kmRecorridos) {
        int kmActuales = auto.getKmMotor();
        auto.setKmMotor(kmActuales + kmRecorridos);
    }

    public boolean necesidadService(Auto auto) {
        return auto.getKmMotor() >= 10000;
    }

}
