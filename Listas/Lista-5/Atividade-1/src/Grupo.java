import java.util.ArrayList;

public class Grupo {

    private ArrayList<Heroi> herois;
    private int totalMoedasOuro;

    public Grupo()
    {
        this.herois = new ArrayList<>();
    }
    public void addHeroi(Heroi heroi)
    {
       this.herois.add(heroi);
       this.totalMoedasOuro = this.totalMoedasOuro + heroi.getQuantMoedasOuro();
       System.out.println("O Heroi "+heroi.getNomeHeroi()+" foi adicionado ao grupo");
    }
    public void removeHeroi(int idHeroi)
    {
        for(int i=0;i<herois.size();i++)
        {
            if(herois.get(i).getIdHeroi()==idHeroi)
            {
                this.totalMoedasOuro = this.totalMoedasOuro - herois.get(i).getQuantMoedasOuro();
                System.out.println("O Heroi "+herois.get(i).getNomeHeroi()+" Foi removido do grupo");
                herois.remove(i);
                return;
            }
        }
    }

    public ArrayList<Heroi> getHerois()
    {
        return herois;
    }
    public void setHerois(ArrayList<Heroi>herois)
    {
        this.herois=herois;
    }
    public int getTotalMoedasOuro()
    {
        return totalMoedasOuro;
    }
    public void setTotalMoedasOuro(int totalMoedasOuro)
    {
        this.totalMoedasOuro=totalMoedasOuro;
    }

}
