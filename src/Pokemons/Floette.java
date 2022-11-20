package Pokemons;

import Attacks.Physical.RazorLeaf;
import ru.ifmo.se.pokemon.*;
public class Floette extends Flabebe
{
    public Floette(String name, int lvl)
    {
        super(name, lvl);
        this.setType(Type.FAIRY);
        this.setStats(54,45,47,75,98,52);
        this.addMove(new RazorLeaf());
    }
}
