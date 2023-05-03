public class Carro extends Veiculo {
    public Carro(int id,int velocidadeAtual,int velocidadeMaxima,boolean farolaceso)
    {
        super(id,velocidadeAtual,velocidadeMaxima,farolaceso);
    }
    @Override
    public void especial()
    {
        System.out.println(" carro fechou o adversário de trás");
    }
}
