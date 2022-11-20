package Attacks.Status;

import ru.ifmo.se.pokemon.*;
public class CalmMind extends StatusMove
{
    public CalmMind()
    {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {

        return true;
    }

    @Override
    protected String describe() {
        return "применяет Calm Mind";
    }
}
