package Pokemons;

import Attacks.Physical.IronHead;
import Attacks.Special.GigaDrain;
import Attacks.Status.IronDefense;
import Attacks.Status.Swagger;
import ru.ifmo.se.pokemon.*;

public class Kartana extends Pokemon{
    public Kartana(String name, int lvl)
    {
        super(name, lvl);
        this.setType(Type.GRASS, Type.STEEL);
        this.setStats(58,181, 131, 59, 31, 109);
        this.addMove(new IronDefense());
        this.addMove(new GigaDrain());
        this.addMove(new Swagger());
        this.addMove(new IronHead());
    }
}
