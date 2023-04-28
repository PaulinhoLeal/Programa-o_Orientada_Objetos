import javax.swing.*;

public class Heroi {
    private int id;
    private String nome;
    private int quantMoedasOuro;

    public Heroi()
    {

    }
    public Heroi(int id,String nome, int quantMoedasOuro)
    {
        this.id=id;
        this.nome=nome;
        this.quantMoedasOuro=quantMoedasOuro;

    }

    public int getIdHeroi()
    {
        return id;
    }
    public void setIdHEroi(int id)
    {
        this.id=id;
    }
    public String getNomeHeroi()
    {

        return nome;
    }
    public void setNomeHeroi(String nome)
    {
        this.nome=nome;
    }
    public int getQuantMoedasOuro()
    {
        return quantMoedasOuro;
    }
    public void setQuantMoedasOuro(int quantMoedasOuro)
    {
        this.quantMoedasOuro=quantMoedasOuro;
    }



}
