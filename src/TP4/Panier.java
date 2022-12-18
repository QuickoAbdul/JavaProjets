package TP4;

import java.util.*;
public class Panier
{
    List<Produit> tab;
    private static int nextId = 1; // Cela va garder en mémoire l'id suivant à assigner à un nouveau panier
    private int id; // L'id de ce panier
    private int poids;
    public Panier()
    {
        id = nextId;
        nextId++;
        tab = new ArrayList<>();
        poids = 0;
    }
    public void ajoutProduit(Produit leproduit)
    {
        if (poids + leproduit.getPoid() <= 10000) {
            // Only add the product if it doesn't cause the total weight to exceed 10 kg
            tab.add(leproduit);
            poids += leproduit.getPoid();
        } else {
            System.out.println("Les produits ne se sont pas ajouter car le panier dépasse 10kg");
        }
    }
    public boolean supprimerProduit(Produit p){
        for (int i = 0; i < this.nombreProduit(); i++){
            if (this.tab.get(i).getNom().equals(p.getNom()) && this.tab.get(i).getPrix() == p.getPrix()) {
                this.tab.remove(i);
                return true;
            }
        }
        return false;
    }
    public int nombreProduit()
    {
        int nombre = 0 ;
        for (Produit i:tab)
        {
            nombre += 1;
        }
        return nombre;
    }

    public int prixTotal()
    {
        int prixtotal = 0; //Complexite n
        for (Produit i:tab)
        {
            prixtotal += i.getPrix();
        }
        return prixtotal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Panier " + getId() + " [" + nombreProduit() + " article(s)]\n");
        for (Produit p : tab) {
            sb.append(p.toString() + "\n");
        }
        return sb.toString();
    }
    public int getId() {
        return id;
    }
}
