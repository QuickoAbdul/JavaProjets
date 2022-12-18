package TP3;

public class Cahier implements Librairie
{
    private int prixtotal;
    private int nbrdepages;
    private String couleur;
    private int quantite = 1;


    public Cahier(int nbrdepages, Object couleur) {
        this.nbrdepages = nbrdepages;
        this.couleur = couleur.toString();
        this.prixtotal = (nbrdepages / 2);

    }
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
        this.prixtotal *= this.quantite;

    }

    public void affiche()
    {
        System.out.println( " Nombre de pages = "+getNbrdepages() + " | Couleur = "+getCouleur() + " | Quantité : "+ this.getQuantite());
    }


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        couleur = couleur;
    }

    public int getNbrdepages() {
        return nbrdepages;
    }
    public void setCouleur(int nbrdepages) {
        nbrdepages = nbrdepages;
    }

    public int getPrixtotal() {
        return prixtotal;
    }

    public void setPrixtotal(int prix) {
        this.prixtotal = prixtotal;
    }
}
