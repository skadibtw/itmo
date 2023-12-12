package ru.itmolabs.lab3.places;

public class House extends Place{
    public void exist() {
        System.out.println("Дом существует");
    }
    public void bloom() {
        System.out.println("Дом расцвел");
    }
    @Override
    public int hashCode() {
        return 52 * "House".hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "дом";
    }

}
