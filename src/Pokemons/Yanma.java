package Pokemons;

import Attacks.Physical.AerialAce;
import Attacks.Physical.QuickAttack;
import Attacks.Special.AirSlash;
import ru.ifmo.se.pokemon.*;
public class Yanma extends Pokemon
{
    public Yanma(String name, int lvl)
    {
        super(name, lvl);
        this.setType(Type.BUG, Type.FLYING);
        this.setStats(65,65,45,75,45,95);
        this.addMove(new AirSlash());
        this.addMove(new QuickAttack());
        this.addMove(new AerialAce());
    }
}
