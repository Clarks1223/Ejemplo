import java.util.Scanner;

public class Metodos {
    Persona personas =new Persona();
    Scanner sc=new Scanner(System.in);

    public void llenarDatos(){
        String aux,na;
        double aux2;
        int aux3;
        System.out.println("Ingrese su nombre: ");
        aux=sc.nextLine();
        personas.setNombre(aux);
        System.out.println("Ingrese su edad: ");
        aux3=sc.nextInt();
        personas.setEdad(aux3);
        na=sc.nextLine();
        System.out.println("Ingrese DNI: ");
        aux=sc.nextLine();
        personas.setDni(aux);
        System.out.println("Ingrese su peso(KG): ");
        aux2=sc.nextDouble();
        personas.setPeso(aux2);
        System.out.println("Ingrese su altura(m): ");
        aux2=sc.nextDouble();
        personas.setAltura(aux2);
        System.out.println();
    }

    public void mostDatos(){
        System.out.println("Nombre: "+personas.getNombre());
        System.out.println("Edad: "+personas.getEdad());
        System.out.println("DNI: "+personas.getDni());
        System.out.println("Sexo: "+personas.SEXO);
        System.out.println("Peso: "+personas.getPeso());
        System.out.println("Altura: "+personas.getAltura());
    }

    public boolean mayorEdad(){
        boolean ok=false;
        if (personas.getEdad() >= 18) {
            ok = true;
        }
        return ok;
    }
}
