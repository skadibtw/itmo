package Entities;

public abstract class Entity {
     public String name;
     public int age;

     public Entity() {

     }
     public Entity(String name) {
          this.name = name;
     }
     public Entity(String name, int age) {
          this.name=name;
          this.age=age;
     }
     public String getName() {
          return name;
     }

     void feel(String feeling){}

     void think(String thought){}

     void doAction(String action){}

}
