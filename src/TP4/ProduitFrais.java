package TP4;

import static java.lang.Math.floor;
public class ProduitFrais extends Produit {
    private String dateLimiteConso;
    public ProduitFrais(String nom, long prix, int poid, String dateLimiteConso) {
        super(nom, prix, poid);
        this.dateLimiteConso = dateLimiteConso;
    }

    public String getDateLimiteConso() {
        return dateLimiteConso;
    }

    public void setDateLimiteConso(String dateLimiteConso) {
        this.dateLimiteConso = dateLimiteConso;
    }

    @Override
    public String toString() {
        return "B: " + this.dateLimiteConso + " " + this.getNom() + ": " + String.format("%d.%02d", this.getPrix() / 100, this.getPrix() % 100)+ " €";
    }
    @Override
    public long taxe() {
        if(super.getPoid()<1000)
            return 1000;
        else
            return (long) ((10-(0.1*(floor(super.getPoid()/1000))))*100);
    }
}
