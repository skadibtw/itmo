package ru.itmolabs.lab3.entities;
import ru.itmolabs.lab3.exceptions.PlaceNotExist;
import ru.itmolabs.lab3.places.Place;

public interface Movable {

    public void move(Place place) throws PlaceNotExist;

}
