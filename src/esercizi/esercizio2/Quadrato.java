package esercizi.esercizio2;

public class Quadrato {

    private int lato;
    private  Colore colore = Colore.getNero();

    public Quadrato(int lato){
        this.lato = lato;
    }

    public int perimetro(){
        return lato * 4;
    }

    public void stampaQuadrato(){
        for (int i = 0; i < lato ; i++) {
            for (int j = 0; j < lato; j++) {
                System.out.print(" o ");
            }
                System.out.println(" ");
        }
    }


    public Colore getColore() {
        return colore;
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }

    @Override
    public String toString() {
        return "Cerchio{" +
                "raggio=" + lato +
                ", colore=" + colore +
                '}';
    }
}
