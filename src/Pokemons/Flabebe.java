package Pokemons;
 import Attacks.Special.MagicalLeaf;
 import Attacks.Status.CalmMind;
 import ru.ifmo.se.pokemon.*;
public class Flabebe extends Pokemon
{
    public Flabebe(String name, int lvl)
    {
        super(name, lvl);
        this.setType(Type.FAIRY);
        this.setStats(44,38,39,69,79,42);
        this.addMove(new MagicalLeaf());
        this.addMove(new CalmMind());
    }
}
