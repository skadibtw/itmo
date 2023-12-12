package ru.itmolabs.lab3;
import ru.itmolabs.lab3.art.*;
import ru.itmolabs.lab3.entities.*;
import ru.itmolabs.lab3.exceptions.InvalidName;
import ru.itmolabs.lab3.exceptions.PlaceNotExist;
import ru.itmolabs.lab3.places.*;


public class Main {
    public static void main(String[] args) throws PlaceNotExist  {
        House house = new House();
        Music music = new Music();
        Westergetland westergetland = new Westergetland();
        Everyone everyone = new Everyone(house);
        Human nothouse = new Human("Человек", house);
        try {
            Human unclejulius = new Human("Дядя Юлиус", nothouse);
        }
        catch (PlaceNotExist e) {
            System.out.println(e.getMessage());

        }
        try {
            Human malish = new Human("малыш", house);
        }
        catch (InvalidName e){
            System.out.println("Имя человека введено неверно: " + e.getMessage() + ". Пишите имя уважительно, с большой буквы.");
            Human malish = new Human("Малыш", house);
        }
        Human unclejulius = new Human("Дядя Юлиус", house);
        Painting wolf = new Painting("волк");
        wolf.bePretty();
        unclejulius.say("Плохо вы нарисовали лошадь");
        unclejulius.think("Все всё делают плохо");
        unclejulius.doAction(Actions.PACK_THINGS.getAction());
        unclejulius.doAction(Actions.GO_AWAY.getAction());
        unclejulius.move(westergetland);
        everyone.doAction(Actions.BE_HAPPY.getAction());
        everyone.beHappy();
        house.bloom();
        music.play();
        Movable happiness = new Movable(){
            @Override
            public void move(Place place) {
                System.out.println("счастье переместилось в " + place);
            }
        };
        happiness.move(house);
        everyone.think("мы любим Дядю Юлиуса");


        }
}
