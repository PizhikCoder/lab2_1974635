package Attacks.Physical;

import ru.ifmo.se.pokemon.*;
public class NightSlash extends PhysicalMove
{
    public NightSlash()
    {
        super(Type.DARK, 70, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().turns(1).stat(Stat.SPEED, 1);
        pokemon.addEffect(e);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Night Slash";
    }
}
