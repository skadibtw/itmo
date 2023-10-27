import ru.ifmo.se.pokemon.Battle;
import Pokemons.*;
/*
https://pokemondb.net/pokedex/slowpoke
https://pokemondb.net/pokedex/slowbro
https://pokemondb.net/pokedex/sewaddle
https://pokemondb.net/pokedex/swadloon
https://pokemondb.net/pokedex/leavanny
https://pokemondb.net/pokedex/palkia
 */
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Palkia p1 = new Palkia("какой-то дракон", 1);
        Slowpoke p2 = new Slowpoke("слоупок)", 1);
        Slowbro p3 = new Slowbro("эволюционировавший слоупок", 1);
        Sewaddle p4 = new Sewaddle("странный росток", 1);
        Swadloon p5 = new Swadloon("подросший росток", 1);
        Leavanny p6 = new Leavanny("тетя-росток", 1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();
    }
}



