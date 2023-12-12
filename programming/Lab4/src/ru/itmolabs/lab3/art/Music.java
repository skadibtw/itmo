package ru.itmolabs.lab3.art;


public class Music implements Art{
    private String name = "без имени";
    public Music() {}

    public Music(String name) {
        this.name = name;
    }
    public void bePretty() {
        System.out.println("Песня под названием " + this.name + " прекрасна");
    }
    public void play() {
        System.out.println("Музыка зазвенела");
    }
    @Override
    public int hashCode() {
        return 52 * this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Песня под названием " + this.name;
    }


}