package esercizi.esercizio3;

public class Lampadina {

    private LampaditaState lampatidaState = LampaditaState.SPENTA;
    private int nCLicks = 0;
    private int maxClick;


    public Lampadina(int maxClick) {
        this.maxClick = maxClick;
    }

    public LampaditaState stato() {
        return lampatidaState;
    }


    public void click(){
        if (nCLicks == maxClick){
           lampatidaState = LampaditaState.ROTTA;

        } else if (lampatidaState == LampaditaState.SPENTA) {
            lampatidaState = LampaditaState.ACCESA;
            nCLicks++;

        } else if (lampatidaState == LampaditaState.ACCESA) {
            lampatidaState = LampaditaState.SPENTA;
            nCLicks++;
        }

    }

    public void setLampatidaState(LampaditaState lampatidaState) {
        this.lampatidaState = lampatidaState;
    }
    public int getnCLicks() {
        return nCLicks;
    }
    public void setnCLicks(int nCLicks) {
        this.nCLicks = nCLicks;
    }

    public void setMaxClick(int maxClick) {
        this.maxClick = maxClick;
    }




    public static void main(String[] args) {

        Lampadina lampadina = new Lampadina(5);

        System.out.println(lampadina.stato());
        lampadina.click();
        System.out.println(lampadina.stato());
        lampadina.click();
        System.out.println(lampadina.stato());
        lampadina.click();
        System.out.println(lampadina.stato());
        lampadina.click();
        System.out.println(lampadina.stato());
        lampadina.click();
        System.out.println(lampadina.stato());
        lampadina.click();
        System.out.println(lampadina.stato());

    }
}
