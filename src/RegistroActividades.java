import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroActividades {

    private void Agregar(String Actividad){

        try {

            FileWriter fw = new FileWriter("Actividad.txt", true);
            fw.write(Actividad + "\n");
            fw.close();
            System.out.println("Actividad guardada");
            
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    

    private void Mostrar(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("Actividad.txt"));
            System.out.println("Actividades Registradas: ");
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);   
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("No hay actividades registradas aun.");
        }catch(IOException e){
            System.out.println("Error al leer: " + e.getMessage());
        }
    }



    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Registro de Actividades ---");
            System.out.println("1. Agregar actividad");
            System.out.println("2. Mostrar actividades");
            System.out.println("3. Salir");
            System.out.print("Elija: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpia el enter

            if (opcion == 1) {
                System.out.print("Ingrese una actividad: ");
                Agregar(sc.nextLine());
            } else if (opcion == 2) {
                Mostrar();
            }
        } while (opcion != 3);
    }
}
    

