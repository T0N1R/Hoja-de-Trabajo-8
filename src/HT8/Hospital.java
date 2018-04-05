/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT8;

import java.util.ArrayList;

/**
 *
 * @author esteb
 */
public class Hospital {
    private ArrayList<Paciente> pacientes;
    private VectorHeap ordenPrioridad;
    
    public Hospital(){
        this.pacientes = new ArrayList<Paciente>();
        this.ordenPrioridad = new VectorHeap();
    }
    
    public void registrarPaciente(String nombre, String sintoma, char codigoEmergencia){
        Paciente nuevoPaciente = new Paciente(nombre, sintoma, codigoEmergencia);
        this.pacientes.add(nuevoPaciente);
    }
}
