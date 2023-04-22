import java.util.ArrayList;

public class Restaurante {
    ArrayList<Prato>cardapio;

    public Restaurante() {
        this.cardapio.add(new Prato(1,"FRANGO",45.00));
        this.cardapio.add(new Prato(2,"CALABRESA",45.00));
        this.cardapio.add(new Prato(3,"PRATO DO DIA",45.00));
    }

    public static String retornarPratosNoCardapio(){
        StringBuilder pratos = new StringBuilder();
        for (int i = 0; i < cardapio.size(); i++) {


        }
        return pratos.toString();
    }
}
