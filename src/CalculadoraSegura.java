import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSegura {

    public void Iniciar(){
        Scanner sc = new Scanner(System.in);


        System.out.println("=========================");
        System.out.println("        CAlCULADORA      ");
        System.out.println("=========================");
        System.out.println(" 1. Sumar");
        System.out.println(" 2. Restar");
        System.out.println(" 3. Multiplicar");
        System.out.println(" 4. Dividir");
        System.out.println("=========================");

        try {
            System.out.println("Elija la opcion: ");
            int op = sc.nextInt();
            sc.nextLine();

            System.out.println("Primer numero: ");
            double n1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Segundo numero: ");
            double n2 = sc.nextDouble();
            sc.nextLine();

            double Resultado = 0;

            switch (op) {
                case 1:
                    Resultado = n1 + n2;

                    break;

                case 2:
                    Resultado = n1 - n2;
                    break;

                case 3: 
                    Resultado = n1 * n2;
                    break;

                case 4:
                    if (n2 == 0) throw new ArithmeticException("No se puede dividir entre 0");
                    Resultado = n1 / n2;
                    break;
            
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

            System.out.println("Resultado: " + Resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        }catch(InputMismatchException e){
            System.out.println("Error: Ingrese solo numeros");
        }
        finally{
            /System.out.println("Proceso finalizado.");
        }
    }
    
}
