package m3.uf5.interfaces;

public class Persona {

    private String nom;
    private int edat;

    //Exercici 2
    public static int comparaPerNom(Persona p1, Persona p2){
        return p1.getNom().compareTo(p2.getNom());
    }

    //Constructor
    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    //Getters i Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    //ToString
    @Override
    public String toString() {
        return "m3.uf5.interfaces.Persona{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }
}
