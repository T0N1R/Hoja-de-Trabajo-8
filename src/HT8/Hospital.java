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
    
    /**
     *Este metodo es el constructor de la clase en donde se instancia el vector de tipo paciente.
     */
    public Hospital(){
        this.pacientes = new Vector<Paciente>();
        
    }
    
    /**
     *
     * @param nombre pasa el nombre del paciente.
     * @param sintoma descripcion de lo que siente el paciente.
     * @param codigoEmergencia codigo de emergencia que determina el que maneja el programa para catalogar el nivel de prioridad.
     */
    public void registrarPaciente(String nombre, String sintoma, String codigoEmergencia){
        Paciente nuevoPaciente = new Paciente(nombre, sintoma, codigoEmergencia);
        this.pacientes.add(nuevoPaciente);
        this.ordenPrioridad = new VectorHeap(this.pacientes);
    }
    
    /**
     *Muestra el paciente prioritario.
     */
    public void mostrarPrimero(){
        System.out.println("Datos del paciente prioritario:");
        Paciente pacientePrioritario;
        pacientePrioritario = (Paciente) this.ordenPrioridad.getFirst();
        System.out.println("Nombre: " + pacientePrioritario.getNombre());
        System.out.println("Sintoma: " + pacientePrioritario.getSintoma());
        System.out.println("Gravedad: " + pacientePrioritario.getCodigoEmergencia());
    }
    
    /**
     *Muestra la lista completa en orden de los pacientes.
     */
    public void mostrarCola(){
        Vector<Paciente> pacientesOrdenados;
        pacientesOrdenados = (Vector<Paciente>) this.ordenPrioridad.getData();
        for (int i = 0; i < pacientesOrdenados.size(); i++){
            System.out.println("Paciente No. " + String.valueOf(i + 1));
            System.out.println("Nombre: " + pacientesOrdenados.get(i).getNombre());
            System.out.println("Sintoma: " + pacientesOrdenados.get(i).getSintoma());
            System.out.println("Gravedad: " + pacientesOrdenados.get(i).getCodigoEmergencia());
        }
    }
    
    /**
     *Remueve el paciente prioritario luego de ser atendido.
     */
    public void quitarPaciente(){
        this.pacientes.remove(pacientes.get(0));
        this.ordenPrioridad.remove();
    }
    
    
}
