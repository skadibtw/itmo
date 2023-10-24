package Pokemons;

import Moves.Special.EnergyBall;
import Moves.Status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sewaddle extends Pokemon {
    public Sewaddle(String name, int level) {
        super(name, level);
        super.setType(Type.BUG, Type.GRASS);
        super.setStats(45, 53, 70, 40, 60, 42);
        DoubleTeam doubleTeam = new DoubleTeam();
        EnergyBall energyBall = new EnergyBall();
        super.setMove(doubleTeam, energyBall);
    }


}
