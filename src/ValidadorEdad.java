import java.util.Scanner;

public class ValidadorEdad {
     
    private void ValidarEdad(int edad) throws EdadInvalidaException{
        if(edad < 18){
            throw new EdadInvalidaException("Debe ser mayor de edad.");
        }
        System.out.println("Acceso permitido");
    }

    public void Iniciar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===VALIDADOR DE EDAD===");
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        try {
            ValidarEdad(edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}   


