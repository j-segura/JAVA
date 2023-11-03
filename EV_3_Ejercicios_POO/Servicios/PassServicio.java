package EV_3_Ejercicios_POO.Servicios;

import java.util.Scanner;

import EV_3_Ejercicios_POO.Entidades.Pass;

public class PassServicio {

    Scanner scanner = new Scanner(System.in);
    Pass pass = new Pass(0, "", "por_defect");

    public PassServicio(){}

    public void crearPass() {
        

        System.out.print("Ingrese su contraseña (debe tener 10 caracteres): ");
        String password = scanner.nextLine();

        if (password.length() == 10) {

            pass.setPass(password);
            System.out.println("Contraseña creada con éxito.");

        } else {

            System.out.println("La contraseña debe tener exactamente 10 caracteres.");

        }
        
    }

    public String analizarPass() {

        String password = pass.getPass();

        if (password.contains("z")) {

            if (password.chars().filter(ch -> ch == 'a').count() >= 2) {

                return "ALTO";

            } else {

                return "MEDIO";

            }

        } else {

            return "BAJO";

        }

    }

    public void modificarNombre(String password) {

        String oldPassword = pass.getPass();

        if (oldPassword.equals(password)) {

            System.out.print("Ingrese su nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();
            pass.setNombre(nuevoNombre);
            System.out.println("Nombre modificado con éxito.");

        } else {
    
            System.out.println("Contraseña incorrecta. No se permite modificar el nombre.");

        }
    }

    public void modificarDNI(String password) {

        String oldPassword = pass.getPass();

        if (oldPassword.equals(password)) {
    
            System.out.print("Ingrese su nuevo DNI: ");
            int nuevoDNI = scanner.nextInt();
            pass.setDni(nuevoDNI);
            System.out.println("DNI modificado con éxito.");

        } else {

            System.out.println("Contraseña incorrecta. No se permite modificar el DNI.");

        }

    }

    public void correrPrograma(){

        System.out.println("Menú de opciones:");
            System.out.println("A) Ingresar la contraseña");
            System.out.println("B) Mostrar el nivel de la contraseña");
            System.out.println("C) Modificar nombre");
            System.out.println("D) Modificar DNI");
            System.out.println("E) Salir");

        System.out.print("Elija una opción: ");
        String opcion = scanner.nextLine().toUpperCase();

        switch (opcion) {
            case "A":
                crearPass();
                break;
            case "B":
                String nivel = analizarPass();
                System.out.println("Nivel de la contraseña: " + nivel);
                break;
            case "C":
                System.out.print("Ingrese su contraseña anterior: ");
                String passAnterior = scanner.nextLine();
                modificarNombre(passAnterior);
                break;
            case "D":
                System.out.print("Ingrese su contraseña anterior: ");
                String passAnteriorDNI = scanner.nextLine();
                modificarDNI(passAnteriorDNI);
                break;
            case "E":
                System.exit(0);
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }

        correrPrograma();

    }
    
}
