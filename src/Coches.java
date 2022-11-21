import java.sql.SQLOutput;

public class Coches {
    Coche autos = new Coche();

    public void autoMafer(){
        System.out.println("Auto de mafer");
        autos.setColor("Rojo");
        autos.setKm(12);
        autos.setMarca("Ferrari");
        System.out.println("El auto de mafer es de color: "+autos.getColor());
        System.out.println("El auto de mafer es de marca: "+autos.getMarca());
        System.out.println("El auto de mafer a recorrido: "+autos.getKm());
    }
    public void autoPablo(){
        System.out.println("Auto de Pablo");
        autos.setMarca("Audi");
        autos.setColor("Blanco");
        autos.setKm(100);
        System.out.println("El auto de Pablo es de color: "+autos.getColor());
        System.out.println("El auto de Pablo es de marca: "+autos.getMarca());
        System.out.println("El auto de Pablo a recorrido: "+autos.getKm());
    }
}
