package ru.itmolabs.lab3.entities;
import ru.itmolabs.lab3.exceptions.InvalidName;
import ru.itmolabs.lab3.exceptions.PlaceNotExist;
import ru.itmolabs.lab3.places.Place;


public class Human extends Creature implements Movable{
    public Human(){
        System.out.println("Обычный человек успешно создан...");
    }
    private Object place;


    private static class ValidateInfo {
        private static boolean validatePlace(Object place) throws PlaceNotExist {
            return place instanceof Place;
        }

        private static boolean validateName(String name) throws InvalidName {
            return name.substring(0, 1).equals(name.substring(0, 1).toUpperCase());
        }
    }

    public Human (String name, Object place) throws PlaceNotExist, InvalidName {
        if (ValidateInfo.validateName(name)) {
            this.name = name;

        }
        else {
            throw new InvalidName(name);
        }
        if (ValidateInfo.validatePlace(place)) {
            this.place = place;
        }
        else {
            throw new PlaceNotExist(place);
        }

        System.out.println("Человек - " + name  + " успешно создан!");

    }

    public void move(Place place) throws PlaceNotExist {
        if (ValidateInfo.validatePlace(place)) {
            this.place = place;
            System.out.println(this.name + " переместился в " + this.place);
        }
        else {
            throw new PlaceNotExist(place);
        }

    }
    public void feel(String feeling) {
        System.out.println(this.name + " чувствует себя " + feeling);
    }

    public void think(String thought){

        System.out.println(this.name + " думает: " + thought);
    }
    public void say(String words){
        System.out.println(this.name + " сказал: " + words);
    }

    public void doAction(String action) {
        System.out.println(this.name + " только что " + action);
    }

    @Override
    public int hashCode() {
        return 52 * (this.name.hashCode() + this.place.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Человек по имени " + this.name;
    }




    }

