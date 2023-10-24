package Pokemons;

import Moves.Special.Blizzard;
import Moves.Special.DreamEater;
import Moves.Status.Growl;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slowpoke extends Pokemon {
    public Slowpoke(String name, int level) {
        super(name, level);
        super.setType(Type.WATER, Type.PSYCHIC);
        super.setStats(90, 65, 65, 40, 40, 15);
        DreamEater dreamEater = new DreamEater();
        Growl growl = new Growl();
        Blizzard blizzard = new Blizzard();
        super.setMove(dreamEater, growl, blizzard);
    }

}
