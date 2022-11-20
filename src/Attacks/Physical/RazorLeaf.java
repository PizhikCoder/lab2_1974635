package Attacks.Physical;

import ru.ifmo.se.pokemon.*;
public class RazorLeaf extends PhysicalMove
{
    public RazorLeaf()
    {
        super(Type.GRASS, 55, 95);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, 1);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "пименяет Razor Leaf";
    }
}
