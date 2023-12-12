package ru.itmolabs.lab3.exceptions;
import ru.itmolabs.lab3.places.Place;
public class PlaceNotExist extends Exception{
    private Object place;
    public PlaceNotExist(Object pl){
        super(pl + " не является местом");
        this.place = pl;

    }
    @Override
    public String getMessage(){
        return "Объект " + this.place.toString() + " не является местом";
    }

}
