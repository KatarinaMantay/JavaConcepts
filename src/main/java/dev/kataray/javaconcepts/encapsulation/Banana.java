package dev.kataray.javaconcepts.encapsulation;

public class Banana extends Fruit{
    private int length;
    private String region;

    public Banana(int length, String region, boolean ripe) {
        super(ripe);
        this.length = length;
        this.region = region;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
