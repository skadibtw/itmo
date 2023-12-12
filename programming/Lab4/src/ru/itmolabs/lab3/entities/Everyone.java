package ru.itmolabs.lab3.entities;

import ru.itmolabs.lab3.exceptions.PlaceNotExist;
import ru.itmolabs.lab3.places.Place;

public class Everyone extends Creature implements Movable{
    private Place place;
    public Everyone(Place place){
        this.place = place;
    }
    private class ValidatePlace{
        private boolean validatePlace(Object place) {
            return place instanceof Place;
        }
    }
    ValidatePlace vali = new ValidatePlace();
    public void move(Place place) throws PlaceNotExist {
        if (vali.validatePlace(place)) {
            this.place = place;
            System.out.println(this.name + " переместился в " + this.place);
        }
        else {
            throw new PlaceNotExist(place.toString());
        }
    }
    public void feel(String feeling){
        System.out.println("Все чувствуют " + feeling);
    }
    public void think(String thought){
        System.out.println("Все думают " + thought);
        class SecretThoughts {
            public void tellSecret() {
                System.out.println("На самом деле никто не любит ворчливого Дядю Юлиуса");
            }
        }
        SecretThoughts secret = new SecretThoughts();
        secret.tellSecret();
    }
    public void doAction(String action){
        System.out.println("Все выполнили действие: " + action);
    }
    public void beHappy(){
        System.out.println("Все стали оживлены и общительны");
    }

    @Override
    public int hashCode() {
        return 52 * (place.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}
