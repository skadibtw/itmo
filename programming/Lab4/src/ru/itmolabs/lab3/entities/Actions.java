package ru.itmolabs.lab3.entities;

public enum Actions {
    GO_AWAY("уехал"),
    PACK_THINGS("собрал вещи"),
    BE_HAPPY("осчастливились"),
    BLOSSOMED("расцвел");

    final String action;
    Actions(String action) {
        this.action = action;
    }
    public String getAction(){
        return this.action;
    }

    @Override
    public String toString() {
        return "ENUM со значениями действий";
    }

}
