package Pokemons;

import Moves.Special.EnergyBall;
import Moves.Special.GrassWhistle;
import Moves.Status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swadloon extends Pokemon {
    public Swadloon(String name, int level) {
        super(name, level);
        super.setType(Type.BUG, Type.GRASS);
        super.setStats(55, 63, 90, 50, 80, 42);
        DoubleTeam doubleTeam = new DoubleTeam();
        EnergyBall energyBall = new EnergyBall();
        GrassWhistle grassWhistle = new GrassWhistle();
        super.setMove(doubleTeam, energyBall, grassWhistle);
    }

}
