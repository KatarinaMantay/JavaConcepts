package dev.kataray.javaconcepts.encapsulation;

public class Apple extends Fruit {
    private int seeds;
    private String type;
    private String colour;

    public Apple(int seeds, String type, String colour, boolean ripe) {
        super(ripe);
        this.seeds = seeds;
        this.type = type;
        this.colour = colour;
    }

    public int getSeeds() {
        return seeds;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public void setSeeds(int seeds) {
        this.seeds = seeds;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
