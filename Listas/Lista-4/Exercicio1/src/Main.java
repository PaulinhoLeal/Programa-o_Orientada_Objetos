import Personagens.Heroi;
import Personagens.Inimigo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Heroi heroi1 = new Heroi("ben10",10,5,0);
        Inimigo inimigo1 = new Inimigo("lava",8,2,0);
        Inimigo inimigo2 = new Inimigo("pedra",5,8,0);

        Mapa mapa1 = new Mapa("Nevoeiro",100,100, new ArrayList<Inimigo>());

        heroi1.setAtk(heroi1.getAtk());
        inimigo1.setDefesa(inimigo1.getDefesa());
        inimigo2.setDefesa(inimigo2.getDefesa());
        System.out.println(inimigo1.getAtk());
        System.out.println(inimigo2.getAtk());
        System.out.println(heroi1.getAtk());
        inimigo1.setAtk(20);
        System.out.println(inimigo1.getAtk());






    }
}