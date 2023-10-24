package Moves.Status;

import ru.ifmo.se.pokemon.*;

public class Withdraw extends StatusMove {
    public Withdraw(){
        super(Type.WATER, 0, 40);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, 1);
        super.applySelfEffects(p);
    }

    protected String describe(){
        return "использовал Withdraw";
    }
}

