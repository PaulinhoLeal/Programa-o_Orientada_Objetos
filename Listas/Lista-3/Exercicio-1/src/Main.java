public class Main {
    public static void main(String[] args)
    {
        Heroi ben10 = new Heroi();
        ben10.atk = 10;
        ben10.defesa = 5;
        ben10.pontos = 0;
        Inimigo lava = new Inimigo();
        lava.atk = 8;
        lava.defesa = 2;
        lava.pontos =0;
        Inimigo pedra = new Inimigo();
        pedra.atk=5;
        pedra.defesa = 8;
        pedra.pontos = 0;


        Mapa mapa = new Mapa();
        mapa.inimigos.add(lava) ;
        mapa.inimigos.add(pedra);

        Inimigo inimigoMaiorNumero = mapa.getInimigoMaoirNumero();
        System.out.println(inimigoMaiorNumero.atk);
        System.out.println(inimigoMaiorNumero);
    }
}