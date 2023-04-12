public class Main {
    public static void main(String[] args)
    {
        Musica musica1= new Musica();
        musica1.nome = "GOODBYE PRINCESS";
        musica1.duracaoEmSegundos = 170;
        musica1.popularidade = 9;
        musica1.genero = "pop";
        Musica musica2 = new Musica();
        musica2.nome = "PRINCESA DO MAR";
        musica2.duracaoEmSegundos = 200;
        musica2.popularidade = 7;
        musica2.genero = "pop";
        Musica musica3 = new Musica();
        musica3.nome = "HELLO WORLD";
        musica3.duracaoEmSegundos = 120;
        musica3.popularidade = 8;
        musica3.genero = "pop";

        Album album = new Album();
        album.nome = "Castelo no céu";
        album.nomeArtista = "Tia lee";
        album.musicas.add(musica1);
        album.musicas.add(musica2);
        album.musicas.add(musica3);

        Musica musicaMaisPopular = album.getMusicaMaiorPopularidade();
        System.out.println("Música Mais polupar do Album: "+album.nome+"\n"+musicaMaisPopular.nome);
        Musica musicaMernorDuracao = album.getmusicaMenorDuracao();
        System.out.println("Música mais rápida"+"\n"+musicaMernorDuracao.nome+" Com duração de "+musicaMernorDuracao.duracaoEmSegundos+"seg");








    }

}