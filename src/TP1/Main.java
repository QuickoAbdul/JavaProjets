package TP1;

public class Main {
    public static void main(String[] args)
    {
        tableau t1 = new tableau(0, 9, 10);
        t1.affiche();
        t1.tri();
        System.out.println("il y a "+ t1.occurences(8) + " fois l'occurence choisis");
        t1.histogramme2();
        t1.exo2(10);
    }
}
