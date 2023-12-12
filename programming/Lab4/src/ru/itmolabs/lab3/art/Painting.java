package ru.itmolabs.lab3.art;

public class Painting implements Art{
    private String name;
    public Painting(String name) {
        this.name = name;
    }
    public void bePretty() {
        System.out.println("Картина, на которой нарисован " + this.name + " прекрасна");
    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "картина, на которой нарисован " + this.name;
    }
}
