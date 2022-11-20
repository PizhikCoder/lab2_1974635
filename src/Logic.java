import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class  Logic
{
    public static void main(String[] args)
    {
        Battle b = new Battle();
        b.addAlly(new Kartana("Flab", 1));
        b.addAlly(new Yanmega("Floet", 1));
        b.addAlly(new Floette("Flor", 1));
        b.addFoe(new Kartana("Kart", 1));
        b.addFoe(new Yanma("Yan", 1));
        b.addFoe(new Yanmega("Yanmeg", 1));
        b.go();
    }
}
