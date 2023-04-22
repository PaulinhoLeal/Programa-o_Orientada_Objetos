import javax.swing.*;
import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private ArrayList<Pedido> pedidos;

    public Cliente(){

    }

    public Cliente(int id, String nome, ArrayList<Pedido> pedidos) {
        this.id = id;
        this.nome = nome;
        this.pedidos = pedidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedidos() {
      ;
    }

}
