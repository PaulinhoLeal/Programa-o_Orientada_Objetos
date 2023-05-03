public class Moto extends Veiculo{

    public Moto(){}

    public Moto(int id,int velocidadeAtual,int velocidadeMaxima,boolean farolAceso)
    {
        super(id, velocidadeAtual, velocidadeMaxima, farolAceso);
    }

    @Override
    public void especial()
    {
        System.out.println(" moto ultrapassou o adversário da frente");
    }

}
