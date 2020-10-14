package m3.uf5.ordenacio2;

public class Producte {

    private String descripcio;
    private double preu;
    private int codi;
    private boolean disponible;

    // k)
    public static int comparaPreuDisponibilitat(Producte p1, Producte p2){
        int aux;
        aux = Double.compare(p1.getPreu(), p2.getPreu());
        if (aux == 0) aux = Boolean.compare(p1.isDisponible(), p2.isDisponible());
        return aux;
    }

    //Constructor
    public Producte(String descripcio, double preu, int codi, boolean disponible) {
        this.descripcio = descripcio;
        this.preu = preu;
        this.codi = codi;
        this.disponible = disponible;
    }

    //Getters i setters
    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //toString
    @Override
    public String toString() {
        String disp;
        if (disponible) {
            disp = " Està disponible";
        } else {
            disp = " No està disponible";
        }
        return  "\n"+ descripcio + ": preu=" + preu + "€, codi=" + codi + '.' + disp;
    }

}
