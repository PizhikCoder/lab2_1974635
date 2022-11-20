package Attacks.Special;

import ru.ifmo.se.pokemon.*;


public class AirSlash extends SpecialMove {
    int a;
    public AirSlash()
    {
        super(Type.FLYING, 75, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.3);
        e.flinch(pokemon);
        pokemon.addEffect(e);
        super.applyOppEffects(pokemon);


    }

    @Override
    protected String describe() {
        return "применяет Air Slash";
    }
}
