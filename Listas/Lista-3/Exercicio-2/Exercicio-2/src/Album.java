import java.util.ArrayList;

public class Album
{
    String nome;
    String nomeArtista;
    ArrayList<Musica>musicas = new ArrayList<>();


   public Musica getMusicaMaiorPopularidade()
    {
        int musicaMaisPopoluar =0;
        int index = 0;
        for (int i = 0; i < musicas.size() ; i++)
        {
           if(musicas.get(i).popularidade > musicaMaisPopoluar  )
           {
               musicaMaisPopoluar = musicas.get(i).popularidade;
               index = i;
           }
        }
        return musicas.get(index);
    }
   public Musica getmusicaMenorDuracao()
    {
        int musicaMenorDuracao = 200;

        int index = 0;
        for(int i=0;i <musicas.size();i++)
        {
            if(musicas.get(i).duracaoEmSegundos<musicaMenorDuracao)
            {
                musicaMenorDuracao = musicas.get(i).duracaoEmSegundos;
                index = i;
            }
        }
        return musicas.get(index);
    }


}
