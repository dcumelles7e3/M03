package m3.uf5.camises;

public class Camisa {

    private String talla;
    private String color;

    public Camisa(String talla, String color) {
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Camisa{" +
                "talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
