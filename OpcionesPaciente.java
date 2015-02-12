package clinica;

import java.util.Scanner;

/**
 *
 * @author aiko
 */
public class OpcionesPaciente {
    int printMenu1(Scanner key){
        System.out.println("\n\n\t\t\t\t -Registro de Paciente-");
        System.out.println(" 1 Agregar un Nuevo Registro:");
        System.out.println(" 2 Modificar un Registro:");
        System.out.println(" 3 Eliminar un Registro:");
        System.out.println(" 4 Consulta Medica:");
        System.out.println(" 5 Ver Expediente completo:");
        System.out.println(" 6 Salir:");
        System.out.println(" Ingrese una Opcion:");
        int regresa = key.nextInt();
    return regresa;
    }    
    
    int printMenu2(Scanner key){
        System.out.println("\n\n\t\t\t\t -Consulta Medica-");
        System.out.println(" 1 Sintomas.");
        System.out.println(" 2 Datos de Examen Fisico.");
        System.out.println(" 3 diagnostico.");
        System.out.println(" 4 Manejo Clinico.");
        System.out.println(" 5 Salir.");
        System.out.println(" Ingrese una Opcion: ");
        return 0;
    }
}