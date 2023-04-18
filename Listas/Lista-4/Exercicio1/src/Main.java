import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Heroi heroi1 = new Heroi("ben10",10,5,0);
        Inimigo inimigo1 = new Inimigo("lava",8,2,0);
        Inimigo inimigo2 = new Inimigo("pedra",5,8,0);



        Mapa mapa1 = new Mapa("Nevoeiro",100,100, new ArrayList<Heroi>(), new ArrayList<Inimigo>());
        mapa1.inimigos.add(inimigo1) ;
        mapa1.inimigos.add(inimigo2);

        Inimigo inimigoMaiorNumero = mapa1.getInimigoMaoirNumero();
        System.out.println(inimigoMaiorNumero.atk);
        System.out.println(inimigoMaiorNumero);
    }
}