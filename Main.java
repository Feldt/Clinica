
package clinica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aiko
 */
public class Main {
    public static void main(String[] args) {
        int id=1;
        int salir =0, salir2=0;
        Scanner key = new Scanner(System.in);
        ArrayList ListaPaciente = new ArrayList();
        OperarRegistro operarregistro = new OperarRegistro();
        OpcionesPaciente opcionespaciente = new OpcionesPaciente();
        do{
            int opcionMenu1=opcionespaciente.printMenu1(key);
            switch(opcionMenu1){
                case 1:
                    Paciente paciente = operarregistro.agregarPaciente(id, key);
                    ListaPaciente.add(paciente);
                    id++;
                    break;
                case 2:
                    System.out.println("\nIngrese el ID del Paciente");
                    int buscar = key.nextInt();
                    Paciente pacientemodificar = operarregistro.buscarPaciente(ListaPaciente, buscar);
                    if(pacientemodificar==null)
                        System.out.println("--El Registro no esta--");
                    else 
                        pacientemodificar=operarregistro.modificarPaciente(pacientemodificar, key);
                    break;
                case 3:
                    System.out.println("\nIngrese el Numero de Registro de Paciente");
                    int busquedaId=key.nextInt();
                    Paciente pacieneteeliminar = operarregistro.buscarPaciente(ListaPaciente, busquedaId);
                    if(pacieneteeliminar==null)
                        System.out.println("-No hay Registro-");
                    else{
                        int posicion = pacieneteeliminar.getPosicion();
                        System.out.println("Numero del Paciente");
                        System.out.println("Realmente quiere eliminar al paciente");
                        System.out.println(" "+pacieneteeliminar.getNombre()+" "+pacieneteeliminar.getApellido()+" s/n");
                        String si_no=key.next();
                        if(si_no.equalsIgnoreCase("s")){
                            ListaPaciente.remove(posicion);
                            System.out.println("-Registro Borrado-");                        
                        }
                    }
                    break; 
                    
                case 4:
                    System.out.println(" Ingrese el ID del paciente ");
                    
                    
              }
        }while (salir==0); // modificar esto
    }
}
