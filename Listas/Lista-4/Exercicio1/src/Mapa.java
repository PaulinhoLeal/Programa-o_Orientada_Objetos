import java.util.ArrayList;

public class Mapa
{
    String nome;
    int altura;
    int largura;
    ArrayList<Heroi>herois;
    ArrayList<Inimigo>inimigos ;

    public Mapa(String nome,int altura, int largura,ArrayList<Heroi>herois,ArrayList<Inimigo>inimigos)
    {
        this.nome=nome;
        this.altura=altura;
        this.largura=largura;

    }



    public Inimigo getInimigoMaoirNumero()
    {

        int maiorAtk = 0;
        int index = 0;
        for (int i = 0; i < inimigos.size(); i++)
        {
            if(inimigos.get(i).atk>maiorAtk)
            {
                maiorAtk = inimigos.get(i).atk;
                index = i;
            }
        }
        return  inimigos.get(index);
    }

}

