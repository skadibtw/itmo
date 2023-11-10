package Entities;

public class Human extends Entity{
    public Human(){
        System.out.println("Обычный человек успешно создан...");
    }

    public Human (String name){
        this.name = name;
        System.out.println("Человек - " + name  + " успешно создан!");
    }

    public void think(String name2, String thought){
        System.out.println(this.name + " думает о " + name2 + ": " + thought);
    }

    public void feel(String feeling) {
        System.out.println(this.name + " чувствует себя " + feeling);
    }

    public void think( String thought){
        System.out.println(this.name + " думает: " + thought);
    }

    public void doAction(String action) {
        System.out.println(this.name + "только что " + action);
    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Человек по имени " + this.getName();
    }

    @Override
    public String getName() {
        return name;
    }
}
