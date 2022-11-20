package Pokemons;

import Attacks.Physical.NightSlash;
import ru.ifmo.se.pokemon.*;
public class Yanmega extends Yanma
{
    public Yanmega(String name, int lvl)
    {
        super(name, lvl);
        this.setType(Type.BUG, Type.FLYING);
        this.setStats(86, 76,86,116,56,95);
        this.addMove(new NightSlash());
    }
}
