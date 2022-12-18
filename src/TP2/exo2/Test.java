package TP2.exo2;

public class Test {
    public static void main(String[] args) {
          Revues rev1 = new Revues("Revues1", 15, "Documentaire", "2019");
       // rev1.affiche();
        Livres livre1 = new Livres("Revues1","1h20","aventure");
       // livre1.affiche();
        DVD DVD1 = new DVD("titre1", "Francis delacroix", "Jean Patrick", "2016");
       // DVD1.affiche();
        Bibliothéque b = new Bibliothéque();
        b.ajouter(livre1);
        b.ajouter(rev1);
        b.ajouter(DVD1);
        b.affiche();
    }
}
