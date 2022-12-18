package TP3;

public class Carnet implements Librairie
{
    private int prix;
    private int qualite;
    private int quantite = 1;
    private int prixtotal;

    public Carnet(int qualite)
    {
        this.qualite = qualite;
        this.prix = qualite * 3;
        this.prixtotal = this.prix;
    }
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
        this.prixtotal *= this.quantite;
    }
    public int getPrixtotal() {
        return prixtotal;
    }

    public void setPrixtotal(int prixtotal) {
        this.prixtotal = prixtotal;
    }
    public void affiche()
    {
        System.out.println( "Prix du carnet = "+ this.getPrix() + " | Facteur de Qualite = "+ this.getQualite() + " | Quantité : "+ this.getQuantite() );
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQualite() {
        return qualite;
    }

    public void setQualite(int qualite) {
        this.qualite = qualite;
    }
}
