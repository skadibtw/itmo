package Entities;

public enum Actions {
    GOAWAY("уехал"),
    PACKTHINGS("собрал вещи"),
    BEHAPPY("осчастливились"),
    BLOSSOMED("расцвел"),
    ;

    private String action;
    Actions(String action) {
        this.action = action;
    }
    public String getAction(){
        return action;
    }

}
