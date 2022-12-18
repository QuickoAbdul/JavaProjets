package TP4;

public class Produit implements Payable{
    private String Nom;
    private long Prix;
    private int Poid;
    public Produit(String Nom, long Prix, int Poid) {
        this.Nom = Nom;
        this.Prix = Prix;
        this.Poid = Poid;
    }
    public String toString()
    {
        return this.Nom+" : "+ String.format("%d.%02d %s", this.Prix/100, this.Prix%100,"€");
    }
    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    public Long getPrix() {
        return Prix;
    }

    public void setPrix(long Prix) {
        this.Prix = Prix;
    }

    public double getPoid() {
        return Poid;
    }

    public void setPoid(int poid) {
        Poid = poid;
    }
    @Override
    public String label() {
        return this.getNom();
    }
    @Override
    public long cout() {
        return this.getPrix();
    }
    @Override
    public long taxe() {
        return 1000;
    }
}