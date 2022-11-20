package Attacks.Physical;

import ru.ifmo.se.pokemon.*;

public class IronHead extends PhysicalMove {
    public IronHead()
    {
        super(Type.STEEL, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.3);
        e.flinch(pokemon);
        pokemon.addEffect(e);
        super.applyOppEffects(pokemon);
    }
    @Override
    protected String describe()
    {
        return "применяет Iron Head";
    }

}
