package esercizi.esercizio2;

public class Colore {
    private int red;
    private int green;
    private int blue;
    private static final Colore bianco = new Colore(255, 255, 255);
    private static final Colore nero = new Colore(0, 0, 0);



    public Colore(int red, int green ,int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public static Colore getBianco() {
        return bianco;
    }

    public static Colore getNero() {
        return nero;
    }

    @Override
    public String toString() {
        return "Colore{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }

}
