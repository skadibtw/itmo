package Moves.Special;

import ru.ifmo.se.pokemon.*;

public class EarthPower extends SpecialMove {
    public EarthPower() {
        super(Type.GROUND, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "использовал Earth Power";
    }
}
