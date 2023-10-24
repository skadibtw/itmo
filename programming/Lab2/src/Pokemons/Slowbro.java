package Pokemons;

import Moves.Special.Blizzard;
import Moves.Special.DreamEater;
import Moves.Status.Growl;
import Moves.Status.Withdraw;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slowbro extends Pokemon {
    public Slowbro(String name, int level) {
        super(name, level);
        super.setType(Type.WATER, Type.PSYCHIC);
        super.setStats(95, 75, 110, 100, 80, 30);
        DreamEater dreamEater = new DreamEater();
        Growl growl = new Growl();
        Blizzard blizzard = new Blizzard();
        Withdraw withdraw = new Withdraw();
        super.setMove(dreamEater, growl, blizzard, withdraw);
    }

}
