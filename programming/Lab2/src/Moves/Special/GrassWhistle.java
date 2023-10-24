package Moves.Special;

import ru.ifmo.se.pokemon.*;


public class GrassWhistle extends SpecialMove {
    public GrassWhistle() {
        super(Type.GRASS, 0, 55);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }
    @Override
    protected String describe() {
        return "использовал Grass Whistle";
    }
}
