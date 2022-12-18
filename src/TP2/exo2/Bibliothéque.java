package TP2.exo2;

import java.util.Enumeration;
import java.util.Vector;

public class Bibliothéque {
    Vector<Document> tableau; //tableau dynamique de vector de document

    public Bibliothéque() {
        tableau = new Vector<>();

    }
    public void affiche() { //une fonction lister le contenu du vector
        for (Enumeration<Document> e = tableau.elements(); e.hasMoreElements() ;)
            e.nextElement().affiche(); ;
    }

    public void ajouter(Document d) { //fonction ajouter un document au vector
        tableau.addElement(d);
    }

}

