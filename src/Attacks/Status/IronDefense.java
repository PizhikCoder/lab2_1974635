package Attacks.Status;

import ru.ifmo.se.pokemon.*;

public class IronDefense extends StatusMove {
    public IronDefense()
    {
        super(Type.STEEL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 2);
        super.applySelfEffects(p);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe()
    {
        return "применяет Iron Defense";
    }
}
