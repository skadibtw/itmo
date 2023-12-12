package ru.itmolabs.lab3.places;


public class Westergetland extends Place {
    public void exist() {
        System.out.println("Вестергетланд существует");
    }


    @Override
    public String toString() {
        return "Вестергетланд";
    }


    @Override
    public int hashCode() {
        return 52 * "Вестергетланд".hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

}

