package TP4;

import java.util.ArrayList;
import java.util.List;

public class Facture {
    private List<Payable> facture = new ArrayList<Payable>();
    public Facture() {
    }
    public void ajout(Payable p){
        this.facture.add(p);
    }

    public String toString() {
        for (Payable a : facture){
            System.out.println(a.label()+", "+a.cout());
        }
        return "";
    }
    public long montantTotal(){
        long somme=0;
        for (Payable a : facture){
            somme+=a.cout();
        }
        return somme;
    }
    public long  taxeTotale(){
        long taxe=0;
        for (Payable a : facture){
            taxe+=(((a.taxe()/10)*a.cout())/1000);
        }
        return taxe;
    }
}
