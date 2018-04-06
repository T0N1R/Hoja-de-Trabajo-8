/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT8;

//import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author esteb
 */
public class Hospital {
    private Vector<Paciente> pacientes;
    private VectorHeap ordenPrioridad;
    
    public Hospital(){
        this.pacientes = new Vector<Paciente>();
    }
    
    public void registrarPaciente(String nombre, String sintoma, char codigoEmergencia){
        Paciente nuevoPaciente = new Paciente(nombre, sintoma, codigoEmergencia);
        this.pacientes.add(nuevoPaciente);
        this.ordenPrioridad = new VectorHeap(this.pacientes);
    }
    
    public void mostrarPrimero(){
        System.out.println(pacientes.get(0));
    }
    
    public void mostrarCola(){
        
    }
}
