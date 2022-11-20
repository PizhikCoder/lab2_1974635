package Attacks.Status;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger ()
    {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.ATTACK, 2);
        p.confuse();
        super.applySelfEffects(p);
    }

    @Override
    protected String describe() {
        return "применяет Swagger";
    }
}
