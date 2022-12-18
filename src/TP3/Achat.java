package TP3;

import java.util.*;
public class Achat
{
    HashSet<Librairie> tab;
    public Achat()
    {
        tab = new HashSet<>();
    }
    public void add(Librairie e)
    {
        tab.add(e);
    }

    public void add(Librairie l, int quantite){
        l.setQuantite(quantite);
        add(l);
    }
    public void remove(Librairie e)
    {
        tab.remove(e);
    }
    public void remove(Librairie l, int quantite){
        l.setQuantite(quantite);
        remove(l);
    }
    public void affiche() { // Fonction toString affichant le prix total de tous les achats ainsi que les achats
        int prixtotal = 0;
        for (Librairie i:tab)
        {
            prixtotal += i.getPrixtotal();
            i.affiche();
        }
        System.out.println("Le prix total est de " + prixtotal+ " €" ) ;
    }

}
