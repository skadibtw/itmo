package Pokemons;

import Moves.Special.EarthPower;
import Moves.Special.Flamethrower;
import Moves.Special.SpacialRend;
import Moves.Special.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Palkia extends Pokemon {
    public Palkia(String name, int level) {
        super(name, level);
        super.setType(Type.WATER, Type.DRAGON);
        super.setStats(90, 120, 100, 150, 120, 100);

        Thunderbolt thunderbolt = new Thunderbolt();
        Flamethrower flamethrower = new Flamethrower();
        EarthPower earthPower = new EarthPower();
        SpacialRend spacialRend = new SpacialRend();
        super.setMove(thunderbolt, flamethrower, earthPower, spacialRend);
    }
}
