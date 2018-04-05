package HT8;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hospital hospital = new Hospital();
        
        boolean estado = true;
        Scanner scan = new Scanner(System.in);

        
        while (estado == true){
            System.out.println("Bienvenido al sistema de colas del Hospital Las Americas");
            System.out.println("Elija la opción a realizar: ");
            System.out.println("1. Ingresar paciente a la cola");
            System.out.println("2. Paciente que debe ser atentido (solo mostrar)");
            System.out.println("3. Eliminar a paciente atendido");
            System.out.println("4. Cola de pacientes");
            System.out.println("Consultar niveles de gravedad");
            int opcion = scan.nextInt();
            
            switch(opcion){
                
                case 1:{
                    System.out.print("Nombre de paciente: ");
                    String nombre = scan.nextLine();
                    System.out.print("Sintoma: ");
                    String sintoma = scan.nextLine();
                    System.out.print("Nivel de Gravedad");
                    char gravedad = scan.next().charAt(0);
                    
                    hospital.registrarPaciente(nombre, sintoma, gravedad);
                    
                    System.out.println("Se ha ingresado el paciente a la cola");
                    System.out.println("-------------------------------------");
                    System.out.println("-------------------------------------");
                    
                    break;
                }
                
                case 2:{
                    
                    break;
                }
                
                case 3:{
                    
                    break;
                }
                
                case 4:{
                    
                    break;
                }
                
            }
        }
        
    }
    
}
