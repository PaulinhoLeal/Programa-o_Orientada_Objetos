import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Heroi heroi1 = new Heroi("monge",5,10);

        System.out.println("Heroi: "+heroi1.classe+"\n"+"Força: "+heroi1.força+"\n"+"Vida: "+heroi1.vida);

        Masmorra masmorra01 = new Masmorra("Templo de água", "Água", new ArrayList<Monstro>());
    }
}