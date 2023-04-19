package Personagens;

public class Inimigo
{

    private String nome;
    private int atk;
    private int defesa;
    private int pontos;


    public Inimigo(String nome,int atk,int defesa,int pontos)
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
        return this.defesa;
    }

    public void setDefesa(int defesa)
    {
        this.defesa = defesa;
    }

    public int getPontos()
    {
        return  pontos;
    }
    public void setPontos(int pontos)
    {
        this.pontos=pontos;
    }
}
