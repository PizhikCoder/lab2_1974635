package Attacks.Special;

import ru.ifmo.se.pokemon.*;

public class GigaDrain extends SpecialMove {
    public GigaDrain()
    {
        super(Type.GRASS, 75, 100);

    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int)v/2);
        System.out.printf("%s восстанавливает %d\n", pokemon.toString(), (int)v/2);
        super.applySelfDamage(pokemon, v);
    }

    @Override
    protected String describe()
    {
        return "применяет Giga Drain";
    }
}
