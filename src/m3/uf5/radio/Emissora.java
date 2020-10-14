package m3.uf5.iteradors;

public class Emissora {
    private double freq;
    private String especialitat;
    private String nom;

    public Emissora(double freq, String especialitat, String nom) {
        this.freq = freq;
        this.especialitat = especialitat;
        this.nom = nom;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public String getEspecialitat() {
        return especialitat;
    }

    public void setEspecialitat(String especialitat) {
        this.especialitat = especialitat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Emissora{" +
                "freq=" + freq +
                ", especialitat='" + especialitat + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
