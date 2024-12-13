package dev.kataray.javaconcepts.encapsulation;

public class Orange extends Fruit{
    private String type;
    private int size;

    public Orange(String type, int size, boolean ripe) {
        super(ripe);
        this.type = type;
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
