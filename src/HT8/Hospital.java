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
        System.out.println("Datos del paciente prioritario:");
        Paciente pacientePrioritario;
        pacientePrioritario = (Paciente) this.ordenPrioridad.getFirst();
        System.out.println("Nombre: " + pacientePrioritario.getNombre());
        System.out.println("Sintoma: " + pacientePrioritario.getSintoma());
        System.out.println("Gravedad: " + pacientePrioritario.getCodigoEmergencia());
    }
    
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
    
    public void quitarPaciente(){
        this.pacientes.remove(pacientes.get(0));
        this.ordenPrioridad.remove();
    }
    
    
}
