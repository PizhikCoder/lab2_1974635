package Attacks.Physical;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove{
    public QuickAttack()
    {
        super(Type.NORMAL, 40,100, 2,1);
    }

    @Override
    protected String describe() {
        return "применяет Quick Attack";
    }
}
