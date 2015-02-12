package clinica;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author aiko
 */
public class OperarRegistro {
    Paciente agregarPaciente(int id, Scanner key){
        Paciente paciente = new Paciente();
        paciente.setId(id);
        System.out.println("Ingrese el nombre:");
        String nombre=key.next();
        paciente.setNombre(nombre);
        System.out.println("Ingrese Apellido");
        String apellido=key.next();
        paciente.setApellido(apellido);
        System.out.println("Ingrese la Edad");
        int edad=key.nextInt();
        paciente.setEdad(edad);
        System.out.println("Ingrese el Sexo");
        String sexo=key.next();
        paciente.setSexo(sexo);
        System.out.println("Ocupacion del Paciente");
        String ocupacion=key.nextLine();
        paciente.setOcupacion(ocupacion);
        return paciente;
    }
    
    Paciente modificarPaciente(Paciente paciente, Scanner key){
        System.out.println("Datos actuales del Registro");
        System.out.println("Id"+paciente.getId());
        System.out.println("Nombre"+paciente.getNombre());
        System.out.println("Apellido"+paciente.getApellido());
        System.out.println("Edad"+paciente.getEdad());
        System.out.println("Sexo"+paciente.getSexo());
        System.out.println("Ocupacion"+paciente.getOcupacion());
        System.out.println("**\t\t\t**");
        int objetoPosicion=paciente.getPosicion();
        System.out.println("Posicion del Expediente"+objetoPosicion);
        System.out.println("Seguro quiere modificar los datos del paciente");
        System.out.println("\t"+paciente.getNombre()+" "+paciente.getApellido()+"s/n");
        String answ1=key.next();
        if(answ1.equalsIgnoreCase("s")){
            System.out.println("\n\tIngrese los Nuevos Datos");
            paciente.setId(paciente.getId());
            System.out.println("Ingrese el nombre:");
            String nombre=key.next();
            paciente.setNombre(nombre);
            System.out.println("Ingrese Apellido");
            String apellido=key.next();
            paciente.setApellido(apellido);
            System.out.println("Ingrese la Edad");
            int edad=key.nextInt();
            paciente.setEdad(edad);
            System.out.println("Ingrese el Sexo");
            String sexo=key.next();
            paciente.setSexo(sexo);
            System.out.println("Ocupacion del Paciente");
            String ocupacion=key.nextLine();
            paciente.setOcupacion(ocupacion);
            System.out.println("Modificacion Completa.");
            return paciente;
        }else{
            return paciente;
        }
        
    }
    
    Paciente buscarPaciente(ArrayList arrayAux, int id){
        boolean ahita=false;
        int aux=-0;
        System.out.println("Bucando paciente con ID"+id);
        for(int cont=0;cont<arrayAux.size();cont++){
            Paciente paciente = (Paciente)arrayAux.get(cont);
            if(paciente.getId()==id){
                ahita=true;
                aux=cont;
                paciente.setPosicion(cont);
            }
        }
        if(ahita){
            Paciente pacientebuscado=(Paciente)arrayAux.get(aux);
            return pacientebuscado;
        }else{
            Paciente pacienteEliminar=null;
            return pacienteEliminar;
            }
        }
    
    void addSintomas(Paciente paciente){
        Scanner key=new Scanner(System.in);
        System.out.println("\nIngresar Sintomas del paciente"+paciente.getApellido());
        System.out.println("para terminar ingrese 0");
        String cadena;
        try{
            do{
                System.out.println();
                cadena=key.nextLine();
                paciente.sintomas.addElement(cadena);
            }while(!cadena.equals("0"));
        }catch(Exception Exction){}
    }
    
    void addDatosParcialFisico(Paciente parcialPaciente,Scanner key){
        System.out.println("\nExamen Fisico\t\tPaciente: "+parcialPaciente.getNombre()+""+parcialPaciente.getApellido());
        System.out.println("Frecuencia Cardiaca(laridos*minuto)");
        int cardiaca = key.nextInt();
        parcialPaciente.setFrecuenciaCardiaca(cardiaca);
        System.out.println("Frecuencia Respiratoria (respiraciones*minuto)") ;
        int respiracion = key.nextInt();
        parcialPaciente.setFrecuenciaRespiratoria(respiracion);
        System.out.println("Remperatura en Gradis Celius");
        double temperatura = key.nextDouble();
        parcialPaciente.setTemperatura(temperatura);
        System.out.println("Talla en metros");
        double talla = key.nextDouble();
        parcialPaciente.setTalla(talla);
        System.out.println("Peso en kilos");
        double peso =key.nextDouble();
        System.out.println("Indice de masa corporal");
        double imc=((double)peso/talla*talla);
        System.out.println("el  imd es"+imc);
        parcialPaciente.setImc(imc);
    }
    
    void addDiagnosticoPaciente(Paciente paciente){
        Scanner key=new Scanner(System.in);
        String diagnostico=null;
        System.out.println("Ingrese diagnotico del paciente");
        System.out.println("\t");
        try{
            diagnostico=key.nextLine();
        }
        catch (Exception exception){}
        paciente.setDiagnostico(diagnostico);
    }
    
    void addManejo(Paciente paciente){
        Scanner key =new Scanner(System.in);
        System.out.println("\nmanejo Paciente"+paciente.getApellido());
        System.out.println("Ingrese medicamentos");
        System.out.println("para terminar ingrese 0");
        String medicamentos;
        try {
            do{
            System.out.println();
            medicamentos=key.nextLine();
            paciente.medicamentos.addElement(medicamentos);
            }while(!medicamentos.equals("0"));
        } catch(Exception exception){}
        System.out.println("Ingrese examenes medicos");
        System.out.println("Ingrese 0 para terminar");
        try{
            String examMedico;
            do{
                System.out.print("");
                examMedico=key.nextLine();
                paciente.examenes.addElement(examMedico);
            }while(!examMedico.equals("0"));
            System.out.println("Ingrese las recomendaciones");
            System.out.print("");
            String recomendaciones = key.nextLine();
            paciente.setRecomendaciones(recomendaciones);
        } catch(Exception exception){}
    }
    
    void consultamedica(){
        
    }
    
    void eliminar(){
        
    }
    
    void printExpediente(Paciente paciente){
        System.out.println(" Datos Generales.");
        System.out.println("\t\t\t**");
        System.out.println(" ID "+paciente.getId());
        System.out.println(" Nombre "+paciente.getNombre());
        System.out.println(" Apellido "+paciente.getApellido());
        System.out.println(" Edad "+paciente.getEdad());
        System.out.println(" Sexo "+paciente.getOcupacion());
        System.out.println();
        System.out.println(" Datos Clinicos ");
        System.out.println("**\t\t\t**");
        System.out.println(" Sintomas ");
        for(int cont =0; cont<paciente.sintomas.size();cont++){
            System.out.println("\t"+paciente.sintomas.elementAt(cont));
        }
        System.out.println(" -Examen Fisico- ");
        System.out.println("\tFrecuencia cardiaca "+paciente.getFrecuenciaCardiaca());
        System.out.println("\tFrecuencia Respiratoria "+paciente.getFrecuenciaRespiratoria());
        System.out.println("\tTemperatura "+paciente.getTemperatura());
        System.out.println("\tTalla "+paciente.getTalla()+" (m)");
        System.out.println("\tPeso "+paciente.getPeso()+" (Kg.)");
        System.out.println("\tIndice de Masa Corporal "+paciente.getImc());
        System.out.println(" -Diagnostico- ");
        System.out.println("\t"+paciente.getDiagnostico());
        System.out.println(" -Medicamentos- ");
        for(int cont = 0;cont<paciente.medicamentos.size();cont++){
            System.out.println("\t"+paciente.medicamentos.elementAt(cont));            
        }
        System.out.println(" -Examenes de Laboratorio- ");
        for(int cont =0;cont<paciente.examenes.size();cont++){
            System.out.println("\t"+paciente.examenes.elementAt(cont));
        }
        System.out.println(" -Recomendaciones-");
        System.out.println("\t"+paciente.getRecomendaciones());
    }
}