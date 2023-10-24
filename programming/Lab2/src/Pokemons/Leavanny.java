package Pokemons;

import Moves.Physical.AerialAce;
import Moves.Special.EnergyBall;
import Moves.Special.GrassWhistle;
import Moves.Status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Leavanny extends Pokemon {
    public Leavanny(String name, int level) {
        super(name, level);
        super.setType(Type.BUG, Type.GRASS);
        super.setStats(75, 103, 80, 70, 80, 92);

        AerialAce aerialAce = new AerialAce();
        EnergyBall energyBall = new EnergyBall();
        GrassWhistle grassWhistle = new GrassWhistle();
        DoubleTeam doubleTeam = new DoubleTeam();
        super.setMove(aerialAce, energyBall, grassWhistle, doubleTeam);
    }
}
