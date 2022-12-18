package TP2.exo1;

public class Revues implements Document{
    private String Titre;
    private int Numero;
    private String Domaine;
    private String Annee_Edition;

    public Revues(String titre, int numero, String domaine, String annee_Edition) {
        Titre = titre;
        Numero = numero;
        Domaine = domaine;
        Annee_Edition = annee_Edition;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getDomaine() {
        return Domaine;
    }

    public void setDomaine(String domaine) {
        Domaine = domaine;
    }

    public String getAnnee_Edition() {
        return Annee_Edition;
    }

    public void setAnnee_Edition(String annee_Edition) {
        Annee_Edition = annee_Edition;
    }

    public void affiche(){
        System.out.println( "  Titre = "+getTitre() +" | Année d'édition = "+getAnnee_Edition()+" | Numero = "+getNumero()+" | Domaine = "+getDomaine());
    }
}
