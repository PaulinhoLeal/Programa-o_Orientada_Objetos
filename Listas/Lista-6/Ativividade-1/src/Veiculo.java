public abstract class Veiculo {
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private boolean farolAceso;

    public Veiculo(){}

    public Veiculo(int id,int velocidadeAtual,int velocidadeMaxima,boolean farolAceso)
    {
        this.id=id;
        this.velocidadeAtual=velocidadeAtual;
        this.velocidadeMaxima=velocidadeMaxima;
        this.farolAceso=farolAceso;
    }

    public void acelarar(){}
    public void desacelerar(){}

    public void ligarFarol(){}


    public abstract void especial();


    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getVelocidadeAtual()
    {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(int velocidadeAtual)
    {
        this.velocidadeAtual=velocidadeAtual;
    }
    public int getVelocidadeMaxima()
    {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima)
    {
        this.velocidadeMaxima= velocidadeMaxima;
    }
    public boolean getFarolAceso()
    {
        return farolAceso;
    }
    public void setFarolAceso(boolean farolAceso)
    {
        this.farolAceso=farolAceso;
    }







}
