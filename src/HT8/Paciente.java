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
    private char codigoEmergencia;
    
    public Paciente(String nombre, String sintoma, char codigoEmergencia){
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getSintoma(){
        return this.sintoma;
    }
    
    public char getCodigoEmergencia(){
        return this.codigoEmergencia;
    }

    @Override
    public int compareTo(Paciente o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 1;
    }
}
