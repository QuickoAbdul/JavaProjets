package TP2.exo1;

public class Livres implements Document{
    private String Titre;
    private String Duree;
    private String Domaine;

    public Livres(String titre, String duree, String domaine) {
        Titre = titre;
        Duree = duree;
        Domaine = domaine;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getDuree() {
        return Duree;
    }

    public void setDuree(String duree) {
        Duree = duree;
    }

    public String getDomaine() {
        return Domaine;
    }

    public void setDomaine(String domaine) {
        Domaine = domaine;
    }
    public void affiche(){
        System.out.println( "  Titre = "+getTitre() +" | Durée = "+getDuree()+" | Domaine = "+getDomaine());
    }
}

