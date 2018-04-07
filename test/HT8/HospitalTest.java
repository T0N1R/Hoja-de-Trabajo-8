/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antonio
 */
public class HospitalTest {
    
    public HospitalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registrarPaciente method, of class Hospital.
     */
    @Test
    public void testRegistrarPaciente() {
        System.out.println("registrarPaciente");
        String nombre = "David";
        String sintoma = "fiebre";
        String codigoEmergencia = "A";
        Hospital instance = new Hospital();
        Hospital resp = new Hospital();
        resp.registrarPaciente("David", "fiebre", "A");
        instance.registrarPaciente(nombre, sintoma, codigoEmergencia);
        // TODO review the generated test code and remove the default call to fail.
        if (resp == instance){
          fail("The test case is a prototype.");  
        }
        
    }

    /**
     * Test of mostrarPrimero method, of class Hospital.
     */
    @Test
    public void testMostrarPrimero() {
        System.out.println("mostrarPrimero");
        Hospital instance = new Hospital();
        instance.registrarPaciente("David", "fiebre", "A");
        instance.mostrarPrimero();
        if (instance == null){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of mostrarCola method, of class Hospital.
     */
    @Test
    public void testMostrarCola() {
        System.out.println("mostrarCola");
        Hospital instance = new Hospital();
        instance.registrarPaciente("David", "fiebre", "A");
        instance.mostrarCola();
        if(instance == null){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of quitarPaciente method, of class Hospital.
     */
    @Test
    public void testQuitarPaciente() {
        System.out.println("quitarPaciente");
        Hospital instance = new Hospital();
        instance.registrarPaciente("David", "fiebre", "A");
        instance.quitarPaciente();
        if (instance == null){
        fail("The test case is a prototype.");
        }
    }
    
}
