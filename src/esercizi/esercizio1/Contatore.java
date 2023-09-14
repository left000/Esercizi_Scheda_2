package esercizi.esercizio1;

public class Contatore {

    private int number;


    public Contatore(){
    }

    public Contatore(int number){
        this.number = number;
    }



    public void incrementoNumber(){
        number++;
    }

    public void reset(){
        number = 0;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }




    @Override
    public String toString() {
        return "esercizi.esercizio1.Contatore{" +
                "number=" + number +
                '}';
    }





}
