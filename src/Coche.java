public class Coche {
    //atributos
    String color;
    String marca;
    int km;
    //constructor
    public Coche(){
        color="";
        marca="";
        km=0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}