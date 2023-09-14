package esercizi.esercizio2;


public class Cerchio {

    private int raggio;
    private  Colore colore = Colore.getNero();


    public Cerchio(int raggio){
        this.raggio = raggio;
    }

    public double circonferenza(){
        return Math.PI * raggio * 2 ;
    }
    public double area(){
        return Math.pow(raggio, 2) * Math.PI;
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
                "raggio=" + raggio +
                ", colore=" + colore +
                '}';
    }
}
