package TP4;

public class Main {
    public static void main(String[] args) {
        /** partie 1 **/
            // Partie1_1();
            // Partie1_2();

        /** partie 2 **/
            // Partie2_1();
            // Partie2_2();
            // Partie2_3();
            // Partie2_4();
            // Partie2_5();

        /** partie 3 **/
            // Partie3_1();
            // Partie3_2();

        /** partie 4 **/
            // Partie4_1();
            // Partie4_2();
            // Partie4_3();
            // Partie4_4();
            // Partie4_5();
            // Partie4_6();
    }

   /* public static void Partie1_1()
    {
        Produit produit = new Produit("cereales", 500);
        System.out.println(produit.getPrix()); // affiche: 500
        System.out.println(produit.getNom()); // affiche: cereales
    }
    public static void Partie1_2()
    {
        Produit produit = new Produit("cereales", 500);
        System.out.println(produit);
        Produit Lait = new Produit("lait",403);
        System.out.println(Lait);
    }
    public static void Partie2_1()
    {
        Produit produit1 = new Produit("cereales", 500);
        Produit produit2 = new Produit("caviar", 50000);
        Produit produit3 = new Produit("eau", 101);
        Panier pan = new Panier();
        pan.ajoutProduit(produit1);
        pan.ajoutProduit(produit2);
        pan.ajoutProduit(produit3);
        System.out.println(pan.nombreProduit()); // affiche: 3
        System.out.println(pan.prixTotal()); // affiche: 50601
    }*/

    /*public static void Partie2_2()
    {
        Panier pan = new Panier();
        Produit produit = new Produit("cereales", 500);
        pan.ajoutProduit(produit);
        pan.supprimerProduit(new Produit("cereales", 500));
        System.out.println(pan.nombreProduit()); // affiche: 0

    }*/

    public static void Partie2_3()
    {
        Produit produit1 = new Produit("cereales", 501, 1000);
        Produit produit2 = new Produit("caviar", 50000, 500);
        Produit produit3 = new Produit("eau", 500, 5000);
        Panier pan = new Panier();
        pan.ajoutProduit(produit1);
        pan.ajoutProduit(produit2);
        pan.ajoutProduit(produit3);
        // pan.ajoutProduit(produit3); // produit une erreur
        pan.supprimerProduit(new Produit("eau", 500, 5000));
        // pan.ajoutProduit(produit3); // produit une erreur
        pan.supprimerProduit(new Produit("eau", 500, 5000));
        pan.ajoutProduit(produit3); // ajout possible!
        System.out.println(pan.nombreProduit());
    }

    public static void Partie2_4()
    {
        Panier c1 = new Panier();
        System.out.println(c1.getId()); // affiche: 1
        Produit produit1 = new Produit("cereales", 501, 1000);
        c1.ajoutProduit(produit1);
        Produit produit2 = new Produit("caviar", 50000, 500);
        c1.ajoutProduit(produit2);
        System.out.println(c1.getId()); // affiche: 1
        Panier c2 = new Panier();
        Panier c3 = new Panier();
        Produit produit3 = new Produit("eau", 500, 5000);
        c3.ajoutProduit(produit3);
        System.out.println(c2.getId()); // affiche: 2
        System.out.println(c3.getId()); // affiche: 3
    }
    public static void Partie2_5()
    {
        Panier c1 = new Panier();
        Produit produit1 = new Produit("cereales", 501, 1000);
        c1.ajoutProduit(produit1);
        Produit produit2 = new Produit("caviar", 50000, 500);
        c1.ajoutProduit(produit2);
        Panier c2 = new Panier();
        Panier c3 = new Panier();
        Produit produit3 = new Produit("eau", 500, 5000);
        c3.ajoutProduit(produit3);
        System.out.println(c1); // affiche: panier 1 [2 article(s)]
        // cereales: 5.01 €
        // caviar: 500.00 €
        System.out.println(c2); // affiche: panier 2 [0 article(s)]
        System.out.println(c3); // affiche: panier 3 [1 article(s)]
        // eau: 5.00 €
    }

    public static  void Partie3_1()
    {
        Produit produit1 = new Produit("cereales", 500, 1000);
        System.out.println(produit1); // affiche: cereales: 5.00€
        ProduitFrais frais = new ProduitFrais("Saumon", 1450, 800, "01-12-2022");
        System.out.println(frais); // affiche: B:01-12-2022 Saumon: 14.50€
    }
    public  static  void Partie3_2()
    {
        Produit tin = new Produit("sardine", 500, 500);
        ProduitFrais frais = new ProduitFrais("sardine", 500, 500, "01-12-2022");
        Panier pan = new Panier();
        pan.ajoutProduit(frais);
        pan.supprimerProduit(tin);
        System.out.println(pan); // affiche: panier 1 [1 article(s)]
    }

    public  static  void Partie4_1()
    {
        Ticket ticket = new Ticket("R1 - W-F", 9000);
        System.out.println(ticket);
    }

    public  static  void Partie4_2()
    {
        Payable payable = new Ticket("R1 - W-F", 9000);
        System.out.println(payable.label()); // affiche: R1 - W-F
        System.out.println(payable.cout()); // affiche: 9000
        System.out.println(payable.taxe()); // affiche: 2500
    }

    public  static  void Partie4_3()
    {
        Facture facture = new Facture();
        Payable payable = new Ticket("R2 - W-F", 9000);
        Ticket ticket = new Ticket("M2 - R1",12000);
        facture.ajout(payable);
        facture.ajout(ticket);
        System.out.println(facture);
    }

    public  static  void Partie4_4()
    {
        Facture facture = new Facture();
        Payable payable = new Ticket("R2 - W-F", 9000);
        Ticket ticket = new Ticket("M2 - R1",12000);
        facture.ajout(payable);
        facture.ajout(ticket);
        Produit produit = new Produit("cereales", 500, 1000);
        facture.ajout(produit);
    }

    public  static  void Partie4_5()
    {
        Produit tin = new Produit("sardine", 500, 500);
        ProduitFrais frais = new ProduitFrais("sardine", 500, 500, "01-12-2022");
        ProduitFrais frais2 = new ProduitFrais("sardine x3", 1500, 1500, "01-12-2022");
        System.out.println(tin.taxe()); // affiche: 1000
        System.out.println(frais.taxe()); // affiche: 1000
        System.out.println(frais2.taxe()); // affiche: 990
    }

    public  static  void Partie4_6()
    {
        Facture facture = new Facture();
        Produit tin = new Produit("sardine", 500, 500);
        ProduitFrais frais = new ProduitFrais("sardine", 500, 500, "01-12-2022");
        ProduitFrais frais2 = new ProduitFrais("sardine x3", 1500, 1500, "01-12-2022");
        facture.ajout(tin);
        facture.ajout(frais);
        facture.ajout(frais2);
        System.out.println(facture.montantTotal()); // affiche: 2500
        System.out.println(facture.taxeTotale()); // affiche: 248
    }
}