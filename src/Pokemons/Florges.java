package Pokemons;

import Attacks.Status.CalmMind;
import ru.ifmo.se.pokemon.*;
public class Florges extends Floette
{
    public Florges(String name, int lvl)
    {
        super(name, lvl);
        this.setType(Type.FAIRY);
        this.setStats(78,65,68,112,154,75);
        this.addMove(new CalmMind());
    }
}
