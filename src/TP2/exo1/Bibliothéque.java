package TP2.exo1;

import TP2.exo2.Document;

import java.util.Scanner;

public class Bibliothéque {
    TP2.exo2.Document[] tableau;
    int taillemax;
    int n; //nombre elements du tableau

    public Bibliothéque(int taillemax) {
        this.taillemax = taillemax;
        this.n = 0;
        tableau = new TP2.exo2.Document[taillemax];

    }

    public void affiche() { //Affichage de tous les élements du tableau
        for (int i = 0; i < n; i++) {
            tableau[i].affiche();
        }
    }

    public void ajouter(Document d) {
        tableau[n] = d;
        n++;
    }
/*
    public void rechercher() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un auteur: \n");
        int recherche = scan.nextInt();
        int exist = 0;
        for (int i = 0; i < n; i++) {
            if (tableau[i].equals(recherche)) {
                exist++;
            }
        }
        if (exist > 0) {
            System.out.println("ca existe dans le tableau.");
        } else {
            System.out.println("ca n'existe pas dans le tableau.");
        }
    }
    */
}

