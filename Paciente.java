package clinica;
import java.util.Vector;
/**
 *
 * @author aiko
 */
public class Paciente {
    public Paciente(){
        sintomas = new Vector(2);
        medicamentos = new Vector(2);
        examenes = new Vector(2);
    }

    //<editor-fold defaultstate="collapsed" desc="Lineas Set y Lineas Get">
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }
    
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }
    
    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }
    
    public int getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }
    
    public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getImc() {
        return imc;
    }
    
    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getOcupacion() {
        return ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPese(double pese) {
        this.peso = pese;
    }
    
    public int getPosicion() {
        return posicion;
    }
    
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public String getRecomendaciones() {
        return recomendaciones;
    }
    
    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public double getTalla() {
        return talla;
    }
    
    public void setTalla(double talla) {
        this.talla = talla;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    //</editor-fold>
    
    private int posicion;
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String ocupacion;
    Vector sintomas;
    private int frecuenciaCardiaca;
    private int frecuenciaRespiratoria;
    private double temperatura;
    private double talla;
    private double peso;
    private double imc;
    private String diagnostico;
    Vector medicamentos;
    Vector examenes;
    private String recomendaciones;
}

