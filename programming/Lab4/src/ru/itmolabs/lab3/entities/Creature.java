package ru.itmolabs.lab3.entities;

public abstract class Creature {
     protected String name;

     abstract void feel(String feeling);

     abstract void think(String thought);

     abstract void doAction(String action);

}
