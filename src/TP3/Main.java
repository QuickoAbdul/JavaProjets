package TP3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args)
    {
        // Exercice1();
        // Exercice2();
        // Exercice3();
        // Exercice4();
        // Exercice5();

    }
    /* Exo 1 */
    public static void Exercice1()
    {
        System.out.println("L'exercice 1");
        Cahier cahier1 = new Cahier(20, "Jaune");
        Cahier cahier2 = new Cahier(40, "Rouge");

        Achat achat = new Achat();
        achat.add(cahier1);
        achat.add(cahier2);
        achat.affiche();
        System.out.println(" ");
    }
    /* Exo 2 */
    public static void Exercice2()
    {
        System.out.println("L'exercice 2");

        HashSet<Cahier> set = new HashSet<>();
        Cahier c = new Cahier(20, "Jaune") ;
        set.add(c);
        System.out.println(set.contains(c));
    }
    /* Exo 3*/
    public static void Exercice3()
    {
        System.out.println("L'exercice 3");
        Cahier cahier1 = new Cahier(20, "Jaune");
        Cahier cahier2 = new Cahier(40, "Rouge");
        Carnet carnet = new Carnet(5);

        Achat achat = new Achat();
        achat.add(cahier1);
        achat.add(cahier2); // un cahier
        achat.add(carnet); // un carnet

        achat.affiche();
        System.out.println(" ");
    }
    /* Exo 3 */
    public static void Exercice4()
    {
        System.out.println("L'exercice 4");
        Cahier cahier1 = new Cahier(20, "Jaune");
        Cahier cahier2 = new Cahier(40, "Rouge");
        Carnet carnet = new Carnet (5);

        Achat achat = new Achat();
        achat.add(cahier1, 5); // 5 cahiers
        achat.add(cahier2);
        achat.add(carnet , 7); // 7 carnets
        achat.affiche();
    }
    /* Exo 4 */
    public static void Exercice5()
    {
        System.out.println("L'exercice 5");
        Cahier cahier1 = new Cahier(20, CahierCouleur.Jaune);
        Cahier cahier2 = new Cahier(40, CahierCouleur.Rouge);
        Carnet carnet = new Carnet(5);

        Achat achat = new Achat();
        achat.add(cahier1, 5);
        achat.add(cahier2);
        achat.add(carnet, 7);
        achat.affiche();
    }
}

