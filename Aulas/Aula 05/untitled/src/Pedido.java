import java.util.ArrayList;

public class Pedido {
    private int id;
    private int idCliente;
    private ArrayList<Prato>pratos;

    public Pedido() {
        this.pratos = pratos=new ArrayList<>();
    }

    public Pedido(int id, int idCliente) {
        this.id = id;
        this.idCliente = idCliente;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void addPedidos(Prato pratos) {
        this.pratos.add(pratos);
    }
}
