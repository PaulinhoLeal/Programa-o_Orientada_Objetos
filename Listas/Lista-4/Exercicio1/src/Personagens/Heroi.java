package Personagens;

public class Heroi
{
  protected String nome;
    private int atk;
    private int defesa;
    private int pontos;


    public Heroi(String nome,int atk,int defesa,int pontos)
    {
        this.nome=nome;
        this.atk=atk;
        this.defesa=defesa;
        this.pontos=pontos;
    }
    public int getAtk()
    {
        return this.atk;
    }
    public void setAtk(int atk)
    {
        this.atk=atk;
    }

    public int getDefesa()
    {
        return defesa;
    }
    public void setDefesa(int defesa)
    {
        this.defesa=defesa;
    }

    public int getPontos()
    {
        return pontos;
    }
    public void setPontos(int pontos)
    {
        this.pontos=pontos;
    }
}
