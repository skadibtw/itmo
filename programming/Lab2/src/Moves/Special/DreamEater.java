package Moves.Special;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    private double number=0;
    public DreamEater(){
        super(Type.PSYCHIC,100,100);
    }
    @Override
    protected String describe() {
        return "использовал Dream Eater";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        number = p.getHP();
        number = number*0.5;
        p.addEffect(new Effect().stat(Stat.HP,+(int)number).turns(-1));
    }
}

