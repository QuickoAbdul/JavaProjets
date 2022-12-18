package TP2.exo2;

public class DVD implements Document{
    private String Titre;
    private String Nom_auteur;
    private String Editeur;
    private String Annee_edition;

    public DVD(String titre, String nom_auteur, String editeur, String annee_edition) {
        Titre = titre;
        Nom_auteur = nom_auteur;
        Editeur = editeur;
        Annee_edition = annee_edition;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getNom_auteur() {
        return Nom_auteur;
    }

    public void setNom_auteur(String nom_auteur) {
        Nom_auteur = nom_auteur;
    }

    public String getEditeur() {
        return Editeur;
    }

    public void setEditeur(String editeur) {
        Editeur = editeur;
    }

    public String getAnnee_edition() {
        return Annee_edition;
    }

    public void setAnnee_edition(String annee_edition) {
        Annee_edition = annee_edition;
    }

    public void affiche(){
        System.out.println( "  Titre = "+getTitre() +" | Année d'édition = "+getAnnee_edition()+" | Editeur = "+getEditeur()+" | Nom d'auteur = "+getNom_auteur());
    }
}
