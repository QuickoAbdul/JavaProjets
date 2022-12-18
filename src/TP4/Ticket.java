package TP4;

public class Ticket implements Payable {
    private String reference;
    private long prix;
    public Ticket(String reference, long prix) {
        this.reference = reference;
        this.prix = prix;
    }

    public String toString() {
        return reference +", " + prix ;
    }
    public String getReference() {
        return reference;
    }
    public long getprix() { return prix; }
    @Override
    public String label() {
        return this.getReference();
    }
    @Override
    public long cout() {
        return this.getprix();
    }
    @Override
    public long taxe() {
        return 2500;
    }
}
