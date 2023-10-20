package pl.zs10.testflagi;

import java.util.ArrayList;

public class Flaga {
    private int kraj;

    private int kolor1;
    private int kolor2;
    private int kolor3;

    public Flaga(int kraj, int kolor1, int kolor2, int kolor3) {
        this.kraj = kraj;
        this.kolor1 = kolor1;
        this.kolor2 = kolor2;
        this.kolor3 = kolor3;
    }

    public ArrayList<Flaga> zwrocFlagi(){
        ArrayList<Flaga> flagi = new ArrayList<>();
        flagi.add(//TODO:,R.color.red,R.color.white,R.color.blue);
        return flagi;
    }

    public int getKraj() {
        return kraj;
    }

    public int getKolor1() {
        return kolor1;
    }

    public int getKolor2() {
        return kolor2;
    }

    public int getKolor3() {
        return kolor3;
    }
}
