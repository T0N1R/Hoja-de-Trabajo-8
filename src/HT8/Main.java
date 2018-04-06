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
            System.out.println("-------------------------------------");
            System.out.println("Bienvenido al sistema de colas del Hospital Las Americas");
            System.out.println("Elija la opción a realizar: ");
            System.out.println("1. Ingresar paciente a la cola");
            System.out.println("2. Paciente que debe ser atentido (solo mostrar)");
            System.out.println("3. Quitar a paciente atendido");
            System.out.println("4. Cola de pacientes");
            System.out.println("5. Consultar niveles de gravedad");
            System.out.println("6. Salir");
            System.out.println("-------------------------------------");
            int opcion = scan.nextInt();
            scan.nextLine();
            
            switch(opcion){
                
                case 1:{
                    System.out.print("Nombre de paciente: ");
                    String nombre = scan.nextLine();
                    System.out.println("");
                    System.out.print("Sintoma: ");
                    String sintoma = scan.nextLine();
                    System.out.println("");
                    System.out.print("Nivel de Gravedad: ");
                    String gravedad = scan.nextLine();
                    
                    if(gravedad.equals("A") || gravedad.equals("B") || gravedad.equals("C") || gravedad.equals("D") || gravedad.equals("E")){
                        hospital.registrarPaciente(nombre, sintoma, gravedad);
                        System.out.println("Se ha ingresado el paciente a la cola");
                        System.out.println("-------------------------------------");
                        System.out.println("-------------------------------------");
                    } else{
                        System.out.println("-------------------------------------");
                        System.out.println("El nivel de gravedad elegido no es valido, presione 5 para consultar los niveles de gravedad ");
                        System.out.println("-------------------------------------");
                    }
                    
                    
                    break;
                }
                
                case 2:{
                    hospital.mostrarPrimero();
                    break;
                }
                
                case 3:{
                    hospital.quitarPaciente();
                    break;
                }
                
                case 4:{
                    hospital.mostrarCola();
                    break;
                }
                
                case 5:{
                    System.out.println("A: REANIMACION");
                    System.out.println("B: EMERGENCIA");
                    System.out.println("C: URGENTE");
                    System.out.println("D: MENOS URGENTE");
                    System.out.println("E: NO URGENTE");
                    break;
                }
                
                case 6:{
                    estado = false;
                    break;
                }
                
                default:{
                    System.out.println("No existe la opción seleccionada");
                    break;
                }
                
            }
        }
        
    }
    
}
