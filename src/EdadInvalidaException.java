public class EdadInvalidaException extends Exception{

    public EdadInvalidaException(String message) {
        super(message);
    }

    public void ValidarEdad(int edad) throws EdadInvalidaException{
        if(edad < 18){
            throw new EdadInvalidaException("Debe ser mayor de edad.");
        }
        System.out.println("Acceso permitido");
    }
    
}
