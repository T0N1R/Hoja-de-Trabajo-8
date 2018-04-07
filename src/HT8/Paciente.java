/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT8;

/**
 *
 * @author esteb
 */
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private String codigoEmergencia;
    
    /**
     *
     * @param nombre recibe el nombre del paciente.
     * @param sintoma descripcion de lo que siente.
     * @param codigoEmergencia nivel de prioridad para ser atendido.
     * Este metodo es el constructor de la clase.
     */
    public Paciente(String nombre, String sintoma, String codigoEmergencia){
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
    }
    
    /**
     *
     * @return
     * get del nombre del paciente.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     *
     * @return
     * get del sintoma del paciente.
     */
    public String getSintoma(){
        return this.sintoma;
    }
    
    /**
     *
     * @return
     * get del codigo de emergencia del paciente.
     */
    public String getCodigoEmergencia(){
        return this.codigoEmergencia;
    }

    @Override
    public int compareTo(Paciente o) {
        return  this.codigoEmergencia.compareTo(o.getCodigoEmergencia());
    }
}
