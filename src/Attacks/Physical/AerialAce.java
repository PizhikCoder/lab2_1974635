package Attacks.Physical;

import Attacks.Special.AirSlash;
import ru.ifmo.se.pokemon.*;
public class AerialAce extends PhysicalMove
{
    public AerialAce()
    {
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe() {
        return "применяет Aerial Ace";
    }
}


