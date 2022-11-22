public class Main {
    public static void main(String[] args) {
        Metodos m1= new Metodos();
        m1.llenarDatos();
        m1.mostDatos();
        if (m1.mayorEdad()==true){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }
}